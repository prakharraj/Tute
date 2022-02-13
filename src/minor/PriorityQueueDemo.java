package minor;// Java program to demonstrate the
// working of PriorityQueue
import minor.Employee;

import java.util.*;

class PriorityQueueDemo {
	
	// minor.Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(Comparator.comparing(e->e.getName()));

		// Adding items to the pQueue using add()
		pQueue.add(new Employee(1,"z",600));
		pQueue.add(new Employee(3,"x",500));
		pQueue.add(new Employee(2,"a",40));

		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}
