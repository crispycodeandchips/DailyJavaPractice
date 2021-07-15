package day14;

class Job extends Thread {
	public Job(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(System.currentTimeMillis());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		} // for
	} // run
} // class

public class SystemTest3 {
	public static void main(String[] args) {
		
		Job j = new Job("thread");
	         j.start();
	}

}
