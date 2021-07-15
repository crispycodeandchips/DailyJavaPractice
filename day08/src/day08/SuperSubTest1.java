package day08;

class Super1 {

	public void prt() {
		System.out.println("super1-prt method");
	}
}

class Sub1 extends Super1 {

	public void draw() {
		System.out.println("sub1-draw method");
	}
}

public class SuperSubTest1 {

	public static void main(String[] args) {

		Super1 ins = new Super1();
		Sub1 ins2 = new Sub1();
		
		ins.prt();
		System.out.println("========");
		
		ins2.draw();
		ins2.prt();
		

	}

}
