package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {

	public static void main(String[] args) {
		
		/* LinkedList
		 * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
		 * 
		 * 단일 연결 리스트
		 *  : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하여 구성하며
		 *    마치 연결된 리스트 형태인 것 처럼 만든 자료구조이다.
		 *    요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
		 *    요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayLIst보다 성능 면에서 우수하다
		 *    
		 *    하지만 단일 연결리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근하기 어렵다.
		 *    이를 보완하고자 만든 것이 이중 연결 리스트이다.
		 *    
		 * 이중 연결 리스트
		 * 	: 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
		 * 	    이전 요소로 접근하기 쉽게 고안된 자료구조이다.
		 * 	  
		 * LinkedList는 이중 연결 리스트를 구현한 것이며, List 인터페이스를 상속받았기 때문에
		 * ArrayList와 사용 방법은 거의 유사하다. (내부적으로 요소를 저장하는 방법에 차이가 있음)
		 * */
		
		List<String> linkedList = new LinkedList<>();
		
		/* 요소를 추가할 때 add 이용*/
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		linkedList.add("mango");
		linkedList.add("grape");
		
		System.out.println(linkedList.size());
		
		/* 요소를 꺼내올 때 get()을 사용한다.*/
		for(int i = 0; i < linkedList.size(); i++) {
			System.out.println(i + " : " + linkedList.get(i));
		}
	
		/* 요소를 제거할 때는 remove() 메소드를 이용한다.*/
		linkedList.remove(1);
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		/* set() 메소드를 이용해서 요소를 수정할 수 있다.*/
		linkedList.set(0, "pineapple");
		
		System.out.println(linkedList);
		
		/* isEmpty() 메소드를 이용해서 list가 비어있는지 확인할 수 있다.*/
		System.out.println(linkedList.isEmpty());
	
		/* clear() 메소드를 이용해 list 내의 모든 요소를 제거할 수 있다.*/
		linkedList.clear();
		
		System.out.println(linkedList.isEmpty());
	
	
	}

}
