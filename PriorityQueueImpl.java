package PriorityQueue;

class Node {
	int val;
	int priority;
	Node next = null;
}

public class PriorityQueueImpl {
	
	Node head = newNode(5, 0);
	
	public Node newNode(int data, int priority) {
		Node node = new Node();
		node.val = data;
		node.priority = priority;
		node.next = null;
		return node;
	}
	
	public int isEmpty() {
	    return ((head) == null)?1:0;
	}
	
	public int Del_Min() {
		if(isEmpty() == 0) {
			head = head.next;
		}
		return head.val;
	}
	
	public Node Insert(int val, int priority) {
		
		Node temp = newNode(val, priority);
		if(isEmpty() == 0) {
			Node first = head;
			if(head.priority > priority) {
				temp.next = head;
				head = temp;
			} else {
				while(first.next != null && first.next.priority < priority) {
					first = first.next;
				}
				temp.next = first.next;
				first.next = temp;
			}
		} else {
			head = temp;
		}
		System.out.println("Inserted the value: " + val + " with priority:" + priority);
		return head;
	}
	
	public Node Insert(int val) {
		Node temp = newNode(val, 19);
		if(isEmpty() == 0) {
			Node first = head;
			if(head.priority > 19) {
				temp.next = head;
				head = temp;
			} else {
				while(first.next != null && first.next.priority < 19) {
					first = first.next;
				}
				temp.next = first.next;
				first.next = temp;
			}
		} else {
			head = temp;
		}
		System.out.println("Inserted the value: " + val + " with default priority");
		return head;
	}
	
	public Node Decrease_Priority(int val, int priority) {
		Node first = head;
		Node prev = null;
		if(isEmpty() == 0) {
			while(first.val != val && first!= null) {
				prev = first;
				first = first.next;
			}
			prev.next = first.next;
			Insert(val, first.priority-priority);
		}
		System.out.println("Decreased the priority by " + priority);
		return head;	
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node node = head;
		while(node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
		System.out.println();
	}
	
}
