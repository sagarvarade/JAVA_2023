package DesignPatterns.XMLXSL;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {
	public static void main(String[] args) throws IOException {
		main3(args);
	}
	
	 public static void main3(String[] args) throws IOException {
	        // JSON strings to merge
		 String json1String = "{\"tieredData\":{\"fields\":{\"DT_FORMATED\":{\"name\":\"DT_FORMATED\",\"value\":\"15082023\",\"tiers\":{\"IN\":\"15082023\"}},\"CANCEL_REASON\":{\"name\":\"CANCEL_REASON\",\"tiers\":{\"IN\":\"HHHHHHHH\"}},\"CONDCODE\":{\"name\":\"CONDCODE\",\"tiers\":{\"IN\":null}}}}}";

	        String json2String = "{\"tieredData\":{\"fields\":{\"DT_FORMATED\":{\"name\":\"DT_FORMATED\",\"value\":\"15082023\",\"tiers\":{\"IN\":\"15082023\"}},\"CONDCODE\":{\"name\":\"CONDCODE\",\"tiers\":{\"IN\":12878873}}}}}";


	        // Parse the JSON strings into JsonNode objects
	        ObjectMapper objectMapper = new ObjectMapper();
	        JsonNode json1 = objectMapper.readTree(json1String);
	        JsonNode json2 = objectMapper.readTree(json2String);

	        // Merge the JSON objects recursively
	        JsonNode mergedJson = mergeJson(json1, json2, objectMapper);

	        // Convert the merged JSON to a string
	        String mergedJsonString = mergedJson.toString();

	        // Print the merged JSON string
	        System.out.println(mergedJsonString);
	    }

	    public static JsonNode mergeJson(JsonNode node1, JsonNode node2, ObjectMapper objectMapper) {
	        if (node1.isObject() && node2.isObject()) {
	            ObjectNode mergedNode = objectMapper.createObjectNode();

	            Iterator<Entry<String, JsonNode>> fields1 = node1.fields();
	            while (fields1.hasNext()) {
	                Entry<String, JsonNode> entry = fields1.next();
	                String key = entry.getKey();
	                JsonNode value1 = entry.getValue();

	                if (node2.has(key)) {
	                    JsonNode value2 = node2.get(key);
	                    mergedNode.set(key, mergeJson(value1, value2, objectMapper));
	                } else {
	                    mergedNode.set(key, value1);
	                }
	            }

	            Iterator<Entry<String, JsonNode>> fields2 = node2.fields();
	            while (fields2.hasNext()) {
	                Entry<String, JsonNode> entry = fields2.next();
	                String key = entry.getKey();
	                JsonNode value2 = entry.getValue();

	                if (!node1.has(key)) {
	                    mergedNode.set(key, value2);
	                }
	            }

	            return mergedNode;
	        } else if (node1.isArray() && node2.isArray()) {
	            ArrayNode mergedArray = objectMapper.createArrayNode();
	            for (JsonNode element1 : node1) {
	                mergedArray.add(element1);
	            }
	            for (JsonNode element2 : node2) {
	                mergedArray.add(element2);
	            }
	            return mergedArray;
	        } else {
	            // If not both objects or arrays, prefer the value from the second node
	            return node2;
	        }
	    }
}
