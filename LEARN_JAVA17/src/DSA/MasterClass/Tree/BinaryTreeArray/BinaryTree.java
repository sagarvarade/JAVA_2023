package DSA.MasterClass.Tree.BinaryTreeArray;

public class BinaryTree {
	String[] arr;
	int lastUsedIndex;
	public BinaryTree(int size) {
		arr=new String[size+1];
		this.lastUsedIndex=0;
		System.out.println("Blank tree of size: "+size+"  has been created.");
	}
	
	
	// isFull
	boolean isFull() {
		if(arr.length-1==lastUsedIndex) {
			return true;
		}
		else
			return false;
	}
	
	// Insert method
	void insert(String value) {
		if(!isFull()) {
			arr[lastUsedIndex+1]=value;
			lastUsedIndex++;
			System.out.println("The value of "+value+" has been inserted.");
		}
		else {
			System.out.println("The Binary Tree is full");
		}
	}

	// preOrder traversal
	public void preOrderTraverse(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		System.out.print(arr[index]+" ");
		preOrderTraverse(index*2);
		preOrderTraverse(index*2+1);
	}
	
	// In order traversal
	public void inOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		inOrder(index*2);
		System.out.print(arr[index]+" ");
		inOrder(index*2+1);
	}
	// Level order traversal
	public void levelOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		inOrder(index*2);
		inOrder(index*2+1);
		System.out.print(arr[index]+" ");
	}
	//Post Order traversal
	public void postOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		postOrder(index*2);
		postOrder(index*2+1);
		System.out.print(arr[index]+" ");
	}
	
	//Level order two
	public void levelOrder() {
		for(int i=1;i<=lastUsedIndex;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int search(String value) {
		for(int i=1;i<=lastUsedIndex;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	// Delete from binary tree
	public void delete(String value) {
		int location=search(value);
		if(location==-1) {
			return;
		}else {
			arr[location]=arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("The node successfully deleted.");
		}
	}
	
	// Delete entire binarytee
	public void deleteEntireTree()
	{
		try {
			arr=null;
			System.out.println("Entire Tree deleted");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
