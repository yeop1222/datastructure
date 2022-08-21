package datastructure.ch01;

public class Q04Median {
	
	public static void main(String[] args) {
		
		System.out.println("med3(3,2,1) = " + med3(3,2,1));
		System.out.println("med3(3,2,2) = " + med3(3,2,2));
		System.out.println("med3(3,1,2) = " + med3(3,1,2));
		System.out.println("med3(3,2,3) = " + med3(3,2,3));
		System.out.println("med3(2,1,3) = " + med3(2,1,3));
		System.out.println("med3(3,3,2) = " + med3(3,3,2));
		System.out.println("med3(3,3,3) = " + med3(3,3,3));
		System.out.println("med3(2,2,3) = " + med3(2,2,3));
		System.out.println("med3(2,3,1) = " + med3(2,3,1));
		System.out.println("med3(2,3,2) = " + med3(2,3,2));
		System.out.println("med3(1,3,2) = " + med3(1,3,2));
		System.out.println("med3(2,3,3) = " + med3(2,3,3));
		System.out.println("med3(1,2,3) = " + med3(1,2,3));
		
	}
	
	static int med3(int a, int b, int c) {
		if (a>=b) {				
			if(b>=c) {
				return b;			//2
			}else if(a>=c){
				return c;			//3
			}else {
				return a;			//3
			}
		}else if(a>c) {
			return a;				//2
		}else if(b>c) {
			return c;				//3
		}else {
			return b;				//3
		}
	}
}
