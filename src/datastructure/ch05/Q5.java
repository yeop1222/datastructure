package datastructure.ch05;

public class Q5 {

	static int count;
	static String[] memo;
	
	static void recur(int n) {
		
		count++;
		if(n>0) {
			recur(n-1);
//			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void memoRecur(int n) {
		
		count++;
		if(memo[n+1] != null) {
//			System.out.println(memo[n+1]);
		}else {
			if(n>0) {
				memoRecur(n-1);
//				System.out.println(n);
				memoRecur(n-2);
				memo[n+1] = memo[n] + n + "\n" + memo[n-1];
			}else {
				memo[n+1] = "";
			}
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.print("i="+i);
			
			count=0;
			recur(i);
			System.out.printf("\trecur=%3d",count);
			
			count=0;
			memo=new String[i+2];
			memoRecur(i);
			System.out.printf("\tmemoRecur=%2d\n",count);
		}
	}
}
