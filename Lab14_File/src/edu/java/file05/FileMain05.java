package edu.java.file05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileMain05 {

	public static void main(String[] args) {
		
		
		/*
		 *  try-with-resource 구문 (Java 7 버전부터 제공)
		 *  
		 *  
		 *  FIS, FOS과 같은 클래스의 생성자를 호출한 이후에는 반드시 생성된 객ㅔ에서 close() 메서드를 호출해야 함.
		 *  생성자 호출 문장은 try 블록에서 작성, close() 메서드 호출 문장은 finally 블록에서 작성.
		 *  try-with-resource 구문을 사용하면, 생성자 호출 문장을 try() 안에서 작성하고 close() 메서드 호출 문장은 작성하지 않음.
		 *  -> JRE이 생성된 resource들의 close() 메서드를 자동으로 호출해 줌.
		 *  (주의) try-with-resource : close() 메서드를 가지고 있는 클래스 타입들만 사용할 수 있다.
		 *  
		 *  
		 *  try(리소스 생성 문장:){
		 *  	정상적인 경우 실행할 문장들;
		 *  } catch(예외클래스이름 변수) {
		 *  
		 *  }
		 */
		
		try (FileInputStream in= new FileInputStream("data/test.txt");
				BufferedInputStream bin= new BufferedInputStream(in);){
			
			int result=bin.read();
			System.out.println((char)result);
			result=bin.read();
			System.out.println((char)result);
//			while(true) {
//				if(result==-1) {
//					break;
//				}
//				
//			}
			// bin또는 in의 close가 자동 호출  
			
		} catch (Exception e) {
			// TODO: handle exception
			// bin또는 in의 close가 자동 호출 
		}
	}
}
