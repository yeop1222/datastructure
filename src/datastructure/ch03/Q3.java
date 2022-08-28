package datastructure.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int cur=0;
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cur++] = i;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = {1,9,2,9,4,6,7,9};
		int[] idx = new int[a.length];
		
		System.out.print("검색할 숫자> ");
		int key = sc.nextInt();
		
		int cnt = searchIdx(a, a.length, key, idx);
		System.out.println("총 " + cnt + "개 발견!");
		if(cnt > 0) {
			for(int i=0; i<cnt; i++) {
				System.out.print(idx[i]+" ");
			}
			System.out.println("번째 index");
		}
	}
}
