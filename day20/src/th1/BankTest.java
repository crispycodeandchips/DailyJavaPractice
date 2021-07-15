package th1;

class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Bank bank=new Bank("hong", 100); //공유자원  critical section:임계영역
            
            ThDeposit j1=new ThDeposit(bank);
            ThWidthdraw j2=new ThWidthdraw(bank);
            
            Thread th=new Thread(j1);
            Thread th2=new Thread(j2);
            
            th.start();
            th2.start();
	}

}