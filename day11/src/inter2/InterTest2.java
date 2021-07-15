package inter2;

interface A {
	
	void prt(); // public abstract ¸Þ¼­µå
	default void view() {
		System.out.println("A interface View method");
	}
}

class Aimple immplements A {
	
	@Override
	public void prt() {
		System.out.println("Aimple class-prt method");
	}
	public void draw() {
		System.out.println("Aimple class-prt method");
}

public class InterTest2 {
	public static void main(String[] args) {

	}
}
