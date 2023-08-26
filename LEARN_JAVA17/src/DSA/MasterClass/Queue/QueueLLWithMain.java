package DSA.MasterClass.Queue;

import DSA.MasterClass.List.SinglyList.SinglyList;

public class QueueLLWithMain {
	public static void main(String[] args) {
		QueueLL ql = new QueueLL();
		System.out.println("Is Empty " + ql.isEmpty());
		ql.enQueue(10);
		ql.enQueue(20);
		ql.enQueue(30);
		System.out.println("Deque :"+ql.deQueue());
		ql.list.traverseSinglyLinkedList();
		System.out.println("\nPeek :"+ql.peek());
		System.out.println("Peek :"+ql.peek());
	}
}

class QueueLL {
	SinglyList list;

	public QueueLL() {
		list = new SinglyList();
		System.out.println("The queue is successfully created.");
	}

	// isEmpty
	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int value) {
		list.insertToSinglyLinkedList(value, list.size);
		System.out.println("Successfully inserted " + value + " in the queue.");
	}

	public int deQueue() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("The queue is empty");
		} else {
			value = list.head.value;
			list.deletionOfNode(0);
		}
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Queue is empty");
			return -1;
		}else {
			return list.head.value;
		}
	}
	
	public void deleteQueue() {
		list.head=null;
		list.tail=null;
		System.out.println("The queue is successfully deleted.");
	}
}