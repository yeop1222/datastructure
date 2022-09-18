package datastructure.ch04;

public class Q1 {
	public static void main(String[] args) {
		IntStack stk = new IntStack(5);
		
		System.out.println("Capacity="+stk.getCapacity());
		
		System.out.println("IsEmpty="+stk.isEmpty());
		System.out.println("IsFull="+stk.isFull());
		stk.dump();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		
		System.out.println("Peek="+stk.peek());
		System.out.println("Size="+stk.size());
		stk.dump();
		System.out.println("IsEmpty="+stk.isEmpty());
		System.out.println("IsFull="+stk.isFull());
		
		stk.push(5);
		System.out.println("Peek="+stk.peek());
		System.out.println("Size="+stk.size());
		stk.dump();
		System.out.println("IsEmpty="+stk.isEmpty());
		System.out.println("IsFull="+stk.isFull());
		
		System.out.println("IndexOf(2)="+stk.indexOf(2));
		System.out.println("IndexOf(5)="+stk.indexOf(5));
//		stk.push(6); //overflow
		
		System.out.println("pop="+stk.pop());
		System.out.println("pop="+stk.pop());
		stk.dump();
		System.out.println("size="+stk.size());
		stk.clear();
		stk.dump();
		System.out.println("size="+stk.size());
//		System.out.println("pop="+stk.pop()); //empty
		
	}
}
