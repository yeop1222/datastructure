package datastructure.ch05;


public class Q3 {

	static int gcd(int x, int y) {
		if (y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	
	static int gcdArray(int[] a) {
		if(a.length <= 0) return -1;
		
		int gcd = a[0];
		
		for(int i : a) {
			gcd = gcd(gcd,i);
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		
		int[] a = {27,18,81,45};
		
		System.out.println("GCD = "+gcdArray(a));
	}
}
