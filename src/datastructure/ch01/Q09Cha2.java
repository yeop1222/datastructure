package datastructure.ch01;

import java.util.Scanner;

public class Q09Cha2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a> ");
		int a = sc.nextInt();
		int b = Integer.MIN_VALUE;
		
		do {
			System.out.print("b> ");
			b = sc.nextInt();
		}while(b<=a);
		
		System.out.println("b-a="+(b-a));
	}
}
