package datastructure.ch01;

import java.util.Scanner;

public class Q06SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n> ");
		int n = sc.nextInt();
		
		int sum=0;
		int i=1;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("i=="+i);
		System.out.println("sum=="+sum);
	}
}
