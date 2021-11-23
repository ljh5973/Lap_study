package edu.java.list03;

public class Member {

	
	private String memberId;
	private String memberPassword;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Member(String memberId, String memberPassword) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPassword() {
		return memberPassword;
	}


	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	
	
	
}


