package edu.java.file09;

import java.io.FileReader;

/*
 *  I/O Stream: 바이트 스트림(byte stream) - 입력/ 출력의 기본 단위가 byte단위. 모든 파일 형식(txt, mp4, ...)에서 사용 가능
 *  InputStream, OutputStream
 *  |__ FileInputStream, FileOutputStream
 *  
 *  Reader/Writer: 문자 스트림(character stream) - 입력/출력의 기본 단위가 '인코딩되어 있는 문자' 단위.
 *  Reader
 *  |__ InputStreamReader: 인코딩 타입을 지정할 수 있는 Reader 클래스
 *  	|__FileReader : 기본 인코딩 값이 운영체제의 인코딩 방식을 따르는 Reader 클래스
 *  
 *  Writer
 *  |__ OutputStreamWriter: 인코딩 타입을 지정할 수 있는 Writer 클래스
 *  	|__ FileWriter: 기본 인코딩 값이 운영체제의 인코딩 방식을 따르는 Writer 클래스
 *  
 *  운영 체제(OS: Operating System)의 인코딩 방식
 *  - 한글 MS-Windows: EUC-KR(MS949, CP949)
 *  - MacOS, Linux: UTF-8
 *  
 *  보조 스트림: I/O Stream과 연결하는 스트림
 *   BufferedInputStream, BufferedOutputStream, ObjectInputStream, ObjectOutputStream
 *  
 *  보조 Reader/Writer: Reader/Writer 객체와 연결하는 스트림
 *   BufferedReader, BufferedWriter
 * 
 */

public class FileMain09 {

	private static final String ANSI_FILE= "data/ansi.txt";
	private static final String UTF8_FILE="data/UTF-8.txt";
	
	public static void main(String[] args) {
		
		// 한글 MS-Windows 환경에서 ANSI 방식으로 저장된 Text File을 FileReader로 읽는 경우
		
		FileReader reader=null;
		
		try {
		reader=new FileReader(ANSI_FILE);
		while(true) {
			int result=reader.read();
			
			if(result==-1) {
				break;
			}
			char a=(char)result;
			System.out.print(a);
			
//			char a=(char) result;
			
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		try (FileReader reader2 = new FileReader(UTF8_FILE);){
			
			while(true) {
				int result =reader2.read();
				
				if(result==-1) {
					break;
				}
				char a=(char)result;
				System.out.print(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
