package day09;

class Trans2 {

	public void prt() {
		System.out.println("Trans2-prt method");
	}

	public void view() {
		System.out.println("Trans2-View method");
	}
}

class SubTrans2 extends Trans2 {
	@Override
	public void view() {
		// super.view();
		System.out.println("SubTrans2-view method");
	}

	public void print() {
		super.view();
		this.view();
	}
}

public class TransTest2 {
	public static void main(String[] args) {

		//Trans2 ins = new SubTrans2(); ins.prt(); ins.view();
		
		SubTrans2 ins2 = new SubTrans2(); 
//		ins2.view();
		ins2.print();
	}
}
