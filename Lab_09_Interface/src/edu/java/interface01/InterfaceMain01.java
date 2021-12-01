package edu.java.interface01;

// 인터페이스(interface)
// 사용 목적 : 팀/회사 간의 분업/협업을 하기 위해서 메서드(기능)들의 원형(prototype, signature)을 약속하기 위한 규약.
// 인터페이스가 가질 수 있는 멤버들:
// 1) 모든 필드(멤버 변수) 는 public static final임. public static final은 보통 생략해서 필드를 선언함.
// 2) 모든 메서드는 public abstract임. public abstract는 보통 생략해서 메서드를 선언함.
// 인터페이스는 interface 키워드를 사용해서 java 파일을 작성.
// 인터페이스의 추상 메서드들을 구현하는 클래스는 implements 키워드를 사용함.
// 클래스는 단일 상속만 가능하지만, 인터페이스는 구현하는 개수 제한이 없음.


public class InterfaceMain01 {

	public static void main(String[] args) {
		
		System.out.println(DatabaseModule.class);
		
		
		DatabaseModule db = new OracleDatabaseModule();
		
		db.update("s");
		// 구현된 인터페이스의 기능들을 사용
		OracleDatabaseModule odb=new OracleDatabaseModule();
		odb.select();
		
		DatabaseModule mydb=new MySqlDatabaseModule();
		mydb.select();
		mydb.update("aas");
				
	}
}
