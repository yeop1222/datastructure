package datastructure.ch01;

import java.util.Scanner;

public class Q07GaussSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n> ");
		int n = sc.nextInt();
		
		System.out.println("sum=="+((1+n)*n/2));
	}
}
