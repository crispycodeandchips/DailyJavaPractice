package th1;

class Bank {
	   private String name;
	   private int balance;
	   
	   public Bank(String name, int balance) {
		   this.name=name;
		   this.balance=balance;
	   }
		
	   public synchronized void widthdraw(int money) throws Exception {
		    if(balance<money) {
		      throw new Exception("ÀÜ°íºÎÁ·");
		    }
		      balance-=money;
		       System.out.println("Ãâ±Ý±Ý¾× :"+money+", ÀÜ¾×:"+balance);
	   }
		
	   public synchronized void deposit(int money) {
		    balance+=money;
		    System.out.println("ÀÔ±Ý±Ý¾× :"+money+", ÀÜ¾× :"+balance);
	   }
		
	}
