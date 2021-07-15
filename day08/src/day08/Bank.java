package day08;

public class Bank {
	
		private String bankNo;
		private String name;
		private int balance;
		private int limit;

		public Bank(String bankNo, String name, int balance, int limit) {

			this.bankNo = bankNo;
			this.name = name;
			this.balance = balance;
			this.limit = limit;
		}
		
		public void print() {
			System.out.println("계좌번호: " +bankNo);
			System.out.println("통장이름: " +name);
			System.out.println("잔고: " +balance);
		}

		
		public int getLimit() {
			return limit;
		}
		
		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public void deposit(int money) { // 입금
			
		} 

		public void withdraw(int money) { // 출금
			if (balance < money)
				System.out.println("입력오류");
			else
				balance -= money;
		}
	}


