package datastructure.ch02;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String DCHAR = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int no;				//변환할 정수
		int cd;				//진수
		String sno = "";	//변환후 문자열
		
		//숫자 입력받기
		do {
			System.out.print("변환할 음이 아닌 정수> ");
			no = sc.nextInt();
		}while(no<0);
		
		//진수 입력받기
		do {
			System.out.print("변환할 진수(2~36)> ");
			cd = sc.nextInt();
		}while(cd<2 || cd>36);

		//첫줄
		System.out.printf("%2d|%6d\n", cd, no);
		//둘째줄
		do {
			System.out.println("  +------");
			System.out.printf("%s%6d ... %c\n",
					//마지막줄 cd| 표시여부
					no/cd>0 ? String.format("%2d|", cd) : "   ",
					no/cd,
					DCHAR.charAt(no%cd));
			sno = DCHAR.charAt(no%cd) + sno;
			no /= cd;
		}while(no>0);
		
		System.out.println(cd+"진수로 "+sno);
	}
}
