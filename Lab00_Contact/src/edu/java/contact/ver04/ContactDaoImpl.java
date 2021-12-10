package edu.java.contact.ver04;

import java.io.File;
import java.util.List;

import static edu.java.contact.fileutil.ContactFileUtill.*;	// 모든 static 멤버(변수 ,메서드)를 import

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {

	private List<Contact> con;
	private File dataFile;
	private File dataDir;

	private static ContactDaoImpl instance = null;

	private ContactDaoImpl() {
		// TODO: 현재 작업 디렉토리(CWD)에 (data 폴더가 없으면) data 폴더를 생성.
		dataFile = new File(DATA_DIR, DATA_FILE);
		

		dataDir= initailizeDataDir();
		// TODO: data 폴더에 있는 contacts.dat 파일을 읽어서 필드 contacts 를 초기화.
		con=initializeData();
	}

	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Contact> select() {
		return con;
	}

	@Override
	public Contact select(int index) {

		if (index >= 0 && index < con.size()) {
			Contact contact = new Contact();
			contact = con.get(index);
			return contact;
		} else {

			return null;
		}
	}

	@Override
	public int insert(Contact c) {

		con.add(c);
		// TODO: 파일에 변경된 ArrayList 를 씀.
		writeDataToFile(con, dataFile);
		return 1;
	}

	@Override
	public int update(int index, Contact contact) {

		int result = 0;

		if (contact != null) {

			con.set(index, contact);
			con.get(index).setEmail(contact.getEmail());
			con.get(index).setPhone(contact.getPhone());
			// TODO: 파일에 변경된 ArrayList 를 씀.

			writeDataToFile(con, dataFile);
			result = 1;
		}

		return result;
	}

	@Override
	public int delete(int index) {

		int result = 0;
		if (index >= 0 && con.size() > index) {
			con.remove(index);
			// TODO: 파일에 변경된 ArrayList 를 씀.
			writeDataToFile(con, dataFile);
			result = 1;
		}

		return result;
	}

}
