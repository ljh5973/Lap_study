package edu.java.contact.ver02;

import java.util.Scanner;

import edu.java.contact.controller.ContactDaoImpl;
import edu.java.contact.menu.ContactMenu;
import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 View에 해당하는 클래스. UI를 담당.
public class ContactMain02 {

	public static Scanner scan = new Scanner(System.in);
	public static ContactDao dao= ContactDaoImpl.getInstance();

	public static void main(String[] args) {

		System.out.println("회원 관리 프로그램");
		boolean run = true;
		

		while (run) {
			int menu=showMenu();

			switch (menu) {
			case ContactMenu.QUIT:
				System.out.println("시스템을 종료합니다.");
				scan.close();
				run=false;
				
				break;
			case ContactMenu.INSERT:
				insert();
				break;
			case ContactMenu.SELECT_ALL:
				selectAll();
				break;
			case ContactMenu.SELECT_BY_INDEX:
				select();

				break;
			case ContactMenu.UPDATE:
				update();

				break;

			default:
				
				System.out.println(" 잘못 입력하셨습니다 . 다시 입력해주세요.");
				break;
			}

		}

	}
	
	
	private static int showMenu() {
	
		System.out.println("-------------------");
		System.out.println("[1] 전체보기 [2] 인덱스 검색 [3] 회원가입 [4] 정보수정 [0] 종료");
		
		int menu=Integer.parseInt(scan.nextLine());
		
		return menu;
	}
	
	private static void insert() {
		
		System.out.println("회원 가입 화면");
		System.out.println("회원의 이름을 입력해주세요.");
		String name=scan.nextLine();
		System.out.println("회원의 이메일을 입력해주세요.");
		String email=scan.nextLine();
		System.out.println("회원의 핸드폰번호를 입력해주세요.");
		String phone=scan.nextLine();
		Contact con=new Contact();
		
		con.setEmail(email);
		con.setName(name);
		con.setPhone(phone);
		
		int result=dao.insert(con);
		
		if(result==1) {
			
			System.out.println(con.getName()+"님 회원가입 성공~!");
		}else {
			System.out.println("회원가입 실패~!");
		}
	}
	
	private static void selectAll() {
		
		System.out.println("회원 전체 목록");
		
		Contact [] list=dao.select();
		
		for(Contact con: list) {
			System.out.println(con);
		}
		System.out.println("-----------");
	}
	private static void select() {
		
		System.out.println("회원 번호로 찾기");
		System.out.println("찾을 회원의 번호를 입력하세요.");
		
		int index=Integer.parseInt(scan.nextLine());
		
		Contact con=dao.select(index);
		
		System.out.println(con);
	}
	
	private static void update() {

		System.out.println("회원 정보 수정 화면");
		System.out.println("수정할 회원의 번호를 입력하세요.");
		
		int index= Integer.parseInt(scan.nextLine());
		System.out.println("수정할 회원의 이메일을 입력하세요.");
		String email=scan.nextLine();
		System.out.println("수정할 회원의 핸드폰 번호를 입력하세요.");
		String phone=scan.nextLine();
		
		Contact con=dao.select(index);
		con.setEmail(email);
		con.setPhone(phone);
		
		
		
		
		int result= dao.update(index, con);
		
		if(result==1) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
		
		
	}
}
