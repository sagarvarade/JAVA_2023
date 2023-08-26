package DSA.MasterClass.Tree;

public class TreeWithMain {
	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");

		TreeNode tea = new TreeNode("Tea");
		TreeNode cofee = new TreeNode("Coffee");

		TreeNode wine = new TreeNode("Wine");
		TreeNode beer = new TreeNode("Beer");

		hot.addChild(tea);
		hot.addChild(cofee);

		cold.addChild(beer);
		cold.addChild(wine);

		drinks.addChild(hot);
		drinks.addChild(cold);
		
		System.out.println(drinks.print(0));
	}
}
