package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain03 {

	public static void main(String[] args) {
		FileInputStream in= null;
		FileOutputStream out= null;
		
		try {
			in= new FileInputStream("data/ratings.data");
			out= new FileOutputStream("data/ratings_copy.data");
			
			
			long startTime = System.currentTimeMillis();
			
			while(true) {
				
//				int result= in.read();
				
				// (2) byte 배열을 사용한 읽기/쓰기
				byte[] buffer = new byte[1024]; // 1,024 byte= 1KB 만큼씩 읽기 위한 배열
				int result=in.read(buffer);		// 파일에서 (최대) 1KB씩 읽기 
				
				
				
				if(result==-1) {
					break;
				}
				
				System.out.println("result 값 : "+ result);
				out.write(buffer, 0, result); // (2) byte 배열의 내용을 result 크기 만큼 파일에 쓰기
				
//				out.write(result);
				
			}
			
			long endTime=System.currentTimeMillis();
			long elapsedTime = endTime- startTime;
			System.out.println("경과시간 : "+elapsedTime);
			// -> 1 byte 읽기/쓰기 : 약 150초 
			// -> 4 KB 읽기/쓰기 : 약 0.1초
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
