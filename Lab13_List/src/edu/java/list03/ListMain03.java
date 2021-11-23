package edu.java.list03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain03 {

	
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		
		// 반복문을 사용해서 id와 pw을 입력받고 객체를 생성해서
		// ArrayList에 추가
		
		ArrayList<Member> list = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			
			System.out.println("아이디를 입력하세요.");
			String name= scan.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String pw= scan.nextLine();
			
			Member mem= new Member(name, pw);
			list.add(mem);
		}
		
		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록
//		for(int i=0; i<list.size(); i++) {
//			String id=list.get(i).getMemberId();
//			String pw=list.get(i).getMemberPassword();
//			
//			
//			System.out.println("id = "+ id +"pw = " + pw);
//		}
//		
//		// 인덱스 0 위치의 회원 정보 중에서 비밀번호를 변경하고 리스트 내용 출력
//		
//		// (1) 인덱스 0 위치의 회원 정보를 찾음. (2) 그 회원의 비번을 설정(setter)
//		System.out.println("바꿀 비밀번호를 입력하세요.");
//		String pw2=scan.nextLine();
//		list.get(0).setMemberPassword(pw2);
//		
//		
//		
//		// 인덱스 1ㅣ위치의 회원 정보를 삭제하고 리스트 내용을 출력
//		
//		list.remove(1);
//		for(int i=0; i<list.size(); i++) {
//			String id=list.get(i).getMemberId();
//			String pw=list.get(i).getMemberPassword();
//			System.out.println("id = "+ id +"pw = " + pw);
//		}
		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스를 수정
		
		
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).getMemberId().equals(list.get(j).getMemberId())) {
					list.remove(j);
					j--;
				}
				
			}
		}
		for(int i=0; i<list.size(); i++) {
			
			String id=list.get(i).getMemberId();
			String pw=list.get(i).getMemberPassword();
			System.out.println("id = "+ id +"pw = " + pw);
		}
		
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력
	}
}
