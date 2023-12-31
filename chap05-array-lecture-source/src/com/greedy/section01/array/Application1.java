package com.greedy.section01.array;

public class Application1 {

	public static void main(String[] args) {

		/* 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
		 * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
		 * */
		
		/* 배열을 사용하는 이유
		 * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
		 * 1. 연속된 메모리 공간으로 관리할 수 없게 된다.(모든 변수의 이름을 사용자가 관리해야 한다.)
		 * 2. 반복문을 이용한 연속 처리가 불가능하다.
		 * */ 		
	
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
	
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println("sum : " + sum);

		/* 배열의 선언 및 할당*/
		
		int[] arr = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		int value = 0;
		for(int i = 0; i < arr.length; i++) {		//나열 연산자로 변수를 사용한다면 가독성이 떨어져서 비추.
			arr[i] = value += 10;
		}
		
		int sum2 = 0;
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
//		sum += arr[3];
//		sum += arr[4];
	
		System.out.println("value : " + value);
	
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		System.out.println("sum2 : " + sum2);
	}

}
