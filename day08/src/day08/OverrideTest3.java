package day08;

class Parent2 {
	
	public void prt() {
		System.out.println("parent-prt");
	}
}

class Child2 extends Parent2 {
	
	@Override
	public void prt() {
		System.out.println("child-prt");
	}
	
}
public class OverrideTest3 {

	public static void main(String[] args) {
		
		Parent2.prt();
		child2.prt();
		
		
	}
}
