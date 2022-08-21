package datastructure.ch01;

public class Q12Plusdan {
	public static void main(String[] args) {
		
		//첫줄
		System.out.print("+|");
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d",i);
		}
		//둘째줄
		System.out.println("\n-+---------------------------");
		//3+
		for(int i=1; i<=9;i++) {
			System.out.print(i+"|");
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
	}
}
