package edu.java.contact.ver01;

import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain01 {

	private static final int MAX_LENGTH = 5;

	private static Scanner scanner = new Scanner(System.in);
	private static Contact[] contacts = new Contact[MAX_LENGTH];
	private static int count = 0; // 배열에 현재까지 저장된 연락처 개수

	public static void main(String[] args){
		
//		Contact[] contacts= new Contact[MAX_LENGTH];
		Contact c = new Contact();

		boolean run = true;
		
		
			
			while (run) {

				System.out.println("*** 연락처 프로그램 ver 0.1 ***");

				showMainMenu();

				int select = scanner.nextInt(); // 콘솔에서 "Enter" 키 까지 입력된 정수만 읽고, "Enter"는 버퍼에 남겨둠.
				scanner.nextLine();
				// 숫자 뒤에 키보드로 입력한 "엔터"를 버퍼에서 읽고 버림.
				// 숫자 다음에 문자열을 입력받아야 하는 경우, 문자열을 제대로 입력받기 위해서 사용
				

				switch (select) {
				case 1:
					// 전체 검색- 배열에 저장된 모든 연락처 출력
					allSearch(contacts);

					break;
				case 2:
					// 인덱스 검색 - 검색하고자 하는 인덱스의 연락처 1개만 출력
					selectContactByIndex(contacts);

					break;
				case 3:
					// 연락처 추가
					if (count < MAX_LENGTH) {

						insertContact(contacts);
					} else {
						System.out.println("저장공간이 부족합니다.");
						System.out.println();
					}

					break;
				case 4:
					// 연락처 수정
					updateContact(contacts);

					break;
				case 0:
					System.out.println("연락처 프로그램을 종료합니다.");
					run = false;
					scanner.close();
					break;

				default:

					System.out.println("번호를 다시 입력해주세요.");
					break;
				}
			}
			
	

	

	}

	private static void showMainMenu() {

		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println(" 선택 >>>");
	}

	private static void allSearch(Contact[] con) {

		if (count > 0) {

			System.out.println("---연락처 전체 리스트---");
//		for (Contact c : con) {
//			System.out.println(c);
//
//		}

			for (int i = 0; i < count; i++) {
				System.out.println(con[i]);
			}
			System.out.println("------------------------");

			System.out.println();
		} else {
			System.out.println("저장된 정보가 없습니다.");
			System.out.println();
		}

	}

	private static void selectContactByIndex(Contact[] con) {

		System.out.println("----- 인덱스 검색 기능 -----");

		System.out.println("검색할 번호를 입력해주세요.");
		int num = scanner.nextInt();
		scanner.nextLine();

		if (num < MAX_LENGTH) {

			if (con[num - 1] != null) {

				System.out.println(con[num - 1]);
			} else {
				System.out.println("없는 번호 입니다.");
			}
		} else {
			System.out.println("번호를 다시 입력해주세요.");
		}

		System.out.println("--------------------------------------------------------");
	}

	private static void insertContact(Contact[] con) {

		System.out.println("----- 연락처 추가 -----\n");
		System.out.println("추가할 이름을 입력해주세요.");
		String name = scanner.nextLine();
		System.out.println("추가할 핸드폰 번호를 입력해주세요.");
		String phone = scanner.nextLine();

		System.out.println("추가할 이메일을 입력해주세요.");
		String email = scanner.nextLine();

		Contact c = new Contact(name, phone, email);
		con[count] = c;

		count++;
		System.out.println("새 연락처 추가 성공(" + count + ")");
		System.out.println();

	}

	private static void updateContact(Contact[] con) {
		for (int i = 0; i < con.length; i++) {

			System.out.print("[" + (i + 1) + "] 번 :");
			System.out.println(con[i]);
		}

		System.out.println(" 수정할 번호를 입력해주세요.");

		int select = scanner.nextInt();
		scanner.nextLine();
		
		if(select<0||select >=count) {
			System.out.println("수정할 내용이 없습니다.");
		}else {
			
		
				
				System.out.println("수정할 이름을 입력해주세요.");
				String name = scanner.nextLine();
				System.out.println("수정할 이메일을 입력해주세요.");
				String email = scanner.nextLine();
				System.out.println("수정할 핸드폰 번호를 입력해주세요.");
				String phone = scanner.nextLine();
				
				con[select - 1].setEmail(email);
				con[select - 1].setName(name);
				con[select - 1].setPhone(phone);
			
		}


	}
}
