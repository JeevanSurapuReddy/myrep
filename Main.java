package PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueueImpl p = new PriorityQueueImpl();
		p.Insert(4, 6);
		p.Insert(19, 19);
		p.Insert(6, 6);
		p.Insert(1, 1);
		p.Insert(11, 11);
		p.Insert(9, 9);
		p.print();
		System.out.println();
		System.out.println("Deleted the node " + p.Del_Min() + " with least priority");
		p.print();
		System.out.println();
		p.Insert(22);
		p.Insert(96);
		p.print();
		System.out.println();
		p.Decrease_Priority(9, 5);
		p.print();
		
	}

}
