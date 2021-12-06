package edu.java.inner04;

import edu.java.inner04.Button.OnClickListener;

public class InnerMain04 {

	public static void main(String[] args) {
		//Button 클래스의 인스턴스
		
		Button btnFinish=new Button("Finish");
		
		// Button.OnclickListener 인터페이스를 구현하는 클래스의 인스턴스를 생성
		FinishListener fi=new FinishListener();
		// 종료 버튼의 listener를 설정
		btnFinish.setOnClickListener(fi);	// 버튼이 할 일을 버튼에 설정.
		
		// 생성도니 종료 버튼 클릭
		btnFinish.click();	// 버튼을 클릭.
		
		// 취소 버튼 생성
		Button btnCancel = new Button("Cancel");
		
		// 취소 버튼이 해야 할 일을 정의하고, 취소 버튼에 설정
		
		btnCancel.setOnClickListener(new CancelListener());
		
		btnCancel.click();
	}
}

// OnclickListener 인터페이스를 구현하는 클래스
class FinishListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println(" 종료 합니다. ");
		
	} 
	
}

// static은 import 가능  (interface
class CancelListener implements OnClickListener{
	
	@Override
	public void onClick() {
		System.out.println(" 취소 합니다.");
	}
}
