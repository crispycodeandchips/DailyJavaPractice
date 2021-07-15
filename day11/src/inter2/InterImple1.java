package inter2;

import inter1.Flyable;

public class InterImple1 implements Flyable, Makable {
	// default protected public 
	
	@Override
	public void prt() {
		System.out.println("prt method");
	}
	
	@Override
	public void make() {
		
	}

}
