package edu.java.contact.ver02;

import edu.java.contact.ver02.Contact;
import edu.java.contact.ver02.ContactDao;

public class ContactDaoImpl implements ContactDao{
	
	private static final int MAX_NUM=5;

	private Contact[] con=new Contact[MAX_NUM];
	private int count=0;
	
	private static ContactDaoImpl instance=null;
	
	private ContactDaoImpl() {
		
	}
	
	public static ContactDaoImpl getInstance() {
		if(instance==null) {
			instance=new ContactDaoImpl();
		}
		return instance;
	}

			
	@Override
	public Contact[] select() {
		Contact[]arr=new Contact[count];
		
		for(int i=0; i<count; i++) {
			arr[i]=con[i];
		}
		return arr;
	}

	@Override
	public Contact select(int index) {

		if(index>=0&&index<MAX_NUM) {
			
			Contact contact=con[index];
			return contact;
		}else {
			
			return null;
		}
		
	}

	@Override
	public int insert(Contact contact) {
		int result=0;
		
		if(count<MAX_NUM) {
			con[count]=contact;
			count++;
			result=1;
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		
		int result=0;
		if(index>=0&&index<count) {
			
			
			
			con[index].setEmail(contact.getEmail());
			con[index].setPhone(contact.getPhone());
			result=1;
		}
		return result;
	}

}
