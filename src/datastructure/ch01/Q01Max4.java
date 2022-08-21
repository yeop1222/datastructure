package datastructure.ch01;

import java.util.Scanner;

public class Q01Max4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a> ");
		int a = sc.nextInt();
		System.out.print("b> ");
		int b = sc.nextInt();
		System.out.print("c> ");
		int c = sc.nextInt();
		System.out.print("d> ");
		int d = sc.nextInt();
		
		System.out.println("max=="+max4(a,b,c,d));
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b>max)	max = b;
		if (c>max)	max = c;
		if (d>max)	max = d;
		
		return max;
	}
}
