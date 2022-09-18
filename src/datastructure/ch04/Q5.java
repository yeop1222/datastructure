package datastructure.ch04;

public class Q5 {
	public static void main(String[] args) {
		IntQueue que = new IntQueue(12);
//		que.tempInit();
		que.dump();
		System.out.println(que.search(35));
		System.out.println(que.search(56));
		System.out.println(que.search(99));
		System.out.println(que.indexOf(35));
		System.out.println(que.indexOf(56));
		System.out.println(que.indexOf(99));
	}
}
