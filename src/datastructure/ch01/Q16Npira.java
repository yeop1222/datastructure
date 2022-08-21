package datastructure.ch01;

import java.util.Scanner;

public class Q16Npira {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n> ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<2*n; j++) {
				if(j>n-i && j-i<n) {  
					System.out.print(i%10);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
