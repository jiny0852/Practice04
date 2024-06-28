package com.javaex.practice;

import java.util.Scanner;

//[문제] Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		double n = 0; //평균
		
		for ( int i = 0 ; i < arr.length ; i++ ) {
			
			System.out.print("숫자입력 : ");
			arr[i] = sc.nextDouble();
			n = n + arr[i];
			
		}
		
		System.out.println("평균은 " + n/5 + " 입니다.");
		
		sc.close();

	}

}
