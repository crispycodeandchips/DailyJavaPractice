package th2;

class Bank {
	   private String name;
	   private int balance;
	   
	   public Bank(String name, int balance) {
		   this.name=name;
		   this.balance=balance;
	   }
		
	   public void widthdraw(int money) throws Exception {
		    if(balance<money) {
		      throw new Exception("�ܰ����");
		    }
		      balance-=money;
		       System.out.println("��ݱݾ� :"+money+", �ܾ�:"+balance);
		       
		       
	   }
		
	   public  void deposit(int money) {
		    balance+=money;
		    System.out.println("�Աݱݾ� :"+money+", �ܾ� :"+balance);
	   }
		
	}