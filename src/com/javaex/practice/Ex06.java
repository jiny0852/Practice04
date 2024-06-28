package com.javaex.practice;

//[문제] Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
public class Ex06 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		System.out.println(c);
		
		for ( int i = 0 ; i < c.length ; i++ ) {
			if ( c[i] == ' ' ) {
				c[i] = ',';
			}
		}
		
		System.out.println(c);

	}

}
