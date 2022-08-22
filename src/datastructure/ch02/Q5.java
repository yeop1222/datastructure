package datastructure.ch02;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {

		int[] a = new int[]{2,5,1,3,9,6,7};
//		int[] a = new int[]{2,5,1,3,9,6,7,8};
//		int[] a = new int[]{2,5,1,3,9,6,7,8,4};
		int[] b = new int[8];
	
		rcopy(a,b);
		System.out.println(Arrays.toString(b));
		
//		Arrays.copyOf(a, b.length);
	}
	
	static void rcopy(int[] a, int[] b) {
		if(a.length > b.length) throw(new ArrayIndexOutOfBoundsException());
		
		for(int i=0; i<a.length; i++) {
			b[a.length-1-i] = a[i];
		}
		for(int i=0; i<b.length-a.length; i++) {
			b[i+a.length] = 0;
		}
	}
}
