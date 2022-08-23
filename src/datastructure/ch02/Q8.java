package datastructure.ch02;

import java.sql.Date;

public class Q8 {

	static class YMD{
		int y;
		int m;
		int d;
		
		private Date date;
		
		YMD(int y, int m, int d){
			date = new Date(y-1900,m-1,d);
			this.y = date.getYear()+1900;
			this.m = date.getMonth()+1;
			this.d = date.getDate();
		}
		
		YMD after(int n) {
			return new YMD(y,m,d+n);
		}
		YMD before(int n) {
			return new YMD(y,m,d-n);
		}
		
		@Override
		public String toString() {
			return y+"년 "+m+"월 "+d+"일";
		}
	}
	
	static class YMD2{
		
		int y;
		int m;
		int d;
		
		final int[] dayMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		YMD2(int y,int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		YMD2 after(int n) {
			
			while(true) {
				//일 > (월 최대일)
				if(n+d > dayMonth[m-1]) {
					n-=dayMonth[m-1];
					m++;
					if(m>12) {
						m-=12;
						y++;
					}
				//일 < 1
				}else if(n+d < 1){
					m--;
					if(m<1) {
						m+=12;
						y--;
					}
					n+=dayMonth[m-1];
				//1 <= 일 <= (월 최대일)
				}else {
					break;
				}
			}
			return new YMD2(y,m,d+n);
		}
		
		YMD2 before(int n) {
			return after(-n);
		}
		
		@Override
		public String toString() {
			return y+"년 "+m+"월 "+d+"일";
		}
	}
	
	public static void main(String[] args) {
		YMD ymd = new YMD(2022,12,25);
		System.out.println(ymd);
		ymd = ymd.after(7);
		System.out.println(ymd);
		ymd = ymd.after(-7);
		System.out.println(ymd);
		ymd = new YMD(2023,1,2);
		System.out.println(ymd);
		ymd = ymd.before(3);
		System.out.println(ymd);
		ymd = ymd.before(-3);
		System.out.println(ymd);
		
		System.out.println();
		
		YMD2 ymd2 = new YMD2(2022,12,25);
		System.out.println(ymd2);
		ymd2 = ymd2.after(7);
		System.out.println(ymd2);
		ymd2 = ymd2.after(-7);
		System.out.println(ymd2);
		ymd = new YMD(2023,1,2);
		System.out.println(ymd);
		ymd = ymd.before(3);
		System.out.println(ymd);
		ymd = ymd.before(-3);
		System.out.println(ymd);
	}
}
