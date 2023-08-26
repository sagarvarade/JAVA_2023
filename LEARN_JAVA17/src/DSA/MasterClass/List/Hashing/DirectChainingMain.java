package DSA.MasterClass.List.Hashing;

public class DirectChainingMain {
	public static void main(String[] args) {
		DirectChaining directChain = new DirectChaining(15);
		directChain.insertHashTable("The Artical");
		directChain.insertHashTable("jhsjkd");
		directChain.insertHashTable("aakash");
		directChain.insertHashTable("wordk");
		directChain.insertHashTable("dhkdiuueu");
		directChain.insertHashTable("aakash");
		directChain.displayHashTable();

		directChain.deleteKeyHashTable("aakash");
		directChain.displayHashTable();
	}
}
