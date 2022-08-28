package datastructure.ch03;

import java.util.Scanner;

public class Q5 {

	static int binSearchX(int[] a, int n, int key) {
		return 0;
	}
	
	public static void main(String[] args) {
		int[] x = {1,3,5,7,7,7,7,8,8,9,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값을 입력하세요> ");
		int key = sc.nextInt();
		
		int pl = 0;
		int pr = x.length-1;
		
		//binary search
		int pc=-1;
		while(pl<=pr) {
			pc = (pl+pr)/2;
			if(x[pc]==key) {
				break;
			}
			
			if(x[pc] > key) {
				pr = pc-1;
			}else {
				pl = pc+1;
			}
		}
		
		//값이 없는경우
		if(pl>pr) {
			System.out.println("없음");
			return;
		}
		
		//값이 있는경우 한칸씩 앞으로 가면서 검색
		int i;
		for(i=pc; i>=pl; i--) { //i=pc-1?
			if(x[i] != key) {
				break;
			}
		}
		
		System.out.println((i+1)+"번 index에 "+key+"가 처음으로 나옴");
	}
}
