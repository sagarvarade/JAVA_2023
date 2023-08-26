package DSA.MasterClass.List.DoublyLinkedList;

public class DoublyLinkedListWithMain {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createDLL(4);
		dll.insertDLL(2, 0);
		dll.insertDLL(72, 1);
		dll.insertDLL(23, 7);
		System.out.println(dll.head.value);
		System.out.println(dll.head.next.value);
		dll.traverseDLL();
		// dll.reverseTraversalDLL();
		System.out.println(dll.searchNode(72));
		System.out.println(dll.searchNode(777));
		// dll.deleteEntireDLL();
	}
}

class DoublyLinkedList {
	DoublyNode head;
	DoublyNode tail;
	int size;

	public DoublyNode createDLL(int nodeValue) {
		head = new DoublyNode();
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		newNode.next = null;
		newNode.prev = null;
		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// Insert method to DLL
	public void insertDLL(int nodeValue, int location) {
		DoublyNode newNode = new DoublyNode();
		newNode.value = nodeValue;
		if (head == null) {
			createDLL(nodeValue);
			return;
		} else if (location == 0) {
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		} else if (location >= size) {
			newNode.next = null;
			tail.next = newNode;
			newNode.prev = tail;
		} else {
			DoublyNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.prev = tempNode;
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			newNode.next.prev = newNode;
		}
		size++;
	}

	// Traversing list
	public void traverseDLL() {
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println();
	}

	// Reversal Traverse
	public void reverseTraversalDLL() {
		if (head != null) {
			DoublyNode tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1)
					System.out.print(" <- ");
				tempNode = tempNode.prev;
			}
			System.out.println();
		}
	}

	// Search Node
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			DoublyNode tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("The node is found at location :" + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Not found");
		return false;
	}

	// deletion of Node from DLL
	public void deleteNodeDLL(int location) {
		if (head == null) {
			System.out.println("The DLL does not exist !");
			return;
		} else if (location == 0) {
			if (size == 1) {
				head = null;
				tail = null;
				size--;
				return;
			} else {
				head = head.next;
				head.prev = null;
				size--;
			}
		} else if (location >= size) {
			DoublyNode tempNode=tail.prev;
			if (size == 1) {
				head = null;
				tail = null;
				size--;
				return;
			}
			else {
				tempNode.next=null;
				tail=tempNode;
				size--;
			}
		}
		else {
			DoublyNode tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.prev=tempNode;
			size--;
		}
	}

	//Deleting entire DLL
	public void deleteEntireDLL() {
		DoublyNode tempNode=head;
		for(int i=0;i<size;i++) {
			tempNode.prev=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
		System.out.println("The DLL has been deleted!");
	}
}