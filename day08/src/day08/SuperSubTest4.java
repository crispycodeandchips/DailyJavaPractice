package day08;

class Super4 {
	
	public Super4() {
		System.out.println("Super4 constructor");
	}
}

class Sub4 extends Super4 {

	public Sub4() {
		super();
		System.out.println("Sub4 constructor");
	}
	

}

public class SuperSubTest4 {
	public static void main(String[] args) {
		
		Sub4 ins=new Sub4();
	}
}
