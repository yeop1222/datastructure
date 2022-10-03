package datastructure.ch05;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 입력> ");
		int x = stdin.nextInt();
		
		System.out.println(x+"! = " + factorial(x));
	}
	
	static int factorial(int x) {
		int answer = 1;
		for(int i=1; i<=x; i++)
			answer *= i;
		return answer;
	}
}
