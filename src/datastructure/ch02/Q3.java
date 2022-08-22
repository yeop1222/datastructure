package datastructure.ch02;

public class Q3 {
	public static void main(String[] args) {

		int[] arr = new int[]{2,5,1,3,9,6,7};
//		int[] arr = new int[]{2,5,1,3,9,6,7,8};
//		int[] arr = new int[]{2,5,1,3,9,6,7,8,4};
		
		System.out.println("sum=="+sumOf(arr));
	}
	
	static int sumOf(int[] a) {
		int sum=0;
		for(int i : a) {
			sum+=i;
		}
		return sum;
	}
}
