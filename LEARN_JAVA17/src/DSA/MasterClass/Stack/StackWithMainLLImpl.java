package DSA.MasterClass.Stack;

import DSA.MasterClass.List.SinglyList.SinglyList;

public class StackWithMainLLImpl {
	public static void main(String[] args) {
		Stacke stck = new Stacke();
		System.out.println(stck.isEmpty());
		stck.push(1);stck.push(2);stck.push(3);
		System.out.println(stck.peek());
		System.out.println(stck.pop());
		System.out.println(stck.peek());
		System.out.println(stck.isEmpty());
	}
}

class Stacke {
	SinglyList sll;

	public Stacke() {
		sll = new SinglyList();
	}

	public void push(int value) {
		sll.insertToSinglyLinkedList(value, 0);
	}
	
	public boolean isEmpty() {
		if(sll.head==null) {
			return true;
		}
		else
			return false;
	}
	
	public int pop() {
		int result=-1;
		if(isEmpty()) {
			System.out.println("The stack is empty !");
		}
		else {
			result=sll.head.value;
			sll.deletionOfNode(0);
		}
		return result;
	}
	
	public int peek() {
		int result=-1;
		if(isEmpty()) {
			System.out.println("The stack is empty !");
			return -1;
		}
		else {
			result=sll.head.value;
			return result;
		}
	}
	public void delete() {
		sll.head=null;
		System.out.println("Stack is deleted");
	}
	
}