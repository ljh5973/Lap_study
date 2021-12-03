package edu.java.inner04;

public class Button {

	private String btnName;
	private OnClickListener listener;

	public static interface OnClickListener {
		void onClick(); // 추상 메서드(abstract method)
	}

	public Button(String btnName) {
		this.btnName = btnName;

	}
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}

	public void click() {
		System.out.print(btnName+ " 버튼 :");
		listener.onClick();
		
	}
	

}
