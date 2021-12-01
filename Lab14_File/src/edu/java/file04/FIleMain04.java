package edu.java.file04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleMain04 {

	/*
	 * 프로그램 <== BufferdInputStream <== FileInputStream <== 파일(HDD, SDD)
	 * 	- FileInputStream : 하드디스크에 있는 파일을 읽어서 메모리(RAM)에 적재
	 * 	- BufferdInputStream: 메모리(RAM)에 올라가 있는 파일 내용을 읽음.
	 * 
	 * 프로그램 ==> BufferdOutputStream ==> FileInputStream ==> 파일(HDD,SSD)
	 * 	- BufferdOutputStream: 프로그램에서 메모리(RAM)에 내용을 쓰기(write)
	 *	- FileOouputStream: 하드디스크의 파일에 내용을 쓰기(write)
	 * 
	 */
	public static void main(String[] args) {
		
		// 파일의 내용을 메모리에 올려놓고 메모리에서 읽기/쓰기
		FileInputStream in=null;	// 파일에서 직접 읽기 위한 통로
		BufferedInputStream bin=null;	// 메모리에서 읽기 위한 통로
		
		
		FileOutputStream out= null;		//파일에 직접 쓰기 위한 통로
		BufferedOutputStream bout=null;	// 메모리에 쓰기 위한 통로
		
		try {
			// 파일 -(read)-> 메모리 -(read)-> 프로그램
			in= new FileInputStream("data/ratings.dat"); // 파일을 파라미터로 가지고 FIS을 생성
			bin= new BufferedInputStream(in);
			
			// 프로그램 -(write) -> 메모리 - (write) -> 파일
			out= new FileOutputStream("data/ratings_copy.dat"); // 파일을 파라미터로 가지고 FOS을 생성
			bout = new BufferedOutputStream(out); // FOS을 파라미터로 가지고 BOS을 생성
			
			// BIS 객체(bin)가 가지고 있는 read 메서드 사용.
			// BOS 객체(bout)가 가지고 있는 write 메서드 사용
			
			long startTime = System.currentTimeMillis();
			
			while(true) {
				byte[] buffer=new byte[4*1024]; // 4KB씩 읽고 쓰기 위한 배열
				int result= bin.read(buffer);	// 메모리(RAM)에 올라가 있는 내용을 배열에 읽음
				if(result == -1) {			
					break;
				}
				// BOS 객체(bout)가 가지고 있는 write 메서드 사용.
				bout.write(buffer, 0, result);	// 메모리(RAM)의 내용을 씀.
			}
			
			long endTime=System.currentTimeMillis();
			
			long elapsedTime= endTime-startTime;
			System.out.println(" 경과 시간 : "+ elapsedTime+" ms");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bin.close();	// 가장 마지막에 생성된 bin을 close하면, 처음에 생성한 in도 함께 close됨.
				bout.close();	// bout을 close하면, bout이 사용하는 out 객체도 함께 close됨.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
