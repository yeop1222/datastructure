package datastructure.ch04;

public class Q4 {

	public static void main(String[] args) {
		IntArrayQueue s = new IntArrayQueue(64);
		System.out.println(s.size());
		System.out.println(s.getCapacity());
		System.out.println(s.enque(1));
		System.out.println(s.enque(2));
		s.dump();
		System.out.println(s.deque());
		s.dump();
		System.out.println(s.peek());
	}
}
