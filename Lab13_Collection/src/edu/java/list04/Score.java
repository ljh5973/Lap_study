package edu.java.list04;

public class Score {

	private int kor;
	private int eng;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
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

	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		return true;
	}
	
	
	
	
	
}
