package datastructure.ch02;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		int[] arr = new int[]{2,5,1,3,9,6,7};
//		int[] arr = new int[]{2,5,1,3,9,6,7,8};
//		int[] arr = new int[]{2,5,1,3,9,6,7,8,4};
		
		for(int i=0; i<arr.length/2;i++) {
			System.out.println(Arrays.toString(arr));
			System.out.printf("a[%d]와 a[%d]를 교환\n", i, arr.length-1-i);
			
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
