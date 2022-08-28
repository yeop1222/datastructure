package datastructure.ch03;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int[] x = {6,4,3,2,1,9,8};
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값을 입력하세요> ");
		int key = sc.nextInt();
		
		//첫줄
		System.out.print("\n  |");
		for(i=0; i<x.length; i++) {
			System.out.printf("%2d",i);
		}
		//둘째줄
		System.out.print("\n--+");
		for(i=0; i<x.length; i++) {
			System.out.print("--");
		}
		
		//3+
		for(i=0; i<x.length; i++) {
			//홀수줄
			System.out.print("\n  |");
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			//짝수줄
			System.out.printf(" *\n%2d|",i);
			for(int j=0; j<x.length; j++) {
				System.out.printf("%2d",x[j]);
			}
			
			if(x[i] == key) {
				break;
			}
		}
		
		if(i==x.length) {
			System.out.println("\n없음");
		}else {
			System.out.println("\nindex"+i+"에 있음");
		}
		
		
	}
}
