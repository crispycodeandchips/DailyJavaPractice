package th2;

class ThDeposit implements Runnable{

	private Bank bank;
    public ThDeposit(Bank bank) {
		// TODO Auto-generated constructor stub
	     this.bank=bank;
    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(400);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
			synchronized (bank) {
				bank.deposit(10);
				
			}
			
		}
		
	}

}
