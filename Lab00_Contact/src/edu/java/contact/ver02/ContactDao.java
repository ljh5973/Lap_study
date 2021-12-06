package edu.java.contact.ver02;

<<<<<<< HEAD
import edu.java.contact.model.Contact;
=======
import edu.java.contact.ver02.Contact;
>>>>>>> 6ba44a3796e3a6e34474e0de01946f26af45e344

// MVC 아키텍처에서 Controller 인터페이스
public interface ContactDao {

	
	Contact[] select();
	
	Contact select(int index);
	
	int insert(Contact con);
	
	int update(int index, Contact con);
	
	
}
