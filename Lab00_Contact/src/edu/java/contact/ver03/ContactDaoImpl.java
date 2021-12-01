package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao{
	

	private List<Contact> con= new ArrayList<>();
	
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
	public List<Contact> select() {

		
		
		List<Contact> list=new ArrayList<>();
		
		for(Contact c: con) {
			list.add(c);
		}
		
		return list;
	}

	@Override
	public Contact select(int index) {
	

		if(index>=0&&index<con.size()) {
			Contact contact=new Contact();
			contact=con.get(index);
			return contact;
		}else {
			
			return null;
		}
	}

	@Override
	public int insert(Contact c) {
		
		int result=0;
		if(c!=null) {
			con.add(c);
			result=1;
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {

		int result=0;
		
		if(contact!=null) {
			
			con.set(index, contact);
			con.get(index).setEmail(contact.getEmail());
			con.get(index).setPhone(contact.getPhone());
			result=1;
		}
		
		return result;
	}

	@Override
	public int delete(int index) {
		
		int result=0;
		if(index>=0&&con.size()>index) {
			con.remove(index);
			result=1;
		}
		
		return result;
	}

}
