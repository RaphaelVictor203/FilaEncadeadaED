package view;

import controller.DynamicQueueDeque;
import controller.EmptyQueueException;

public class Main {

	public static void main(String[] args) throws EmptyQueueException {
		
		DynamicQueueDeque deque = new DynamicQueueDeque();
		deque.enqueue('A', 1);
		deque.enqueue('E', 1);
		deque.enqueue('I', 1);
		deque.enqueue('O', 1);
		deque.enqueue('B', 2);
		deque.enqueue('C', 2);
		for(int i=0; i<4; i++) {
			System.out.println(deque.showFront(1));
			deque.dequeue(1);
		}
		for(int i=0; i<2; i++) {
			System.out.println(deque.showFront(2));
			deque.dequeue(2);
		}
	}

}
