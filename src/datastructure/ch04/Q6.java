package datastructure.ch04;

public class Q6 {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(5);
		
		queue.enque("A");
		queue.enque("B");
		queue.enque("C");
		queue.enque("D");
		queue.dump();
		
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		
		queue.enque("E");
		queue.enque("F");
		queue.enque("G");
		queue.dump();

		System.out.println(queue.indexOf("D"));
		System.out.println(queue.indexOf("Z"));
		System.out.println(queue.search("D"));
		System.out.println(queue.search("Z"));
		
	}
}
