package edu.java.contact.ver02;

<<<<<<< HEAD
import edu.java.contact.ver02.Contact;
=======
import edu.java.contact.model.Contact;
>>>>>>> fad2a5a969df4d5385e60b29023d879258b6abd1

// MVC 아키텍처에서 Controller 인터페이스
public interface ContactDao {

	
	Contact[] select();
	
	Contact select(int index);
	
	int insert(Contact con);
	
	int update(int index, Contact con);
	
	
}
