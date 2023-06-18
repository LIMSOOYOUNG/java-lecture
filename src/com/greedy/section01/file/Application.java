package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/* File 클래스
		 * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
		 * 대상 파일에 대한 정보로 인스턴스를 생성하고
		 * 파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다.
		 * */
		
		File file = new File("src/com/greedy/section01/file/test.txt"); // import해줘야함
		
		try {
//			file.createNewFile();	
			boolean createSuccess = file.createNewFile();
			
			System.out.println("createSuccess : " + createSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		/* 1MB = 1024kb, 1kb = 1024byte 1MB = 1024 * 1024 byte*/
		System.out.println("파일의 크기 : " + file.length() + "byte");	 	
		System.out.println("파일의 경로 : " + file.getParent());
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		boolean deleteSuccess = file.delete();
		
//		System.out.println("deleteSuccess : " + deleteSuccess);
		
	}

}
