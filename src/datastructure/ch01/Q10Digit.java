package datastructure.ch01;

import java.util.Scanner;

public class Q10Digit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=0;
		
		//양의 정수를 입력받기
		do {
			System.out.print("n> ");
			n = sc.nextInt();
		}while(n<=0);
		
		//자릿수 출력하기
		int digit=0;
		while(n>0) {
			n/=10;
			digit++;
		}
		System.out.println("digit=="+digit);
	}
}
