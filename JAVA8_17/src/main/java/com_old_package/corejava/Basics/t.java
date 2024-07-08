/*package com.corejava.Basics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.runner.Request;

import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class GitHubMRDownloader {

    private static final String GITHUB_API_URL = "https://api.github.com/repos/%s/%s/pulls/%d/files";
    private static final String ACCESS_TOKEN = "your_access_token";
    private static final String REPO_OWNER = "repo_owner";
    private static final String REPO_NAME = "repo_name";
    private static final int MR_NUMBER = 123; // Change this to your MR number

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(String.format(GITHUB_API_URL, REPO_OWNER, REPO_NAME, MR_NUMBER))
                .header("Authorization", "token " + ACCESS_TOKEN)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                JSONArray filesArray = new JSONArray(responseBody.string());
                for (int i = 0; i < filesArray.length(); i++) {
                    JSONObject fileObject = filesArray.getJSONObject(i);
                    String filename = fileObject.getString("filename");
                    String downloadUrl = fileObject.getString("raw_url");

                    downloadFile(filename, downloadUrl);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadFile(String filename, String downloadUrl) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(downloadUrl)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            File file = new File(filename);
            try (FileOutputStream fos = new FileOutputStream(file)) {
                if (response.body() != null) {
                    fos.write(response.body().bytes());
                }
            }
            System.out.println("Downloaded: " + filename);
        }
    }
}
*/