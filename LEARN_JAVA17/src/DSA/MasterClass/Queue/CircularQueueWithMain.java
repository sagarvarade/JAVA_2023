package DSA.MasterClass.Queue;

public class CircularQueueWithMain {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(3);
		System.out.println("CQ is empty  :" + cq.isEmpty());
		System.out.println("CQ is full ? :" + cq.isFull());
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(4);
		cq.enQueue(5);
		System.out.println("CQ is empty  :" + cq.isEmpty());
		System.out.println("CQ is full ? :" + cq.isFull());
	}
}

class CircularQueue {
	int[] arr;
	int topOfQueue;
	int beginingOfQueue;
	int size;

	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size = size;
		this.topOfQueue = -1;
		this.beginingOfQueue = -1;
		System.out.println("The CQ is successfully created with size of :" + size);
	}

	// Is empty
	public boolean isEmpty() {
		if (topOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (topOfQueue + 1 == beginingOfQueue) {
			return true;
		} else if (beginingOfQueue == 0 && topOfQueue + 1 == size) {
			return true;
		} else {
			return false;
		}
	}

	// Enqueue
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("The CQ is full !");
		} else if (isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully Inserted " + value + " in the queue");
		} else {
			if (topOfQueue + 1 == size) {
				topOfQueue = 0;
			} else {
				topOfQueue++;
			}
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value + " in the queue.");
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("The CQ is empty");
			return -1;
		} else {
			int result = arr[beginingOfQueue];
			arr[beginingOfQueue] = 0;
			if (beginingOfQueue == topOfQueue) {
				beginingOfQueue = topOfQueue = -1;
			} else if (beginingOfQueue + 1 == size) {
				beginingOfQueue = 0;
			} else {
				beginingOfQueue++;
			}
			return result;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The CQ is empty");
			return -1;
		}
		else {
			return arr[beginingOfQueue];
		}
 	}
	
	public void deleteQueue()
	{
		arr=null;
		System.out.println("The CQ is successfully deleted.");
	}
}