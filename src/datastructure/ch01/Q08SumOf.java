package datastructure.ch01;

import java.util.Scanner;

public class Q08SumOf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a> ");
		int a = sc.nextInt();
		System.out.print("b> ");
		int b = sc.nextInt();
		
		System.out.println("sum=="+sumof(a,b));
	}
	
	static int sumof(int a, int b) {

		int min = a<b?a:b;
		int max = a>b?a:b;
		int sum=0;
		
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
