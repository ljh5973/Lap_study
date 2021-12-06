package edu.java.member.controller;

import edu.java.member.model.Member;

// Controller 인터페이스를 구현하는 클래스 - 모든 View 클래스에서 동일한 인스턴스를 사용하도록 singleton 패턴 적용
public class MemberDaoImpl implements MemberDao {
	// 배열 최대 크기 정의
	private static final int MAX_LENGTH=5;
	
	// 회원 정보를 저장하기 위한 배열
	private Member [] memberList = new Member[MAX_LENGTH];
	
	// 배열에 저장된 회원 정보 개수를 저장하기 위한 변수
	private int count=0;
	
	// 1) privaet static 자기자신타입 변수를 선언
	private static MemberDaoImpl instance=null;
	
	// 2) 생성자를 private으로 선언
	private MemberDaoImpl() {
		
	}
	// 3) public static 메서드를 제공해서 오직 한 개의 instance만 생성되도록 함.
	public static MemberDaoImpl getInstace() {
		if(instance==null) {
			instance=new MemberDaoImpl();
		}
		return instance;
	}

	
	
	public int insert(Member m) {
		int result=0;
	
		if(count<MAX_LENGTH) {// 현재까지 배열에 저장된 원소의 갯수가 배열의 최대 크기를 넘지 않으면
			memberList[count]=m;
			count++;
			result=1;
		}
		return result;
		
	}

	public Member[] select() {
		
		Member[] arr=new Member[count];
		
		for(int i=0; i<count; i++) {
			arr[i]=memberList[i];
		}
		
		
		
		return arr;
	}

	public Member select(int index) {
		Member m=null;
		if(index>=0 && index<MAX_LENGTH) {
			m=memberList[index-1];
		}
		return m;
	}

	public int update(int index, String password) {
		
		int result=0;

		if(index>=0&&index<count) {
			memberList[index].setMemberPassword(password);
			result=1;
		}
		return result;
	}

}
