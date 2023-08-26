package DSA.MasterClass.Tree.BinaryTreeArray;

public class BinaryTreeArrayMain {
	public static void main(String[] args) {
		BinaryTree newBinaryTree = new BinaryTree(5);
		newBinaryTree.insert("1");newBinaryTree.insert("2");
		newBinaryTree.insert("3");newBinaryTree.insert("4");
		newBinaryTree.insert("5");
		newBinaryTree.insert("6");
		
		newBinaryTree.preOrderTraverse(1);
		System.out.println("\n>>>");
		newBinaryTree.inOrder(1);
		System.out.println("\n>>>");
		newBinaryTree.postOrder(1);
		System.out.println("\n>>>");
		newBinaryTree.inOrder(1);
		System.out.println("\n>>>");
		newBinaryTree.levelOrder();
		System.out.println("\nSearch : "+newBinaryTree.search("3"));
		newBinaryTree.delete("3");
		System.out.println("\nSearch : "+newBinaryTree.search("3"));
		System.out.println("\nSearch : "+newBinaryTree.search("90"));
		newBinaryTree.deleteEntireTree();
	}
}
