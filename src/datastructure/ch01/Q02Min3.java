package datastructure.ch01;

import java.util.Scanner;

public class Q02Min3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("a> ");
		int a = sc.nextInt();
		System.out.print("b> ");
		int b = sc.nextInt();
		System.out.print("c> ");
		int c = sc.nextInt();
		
		System.out.println("min=="+min3(a,b,c));
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b<min)	min = b;
		if (c<min)	min = c;
		
		return min;
	}
}
