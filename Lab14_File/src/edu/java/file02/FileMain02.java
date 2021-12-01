package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain02 {

	public static void main(String[] args) {
		// overloading 되어 있는 read, write - 여러개의 바이트를 한번에 읽고 쓰기
		
		FileInputStream in = null;
		
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("data/test.txt");
			out = new FileOutputStream("data/test_copy2.txt");
			
			while(true) {
				byte[] buffer = new byte[10];// 10 바이트를 저장할 수있는 배열 생성
				int result=in.read(buffer);
				// read(byte[] b): 파일에서 읽은 데이터를 b에 저장하고, 실제로 읽은 바이트 수를 리턴.
				if(result==-1) {
					break;
				}
				// -> 읽은 바이트만큼 쓰기
//				System.out.println(result+" 바이트 읽음");
				out.write(buffer, 0, result);
			}
			System.out.println("파일 복사 성공~");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
