package datastructure.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] x = {15,27,39,77,92,108,121};

		System.out.print("찾을 값을 입력하세요> ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0)
//			System.out.println("없음");
			System.out.println("삽입 포인트=="+ (-idx-1));
		else
			System.out.println("index=="+idx);
	}
	
	
}
