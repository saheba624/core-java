package collection;

import java.util.LinkedList;

public class TestQueue {
	

		public static void main(String[] args) {
			LinkedList queue = new LinkedList();

			queue.offer("Ram");
			queue.offer("Shyam");
			queue.offer("Jai");
			queue.offer("Vijay");

			System.out.println(queue.peek());

			System.out.println(queue.poll());
			System.out.println(queue.poll());
			System.out.println(queue.poll());

		}

	}


