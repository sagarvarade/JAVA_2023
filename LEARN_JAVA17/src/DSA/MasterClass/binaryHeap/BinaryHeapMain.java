package DSA.MasterClass.binaryHeap;

public class BinaryHeapMain {
	public static void main(String[] args) {
		BinaryHeap bn = new BinaryHeap(5);
		System.out.println("Size of heap : " + bn.sizeOfBP());
		System.out.println(bn.peek());
		bn.levelOrder();

		bn.insert(10, "Min");
		bn.insert(5, "Min");
		bn.insert(15, "Min");
		bn.insert(1, "Max");
		bn.levelOrder();
		bn.extractHeadOfBp("Min");
		bn.levelOrder();

		bn.deleteEntireBH();
	}
}
