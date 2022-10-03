package datastructure.ch04;

public class Q7 {
	public static void main(String[] args) {
		IntDeque deque = new IntDeque(5);
		
		System.out.println(deque.size());
		System.out.println(deque.getCapacity());
		
		System.out.println(deque.enqueFront(1));
		System.out.println(deque.enqueFront(0));
		System.out.println(deque.enqueRear(2));
		System.out.println(deque.enqueRear(3));
		deque.dump();
		
		System.out.println(deque.enqueFront(-1));
		deque.dump();
//		System.out.println(deque.enqueFront(-2)); //Overflow
		
		System.out.println(deque.dequeRear());
		System.out.println(deque.dequeFront());
		deque.dump();
	}
}
