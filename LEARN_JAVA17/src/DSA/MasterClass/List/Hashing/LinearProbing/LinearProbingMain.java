package DSA.MasterClass.List.Hashing.LinearProbing;

public class LinearProbingMain {
	public static void main(String[] args) {
		LinearProbing lB=new LinearProbing(13);
		lB.insertInHashTable("The");
		lB.insertInHashTable("quick");
		lB.insertInHashTable("brown");
		lB.insertInHashTable("fox");
		lB.insertInHashTable("over");
		lB.deleteKeyHashTable("fox");
	    lB.displayHashTable();
	}
}
