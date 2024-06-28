package com.javaex.practice;

//[문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
//확인해 보세요.
public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5]; //배열을 3개만 사용 //이건 상관이 없음
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i < intArray.length ; i++) { //경계를 경계
			result = result + intArray[i];
		}
		
		System.out.println(result);
		//3
		//7
		//12

	}

}
