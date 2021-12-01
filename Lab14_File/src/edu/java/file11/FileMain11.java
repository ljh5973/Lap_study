package edu.java.file11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileMain11 {

	public static void main(String[] args) {
		
		// Writer 객체들을 사용한 파일 쓰기
		// BufferedWriter ==> OutputStreamWriter ==> FileOutputStream ==> File
		try (
				BufferedWriter bw=new BufferedWriter(
						new OutputStreamWriter(
							new FileOutputStream("data/writer_test.txt"),
							"UTF-8"));
				){
			bw.write("Hello Java!@#$%\n");
			bw.newLine(); // 파일에서 줄바꿈
			bw.write("새로운 줄"
					+ "안녕 자바...");
			bw.newLine();
			bw.write("1234 5421 123");
			bw.newLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 위에서 작성된 파일을 읽기
		// BufferedReader <== InputStreamReader <== FileInputStream <== File
		
		try (BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("data/writer_test.txt"),"UTF-8"));){
			
			
			
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
