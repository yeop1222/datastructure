package datastructure.ch04;

public class Q3 {

	public static void main(String[] args) {

		DoubledIntStack stk = new DoubledIntStack(4);
		
		stk.pushA(1);
		System.out.println(stk.toString());
		stk.pushB(4);
		System.out.println(stk.toString());
		stk.pushA(2);
		System.out.println(stk.toString());
		stk.pushA(3);
		System.out.println(stk.toString());
//		stk.pushA(4);
//		System.out.println(stk.toString());
		System.out.println(stk.popB());
		System.out.println(stk.toString());
		System.out.println(stk.isEmptyB());
		System.out.println(stk.popA());
		System.out.println(stk.toString());
		System.out.println(stk.sizeA());
		stk.pushB(100);
		stk.pushB(200);
		System.out.println(stk.toString());
//		stk.pushB(300);
		
	}
}
