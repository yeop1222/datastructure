package datastructure.ch02;

import java.util.Random;

public class Q1 {
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] height = new int[2+rand.nextInt(10)];
		for(int i=0; i<height.length ; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		
		System.out.println("max===" + maxOf(height));
	}
}
