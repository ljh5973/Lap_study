package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileMain08 {

	public static void main(String[] args) {
		
		// 1: ArrayList<Student>를 생성
		
		ArrayList<Student> list= new ArrayList<>();
		// ArrayList에 Student 객체 5개를 추가
		
		Student s1= new Student(1,"Lee",new Score(100,100,50));
		Student s2= new Student(2,"Kim", new Score(80,80,70));
		Student s3= new Student(3,"Choi", new Score(70,100,60));
		Student s4= new Student(4, "Park", new Score(60,70,70));
		Student s5 = new Student(5,"Han", new Score(80,80,100));
		// ARrayList를 파일에 write
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		try(FileOutputStream out= new FileOutputStream("data/student.dat");
				BufferedOutputStream bout= new BufferedOutputStream(out);
				ObjectOutputStream oos= new ObjectOutputStream(bout);) {
			oos.writeObject(list);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 2: 1번에서 저장된 파일에서 객체를 읽음 read
		// 객체를 ArrayList로 타입 변환
		// ArrayList에 저장된 원소들을 모두 출력
		try (FileInputStream in= new FileInputStream("data/student.dat");
				BufferedInputStream bin= new BufferedInputStream(in);
				ObjectInputStream ois= new ObjectInputStream(bin);){
			
			Object obj=ois.readObject();
			if(obj instanceof ArrayList) {
				ArrayList<Student> stu= (ArrayList<Student>)obj;
				for(int i=0; i<stu.size(); i++) {
					System.out.println(stu.get(i));
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
