package edu.java.file01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 입/출력 스트림(Input/OutPut Stream)
 * 프로그램 <==  inputStream <== 입력장치 (키보드, 마우스 ,펜, 파일, ...)
 * 프로그램 ==> outputStream ==> 출력장치(모니터, 프린터, 파일, ...)
 * System.in : InputStream(외부에서 프로그램으로 데이터가 들어오는 통로) 인스턴스.
 * System.out : OutputStream(프로그램이 외부로 데이터를 보내는 통로)을 상속받는 printStream 클래스의 인스턴스
 * 
 * 
 * java.io.InputStream : 데어터를 읽어오는 (read) 통로
 * |__ java.io.FileInputStream: 파일에서 데이터를 읽어오는 통로
 * 
 * java.io.outputStream : 데이터를 쓰는(write) 통로
 * |__  java.io.FileOutputStream : 파일에서 데이터를 보내오는 통로
 * 
 */




public class FileMain01 {

	public static void main(String[] args) {
		
		// 파일 읽기(read), 쓰기(write)
		FileInputStream in= null;
		FileOutputStream out= null;
		
		try {
			// data 폴더에 있는 test.txt 파일을 읽기 위한 통로 객체를 생성
			in= new FileInputStream("data/test.txt");
			// data 폴더의 test_copy.txt 파일에 쓰기 위한 통로 객체를 생성
			out= new FileOutputStream("data/test_copy.txt");
			while(true) {
				int read=in.read();	// FIS에서 1바이트를 읽음
				if(read==-1) {// 파일의 끝에 도달하면
					break;
				}
				System.out.println((char)read);
				out.write(read);	// 파일에서 읽은 1바이(read)값을 다른 파일에 씀
			}
			System.out.println("파일 복사 성공");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();	//FileInputStream 객체를 닫음.
				out.close(); //FileOutputStream 객체를 닫음.
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
