package th1;

class Job extends Thread{

	public Job(String str) {
		super(str);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {

			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

			System.out.println(getName()+"Thead 동작중 ..."+i);
		}
	}
}


public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job j1=new Job("쓰레드1");
		Job j2=new Job("쓰레드2");

		j1.start();
		j2.start();
		
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("main");
		}
		
	}

}
