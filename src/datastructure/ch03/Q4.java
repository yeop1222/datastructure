package datastructure.ch03;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int[] x = {1,2,3,5,6,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값을 입력하세요> ");
		int key = sc.nextInt();
		
		int pl = 0;
		int pr = x.length-1;
		
		//첫줄
		System.out.print("\n  |");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%3d",i);
		}
		//둘째줄
		System.out.print("\n--+");
		for(int i=0; i<x.length; i++) {
			System.out.print("---");
		}
		
		//3+
		while(pl<=pr) {
			int pc = (pl+pr)/2;
			
			//홀수번째줄
			System.out.print("\n |");
			for(int i=0; i<=pr; i++) {
				if(i==pr && i==pl)	System.out.print(" <+>");
				else if(i==pl) 		System.out.print(" <-");
				else if(i==pc)		System.out.print("  +");
				else if(i==pr)		System.out.print(" ->");
				else 				System.out.print("   ");
			}
			
			//짝수번째줄
			System.out.print("\n |");
			for(int i=0; i<x.length; i++) {
				System.out.printf("%3d",x[i]);
			}
			
			
			if(x[pc] == key) {
				System.out.println("\n" + key + "는 x[" + pc + "]에 있습니다.");
				return;
			}
			
			if(x[pc] > key) {
				pr = pc-1;
			}else {
				pl = pc+1;
			}
		}
		System.out.println("\n찾으려는 값이 존재하지 않습니다.");
		
	}
}
