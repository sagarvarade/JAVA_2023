package DSA.MasterClass.List.SinglyList;

public class SinglyListWithtMain {
	public static void main(String[] args) {
		SinglyList sl = new SinglyList();
		sl.createSinglyLinkedList(345);
		sl.insertToSinglyLinkedList(21, 1);
		sl.insertToSinglyLinkedList(22, 2);
		sl.insertToSinglyLinkedList(123, 3);
		sl.insertToSinglyLinkedList(231, 4);
		// System.out.println(sl.head.value);
		// System.out.println(sl.head.next.value);
		System.out.println(">>>>>");
		sl.traverseSinglyLinkedList();
		//sl.searchNode(21);
		//System.out.println(">>" + sl.searchNode(21) + "   " + sl.searchNode(32));
		sl.deletionOfNode(43);
		sl.traverseSinglyLinkedList();
		sl.deleteSLL();
		sl.traverseSinglyLinkedList();
	}
}

