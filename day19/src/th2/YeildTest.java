package th2;

class Job1  implements Runnable{
	private String str; 
	private boolean flag; 
	public Job1(String str)
	 {
		 this.str=str;
	 }
	
    public void setFlag(boolean flag) {
             this.flag=flag;
      }

    public void run() {
         for(int i=0; i<10; i++){
             try{
                    Thread.sleep(400);
                 }  catch(InterruptedException e) {
                  System.out.println(e);
                  }         
         if(flag) {
                 System.out.println(str+" working");
                 }  else  {
                  Thread.yield();
                  }
            }
                System.out.println(str+" 종료");
        }
}
public class YeildTest {
   public static void main(String[] args) {
	   Job1 ins=new Job1("쓰레드1");
	   Job1 ins2=new Job1("쓰레드2");
  
	    Thread j1=new Thread(ins);
	    Thread j2=new Thread(ins2);
	    
	    j1.start();
	    j2.start();
	    
	
	   try {
	   	Thread.sleep(400);
	  	} catch(InterruptedException e) {
	  		System.out.println(e);
	  	}
	    
	  ins.setFlag(false);
	  ins2.setFlag(false);
   
   
   }
}
