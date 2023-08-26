package DSA.MasterClass.Stack;

public class StackWithMainArrayImpl {
	public static void main(String[] args) {
		Stack stck = new Stack(4);
		System.out.println(stck.isEmpty());
		System.out.println(stck.isFull());
		stck.push(12);
		stck.push(13);
		stck.push(14);
		stck.push(15);
		stck.push(16);
		int pop = stck.pop();
		int peek = stck.peek();
		System.out.println(pop);
		System.out.println(peek);
		stck.deleteStack();
		System.out.println(stck.isEmpty());
		System.out.println(stck.isFull());

	}
}

class Stack { 
	int[] arr;
	int topOfStack;

	public Stack(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The Stack is created with size of :" + size);
	}

	public boolean isEmpty() {
		if (this.topOfStack == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (this.topOfStack == arr.length - 1) {
			System.out.println("The stack is full !");
			return true;
		} else
			return false;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("The stack is full !");
		} else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("The value in inserted !" + value);
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int topStack = arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The Stack is empty !");
			return -1;
		}
		else {
			return arr[topOfStack];
		}
	}
	public void deleteStack() {
		arr=null;
		System.out.println("The stack is successfully deleted ");
	}
}
