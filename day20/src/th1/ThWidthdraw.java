package th1;

class ThWidthdraw implements Runnable{

	private Bank bank;
	public ThWidthdraw(Bank bank) {
		this.bank=bank;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	for(int i=0; i<10; i++) {
		
		try {
 			Thread.sleep(400);
         
		} catch(Exception e)
		{
			System.out.println(e);
		}
		try {
		bank.widthdraw(10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	    }
	}

}
