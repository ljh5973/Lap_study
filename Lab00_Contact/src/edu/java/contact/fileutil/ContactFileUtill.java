package edu.java.contact.fileutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactFileUtill {

	// 상수 (constant variable) 정의 - 데이터 폴더 이름, 데이터 파일 이름
	public static final String DATA_DIR= "data";			//데이터 폴더 이름
	public static final String DATA_FILE= "contacts.dat";	// 데이터 파일 이름
	
	// 생성자를 private 으로 선언하고 모든 메서드를 static으로 만듦.
	
	private ContactFileUtill() {
	}
	
	
	/**
	 * 연락처 데이터 파일을 저장하는 폴더가 없으면 생성하고 File 객체를 리턴.
	 * 
	 * @return 데이터 폴더를 관리하는 File 객체
	 */
	
	public static File initailizeDataDir() {
		
		File file= new File(DATA_DIR);
		if(!file.exists()) {
			boolean result=file.mkdir();
			if(result) {
				System.out.println(DATA_DIR+"폴더 생성 성공");
			}else {
				System.out.println(DATA_DIR+"폴더 생성 실패");
			}
		}else {
			System.out.println("디렉토리가 이미 존재합니다.");
		}
		
		return file;
	}
	
	
	/**
	 * 파라미터에 전달된 File 객체를 사용해서 데이터 파일에 저장된 연락처 정보를 읽어서,
	 * 연락처 정보를 List 객체로 리턴
	 * 
	 * @param file 연락처 데이터가 저장된 파일을 관리하는 File 객체
	 * @return 파일에서 읽은 데이터 . ArrayList<Contact> 타입 객체
	 */
	public static List<Contact> readDataFromFile(File file){
		ArrayList<Contact> list=null;	//리턴할 데이터
		FileInputStream in=null;		
		BufferedInputStream bin = null;
		ObjectInputStream oin= null;
		
		try {
			in=new FileInputStream(file);
			bin=new BufferedInputStream(in);
			oin=new ObjectInputStream(bin);
			
			list=(ArrayList<Contact>) oin.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();	//OIS를 close -> BIS이 close됨 -> FIS도 close됨
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 같은내용
//		try (ObjectInputStream ois= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){
//			
//			Object obj=ois.readObject();
//			
//			if(obj instanceof ArrayList) {
//				list= (ArrayList<Contact>)obj;
//			}
//			
//		
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return list;
	}
	
	
	
	/**
	 * 파라미터에 전달된 data를 file에 씀(write).
	 * 
	 * @param data 파일에 쓸 데이터. Contact type을 저장하는 ArrayList.
	 * @param file 데이터 파일을 관리하는 File 객체.
	 */
	public static void writeDataToFile(List<Contact> data, File file) {
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));){
			
			oos.writeObject(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * 연락처 데이터를 저장하고 있는 파일(data\contacts.dat)이 있는지 없는지 체크해서.
	 * 데이터 파일이 있으면 파일에서 ArraylList를 읽어서 리턴.
	 * 데이터 파일이 없으면 빈(empty) 리스트(ArrayList)를 생성하고 리턴.
	 * 
	 * @return Contact 객체를 저장하는 ArrayList.
	 */
	public static List<Contact> initializeData(){
		List<Contact> list = null;
		
		
		//데이터 파일 (data\contacts.dat)을 관리하는 File 객체를 생성.
		File file = new File(DATA_DIR, DATA_FILE);
		
		if(file.exists()) {// 데이터 파일이 만들어져 있으면
			System.out.println("데이터 로딩중...");
			list=readDataFromFile(file);
		}else { //데이터 파일이 없으면
			
			System.out.println("새 데이터 로딩종...");
			list= new ArrayList<Contact>();
			
		}
		
		return list;
	}
}
