package com.greedy.section02.superKeyword;

import java.util.Date;

public class Application {

	public static void main(String[] args) {

		/* super의 super()
		 * 
		 * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도 함께 생성하게 된다.
		 * 		     이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수로 자식 클래스 내의 모든 생성자와 메소드 내에
		 * 		     선언하지 않고 사용할 수 있는 레퍼런스 변수로 super를 사용할 수 있다.
		 * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는 부모 생성자를 호출하게 된다.
		 * 			this()가 해당 클래스 내의 다른 생성자를 호출하는 구문이라면, super()는 부모가 가지는
		 * 			private 생성자를 제외한 나머지 생성자를 호출할 수 있도록 한 구문이다.*/
	
		ProductDTO product1 = new ProductDTO();
		System.out.println(product1.getInformation());
		
		ProductDTO product2 = new ProductDTO("S-01234", "삼성", "갤럭시Z폴드", 2390000, new java.util.Date());
		System.out.println(product2.getInformation());
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.getInformation());
		
		ComputerDTO computer2 = new ComputerDTO("퀄컴 스냅드레곤", 512, 12, "안드로이드");
		System.out.println(computer2.getInformation());
		
		ComputerDTO computer3 = new ComputerDTO("S-01234", "삼성", "갤럭시Z폴드2", 2390000, new java.util.Date()
				, "퀄컴 스냅드레곤", 512, 12, "안드로이드");
	
		System.out.println(computer3.getInformation());
	}

}
