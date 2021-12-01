package edu.java.file06;

import java.io.Serializable;

// Object 타입으로 파일에 write 하거나, 파일에서 read를 하려면
// 그 클래스는 Serializable 인터페이스를 구현해야 함. -> "직렬화" 가능이라는 선언.
// SErializable은 구현해야 할 추상 메서드는 없음.
public class Product implements Serializable{

	
	// field
	private int productId; // 상품번호
	private String productName; // 상품 이름
	private int productPirce; // 상품 가격
	
	
	// construct
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, int productPirce) {
		this.productId = productId;
		this.productName = productName;
		this.productPirce = productPirce;
	}
	


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPirce() {
		return productPirce;
	}


	public void setProductPirce(int productPirce) {
		this.productPirce = productPirce;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPirce=" + productPirce
				+ "]";
	}
	
	
	
	
	
	
}
