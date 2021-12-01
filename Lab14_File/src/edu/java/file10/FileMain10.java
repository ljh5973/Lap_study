package edu.java.file10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileMain10 {

	private static final String ANSI_FILE="data/ansi.txt";
	private static final String UTF8_FILE="data/UTF-8.txt";
	public static void main(String[] args) {
		
		// FileReader와 FileWriter의 단점은 인코딩 타입을 지정할 수 없기 때문에 실행 환경에 따라서 다른 결과를 줌.
		// InputStreamReader, OutputStreamReader를 사용하면 인코딩 타입을 지정할 수 있음.
		
		try (FileInputStream in= new FileInputStream(ANSI_FILE);
				InputStreamReader reader= new InputStreamReader(in,"EUC-KR");) {
			
			while(true) {
				int result=reader.read();
				if(result==-1) {
					break;
				}
				System.out.print((char)result);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("\n-----");
		
		//UTF-8로 작성된 텍스트 파일을 InputStreamReader를 사용해서 읽기
		try (FileInputStream in=new FileInputStream(UTF8_FILE);
				InputStreamReader reader=new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(reader)){
			
			long start=System.currentTimeMillis();
			while(true) {
				int result=br.read();
				if(result==-1) {
					break;
				}
				System.out.print((char)result);
			}
			long end=System.currentTimeMillis();
			System.out.println();
			System.out.println(end-start);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
