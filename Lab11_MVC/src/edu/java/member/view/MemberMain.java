package edu.java.member.view;

import java.util.Scanner;

import edu.java.member.controller.MemberDao;
import edu.java.member.controller.MemberDaoImpl;
import edu.java.member.model.Member;

// MVC(Model - View - Controller) 디자인 패턴
// Model : 데이터 저장을 위한 클래스. VO(Value Object), DTO(Data Transfer Object)
// - edu.java.member.model.Member
// View : UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller : 프로그램의 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Object).
// - edu.java.member.controller.MemberDao, MemberDaoImpl
// - 인터페이스와 구현 클래스로 나눔
// - 구현 클래스는 Singleton 디자인 패턴으로 설계.

public class MemberMain {

	private static Scanner scan=new Scanner(System.in);
	private static MemberDao dao = MemberDaoImpl.getInstace();	// 다형성(polymorphsim)
	
	public static void main(String[] args) {

		// 회원 관리 프로그램 메인(View)
			
		System.out.println(" *** 회원 관리 프로그램 *** ");

		boolean run = true;
		while (run) {
			// main menu를 보여주고, menu 선택을 입력 받는다.

			int menu=chooseMenu();
			switch (menu) {
			case MainMenu.QUIT:
				

				System.out.println(" *** 회원 관리 프로그램을 종료합니다. *** ");
				scan.close();
				run=false;
				break;
			case MainMenu.INSERT:
				insertNewMember();
				break;
			case MainMenu.SELECT_ALL:
				selectAllMembers();
				break;
			case MainMenu.SELECT_BY_INDEX:
				selectMemberByIndex();
				break;
			case MainMenu.UPDATE:
				updateMemberInfo();

				break;

			default:
				System.out.println();
				System.out.println("메뉴를 다시 선택하세요.");
				break;
			}
			
		}
		
	}
	private static int chooseMenu() {

		showMainMenu();
		String s = scan.nextLine();
		
		int menu = Integer.parseInt(s);
		return menu;
	}
	private static void showMainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인덱스 검색 [3] 회원가입 [4] 정보수정 [0] 종료");
		System.out.println("--------------------------------------------------");
		System.out.println("선택 >>");
	}
	
	private static void insertNewMember() {
		System.out.println();
		System.out.println("----- 회원 가입 -----");
		// TODO:
		// ID 입력
		System.out.println("가입할 id 입력 >");
		String id=scan.nextLine();
		// PW 입력
		System.out.println("가입할 pw 입력");
		String pw=scan.nextLine();
		// Member 객체 생성
		Member m1=new Member(id,pw);
		
		// Controller 기능(method)를 사용해서 회원 가입 수행
		int result=dao.insert(m1);
		
		// result = Dao.insert(member);
		
		if(result==1) {
			System.out.println(m1.getMemberId()+"님 회원가입 성공~!");
		}else {
			System.out.println("회원가입 실패!");
		}
		// 회원 가입 결과 출력
		
	}
	
	private static void selectAllMembers() {
		
		System.out.println();
		System.out.println("----- 전체 회원 목록 -----");
		
		// Controller의 기능(method)를 사용해서 회원 전체 목록 검색
		Member[] list=dao.select();
		
		
		// 검색 결과를 출력
		for(Member m: list) {
			System.out.println(m);
		}
		// TODO:
		// Member[] =dao.select();
		// for(Member m: 배열){출력}
		
		System.out.println("----------------------");
		
		
	}
	
	private static void selectMemberByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		
		System.out.println("검색할 번호를 입력하세요.");
		int index=Integer.parseInt(scan.nextLine());
		//TODO:
		// 인덱스 입력>>
		
		Member m=dao.select(index);
		// Member =dao.select(index)
		System.out.println(m);
		// Member 출력
	}
	
	private static void updateMemberInfo() {
		System.out.println();
		System.out.println("----- 회원 정보 수정 화면 -----");
		
		System.out.println("수정할 번호를 입력하세요.");
		
		int index=Integer.parseInt(scan.nextLine());
		System.out.println("수정할 비밀번호를 입력하세요.");
		String password=scan.nextLine();
		int result=dao.update(index, password);
		
		if(result==1) {
			System.out.println("수정에 성공했습니다.");
		}else {
			System.out.println("수정에 실패헀습니다.");
		}
		// TODO:
		// 아이디 입력(변경할 인덱스 입력),변경할 패스워드 입력
		// result = dao.update(index, password);
		// 업데이트 결과 출력
	}
}

