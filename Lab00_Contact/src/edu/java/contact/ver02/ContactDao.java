package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

// MVC 아키텍처에서 Controller 인터페이스
public interface ContactDao {

	
	Contact[] select();
	
	Contact select(int index);
	
	int insert(Contact con);
	
	int update(int index, Contact con);
	
	
}
