package day08;

public class CreditLine extends Bank {

	public CreditLine(String bankNo, String name, int balance, int limit) {
		super(bankNo, name, balance, limit);
		
	}
	
	@Override
	public void withdraw(int money) {
		
		if(getBalance() - getLimit() < money) {
			
			System.out.println("입력오류");
		
		}else
			setBalance(getBalance()-money);
	}
	

}
