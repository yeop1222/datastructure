package datastructure.ch05;

import java.util.Scanner;

public class Q2 {

	static int gcd(int x, int y) {
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		while(max%min != 0) {
			int r = max%min;
			max = min;
			min = r;
		}
			
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("x> ");
		int x = stdin.nextInt();
		System.out.print("y> ");
		int y = stdin.nextInt();
		
		System.out.println("GCD = "+gcd(x,y));
	}
}
