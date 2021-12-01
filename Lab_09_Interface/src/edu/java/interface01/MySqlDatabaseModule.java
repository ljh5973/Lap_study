package edu.java.interface01;

public class MySqlDatabaseModule implements DatabaseModule{

	@Override
	public int select() {
		
		System.out.println("MYSQL select...");
		return 0;
	}

	@Override
	public int update(String pw) {
		System.out.println("MYSQL update(" + pw+ ")....");
		return 0;
	}

}
