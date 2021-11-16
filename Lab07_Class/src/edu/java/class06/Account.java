package edu.java.class06;


//	은행 계좌 class
//	속성(상태, 데이터): 계좌번호, 잔액
//	기능: 입금(deposit), 출금(widthdraw), 이체(transfer), 정보보기(info)
public class Account {

	int accountNum;	//계좌번호
	double balance;		//잔액
	
	

	public Account(int accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	/**
	 *	입금(deposit) - balance를 금액 (amount) 만큼 증가
	 *	@param money
	 *
	 *	@return 입금 후 잔액
	 */
	
	public double deposit(double amount) {
		this.balance+=amount;
		
		return balance;
	}
	
	/**
	 * 출금(widthDraw) - balacne 를 금액 (amount) 만큼 감소
	 * @param amount
	 * @return 출금 후 잔액
	 */
	
	public double widthDraw(double amount) {
		if(this.balance>amount) {
			
			this.balance-=amount;
			
			return balance;
		}else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("출금을 할 수없습니다.");
			return 0;
		}
	}
	
	
	/**
	 * 이체(transfer) - amount 금액을 to 계좌로 이체.
	 * @param to - Account
	 * @param amount -double. 이체할 금액
	 * @return true(이체 성공) 리턴.
	 */
	
	public boolean transfer(Account to, double amount) {
		
		if(this.balance>amount) {
			this.balance-=amount;
			to.balance+=amount;
			
			return true;
			
		}else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("이체를 할 수 없습니다.");
			return false;
		}
	}
	
	
	public void info() {
		System.out.println("---------- 계좌정보 ----------");
		System.out.println("계좌번호 : "+ accountNum);
		System.out.println("잔액 : "+ balance);
	}
	
}
