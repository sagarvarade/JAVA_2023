package DSA.MasterClass.List;

class SingleListNode {
	public int value;
	public SingleListNode next;
}

public class SinglyLinkedList {
	public SingleListNode head;
	public SingleListNode tail;
	public int size;

	public SingleListNode createSinlglyLinkedList(int value) {
		head = new SingleListNode();
		SingleListNode node = new SingleListNode();
		node.next = null;
		node.value = value;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertInLinkedList(int nodeValue, int location) {
		SingleListNode node = new SingleListNode();
		node.value = nodeValue;
		if (head == null) {
			createSinlglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			SingleListNode tempnode = head;
			int index = 0;
			while (index < location - 1) {
				tempnode = tempnode.next;
				index++; 
			}
			SingleListNode nextNode = tempnode.next;
			tempnode.next = node;
			node.next = nextNode;
		}
		size++;
	}

	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.createSinlglyLinkedList(10);
		System.out.println(sl.head.value);
		sl.insertInLinkedList(20, 2);
		sl.insertInLinkedList(30, 3);
		System.out.println(sl.head.next.value);
		System.out.println(sl.head.next.next.value);
	}

}
