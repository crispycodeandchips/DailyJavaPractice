package th1;

class Job2 implements Runnable{
    private String str;
	public Job2(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println(str+"thread ������ ");
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Job2 ins=new Job2("������1");
          Thread th1=new Thread(ins);
          
          th1.start();
	}
}
