package DSA.MasterClass.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	BinaryNode root;

	public BinaryTreeLL() {
		this.root = null;
	}
	// PreOrder Traversal
	void preOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		System.out.println(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	// InOrder Traversal
	void inOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value+" ");
		inOrder(node.right);
	}
	
	// PostOrder Traversal
	public void postOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value+" ");
	}
	
	// level Order 
	void levelOrder() {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			System.out.println(presentNode.value+" ");
			if(presentNode.left!=null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right!=null) {
				queue.add(presentNode.right);
			}
		}
	}
	
	//Search Method
	public void search(String value) {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			if(presentNode.value==value) {
				System.out.println("The value :"+value+" Found in tree");
				return;
			}
			else {
				if(presentNode.left!=null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right!=null) {
					queue.add(presentNode.right);
				}
			}
		}
		System.out.println("The value did not found");
	}
	
	//Insert into binary Node
	void insert(String value) {
		BinaryNode newNode=new BinaryNode();
		newNode.value=value;
		if(root==null) {
			root=newNode;
			System.out.println("Inserted new node at Root");
			return;
		}
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			if(presentNode.left==null) {
				presentNode.left=newNode;
				System.out.println("Successfully inserted "+value);
				break;
			}
			else if(presentNode.right==null) {
				presentNode.right=newNode;
				System.out.println("Successfully inserted "+value);
				break;
			}
			else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}
	}
	
	//Get Deepest node
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.add(root);
		BinaryNode presentNode=null;
		while(!queue.isEmpty()) {
			presentNode=queue.remove();
			if(presentNode.left!=null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right!=null) {
				queue.add(presentNode.right);
			}
		}
		return presentNode;
	}
	
	//Delete deepest node
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode,presentNode=null;
		while(!queue.isEmpty()) {
			previousNode=presentNode;
			presentNode=queue.remove();
			if(presentNode.left==null) {
				previousNode.right=null;
				return;
			}
			else if(presentNode.right==null) {
				previousNode.left=null;
				return;
			}
			queue.add(presentNode.left);
			queue.add(presentNode.right);
		}
	}
	
	// Delete Given node
	void deleteNode(String value) {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			if(presentNode.value==value) {
				presentNode.value=getDeepestNode().value;
				deleteDeepestNode();
				System.out.println("The node is deleted !");
				return;
			}else {
				if(presentNode.left!=null) queue.add(presentNode.left);
				if(presentNode.right!=null) queue.add(presentNode.right);
			}
		}
		System.out.println("The node node does not exist in the BT.");
	}
	
	// Delete Entire binary tree
	void deleteBT() {
		root=null;
		System.out.println("The binary tree has been deleted");
	}
}
