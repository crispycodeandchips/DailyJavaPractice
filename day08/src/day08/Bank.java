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
			System.out.println("���¹�ȣ: " +bankNo);
			System.out.println("�����̸�: " +name);
			System.out.println("�ܰ�: " +balance);
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

		public void deposit(int money) { // �Ա�
			
		} 

		public void withdraw(int money) { // ���
			if (balance < money)
				System.out.println("�Է¿���");
			else
				balance -= money;
		}
	}


