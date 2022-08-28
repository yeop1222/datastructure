package datastructure.ch03;

import java.util.Scanner;

public class Q1 {

	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		
		a[n] = key;

		for(i=0 ; ; i++) {
			if(a[i] == key)
				break;
		}
		return i==n?-1:i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = {6,4,3,2,1,2,8,0};
		
		System.out.print("검색할 값> ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, 7, key);
		
		if(idx==-1)
			System.out.println("없음");
		else
			System.out.println(idx+"번째 index");
	}
}
