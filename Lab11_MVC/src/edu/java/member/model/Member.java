package edu.java.member.model;

// Model Class. VO(Value Object), DTO(Data Transfer Object)
public class Member {
	
	private String memberId;
	private String memberPassword;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPassword) {
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

	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPassword=" + memberPassword + "]";
	}
	
	
	
	

}
