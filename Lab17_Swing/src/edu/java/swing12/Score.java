package edu.java.swing12;

public class Score {

	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int total() {
		
		return this.kor+this.eng+this.math;
	}
	
	public double average() {
		
		return (double)total()/3;
	}
	
	
	
}
