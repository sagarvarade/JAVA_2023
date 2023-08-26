package DSA.MasterClass.LLInterviewQuestions;

import java.util.HashSet;

public class Questions {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.createLL(1);
		ll.insertNode(9);
		ll.insertNode(5);
		ll.insertNode(10);
		ll.insertNode(2);
		ll.traversalLL();
		Questions qs=new Questions();
		// Delete Duplicate Nodes
		qs.deleteDups(ll);
		
		// Search Nth to last
		Node nthToLast = qs.nthToLast(ll,2);
		System.out.println(nthToLast.value);
		
		// Q3 Partition 
		LinkedList partition = qs.partition(ll, 4);
		partition.traversalLL();
		ll.traversalLL();
		
	}
	
	LinkedList partition(LinkedList ll, int x) {
		Node currentNode=ll.head;
		ll.tail=ll.head;
		while(currentNode!=null) {
			Node next=currentNode.next;
			if(currentNode.value<x) {
				currentNode.next=ll.head;
				ll.head=currentNode;
			} else {
				ll.tail.next=currentNode;
				ll.tail=currentNode;
			}
			currentNode=next;
		}
		ll.tail.next=null;
		return ll;
	}
	
	private Node nthToLast(LinkedList ll, int n) {
		Node p1=ll.head;
		Node p2=ll.head;
		for(int i=0;i<n;i++) {
			if(p2==null) return null;
			p2=p2.next;
		}
		while(p2!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}

	void deleteDups(LinkedList ll) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node current = ll.head;
		Node prev = null;
		while(current!=null) {
			int curval=current.value;
			if(hs.contains(curval)) {
				prev.next=current.next;
				ll.size--;
			}
			else
			{
				hs.add(curval);
				prev=current;
			}
			current=current.next;
		}
	}
	
	
	
}
