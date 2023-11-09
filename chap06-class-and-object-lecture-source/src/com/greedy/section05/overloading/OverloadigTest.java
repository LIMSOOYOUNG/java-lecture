package com.greedy.section05.overloading;

public class OverloadigTest {

	/* 생성자 작성 시 동일한 이름의 생성자를 한 클래스 내에서 작성하는 것이 불가능했다.
	 * 메소드의 경우도 마찬가치이다.
	 * 동일한 이름의 생성자나 메소드를 한 클래스 내부에 여러 개 작성할 수 있게 만든 기술을 오버로딩(overloading)이라고 한다.
	 * 매개변수의 타입, 갯수, 순서를 다르게 작성하면 서로 다른 생성자나 메소드로 인식시킬 수 있다.
	 * 
	 * 오버로딩의 사용 이유
	 * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
	 * 이 때 동일한 기능의 메소드를 매개변수에 따라 이름을 다르게 작성하게 되면 복잡해지고 관리하기도 어려워진다.
	 * 규모가 작은 프로그램의 경우에는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
	 * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해 사용한다.
	 * 
	 * 오버로딩의 조건
	 * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입 ,갯수, 순서를 다르게 작성하여
	 * 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
	 * 메소드의 시그니처(Signature)가 다르면 다른 메소드로 인식한다. 
	 * 
	 * 
	 * 메소드의 시그니처?
	 * public void mehtod(int num) {} 이라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니처라고 한다.
	 * method(int num) <- 이 부분이 시그니처이다.
	 * */
	
	public void test() {}
	
	/* 메소드 시그니처가 동일한 경우 Compile Error를 발생시킨다.*/
//	public void test() {}
	
	/* 접근제한자는 메소드 시그니처에 해당하지 않는다.*/
//	private void test() {}
	
	/* 반환형은 메소드 시그니처에 해당하지 않는다.*/
//	public int test() {return 0; } 
	
	/* 매개변수 유무에 따른 오버로딩 성립 확인*/
	public void test(int num) {}
	
	/* 매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.*/
//	public void test(int num2) {}
	
	/* 매개변수의 갯수에 따른 오버로딩 성립 확인*/
	public void test(int num1, int num2) {}
	
	/* 매개변수의 타입 변화에 따른 오버로딩 성립 확인*/
	public void test(int num, String name) {}
	
	/* 매개변수의 순서에 따른 오버로딩 성립 확인*/
	public void test(String name, int num) {}
}
