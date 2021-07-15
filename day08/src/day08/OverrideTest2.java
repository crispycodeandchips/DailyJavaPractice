package day08;

public class OverrideTest2 {
	
	public static void main(String[] args) {
		
		Bank b1 = new Bank("111", "hong", 100, 0);
		b1.deposit(100);
		b1.print();
		
		b1.deposit(50);
		b1.print();
		
		b1.withdraw(400);
		b1.deposit(150);
		b1.print();
		System.out.println("======");
		b1.withdraw(300);
		b1.print();
		
		System.out.println("==========");
		
		CreditLine c1 = new CreditLine("2222", "park", 100, 1000);
		c1.deposit(400);
		c1.print();
		
		
	}

}

