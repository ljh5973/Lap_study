package fastcampus.java.school;

import java.util.ArrayList;

public class School {

	
	private static School instance= new School();
	
	private static String SCHOOL_NAME = "GOOD SCHOOL";
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	
	private School() {
		
	}
	
	
	// School은 한개의 객체만 있으면 된다.(싱글톤 패턴)
	
	public static School getInstance() {
			if(instance==null) {
				instance=new School();
				
			}
			return instance;
	}




	public ArrayList<Student> getStudentList() {
		return studentList;
	}


	public void addStudent(Student student) {
		studentList.add(student);
	}


	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}


	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList=subjectList;
	}
	


	
	
	
	
}
