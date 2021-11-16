package edu.java.modifier05;

public class Member {

	private String memberId;
	private String memberPassword;
	

	public Member(String memberId, String memberPassword) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	
//	constructor - 파라미터 2개인 생성자만 만듦. 기본 생성자는 만들지 않음.
//	아이디와 비밀번호에 대한 getter 메서드 작성
//	비밀번호에 대한 setter 메서드 작성
	
	
	
}
