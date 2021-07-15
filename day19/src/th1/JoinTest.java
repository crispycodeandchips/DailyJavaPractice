package th1;

class Job4 implements Runnable{
	private String str;
	public Job4(String str)
	{
		this.str=str;
	}
	@Override
	public void run() {
		System.out.println("������ ���� :"+str);
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
		{
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 System.out.println(e);
			 }
			  System.out.println(str+"������..."+i);			
		}
		System.out.println("������ ����:"+str);
	}	
}


public class JoinTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Job4 ins=new Job4("job1");
         Thread th1=new Thread(ins);
         th1.start();
		
         System.out.println("main������ ����");
         try {
         th1.join();
         } catch(InterruptedException e) {
        	 System.out.println(e);
         }
         
         for(int i=0; i<10; i++){ 
			try {
			Thread.sleep(500);
			} catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("main thread : "+i);
		}
		System.out.println("main ������ ����");
		
	}
}
