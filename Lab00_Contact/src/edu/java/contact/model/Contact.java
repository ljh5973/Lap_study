package edu.java.contact.model;

public class Contact {
	// field
	private String name;
	private String phone;
	private String email;

	// TODO: 생성자 - default, 파라미터 3개인 생성자

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// TODO: getters & setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Contact{name:" + name + ", phone:" + phone + ", email:" + email + "}";
	}
}
