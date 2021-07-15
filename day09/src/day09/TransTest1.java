package day09;

class Tr1 {
	public void prt() {
		System.out.println("Tr1... prt method");
	}
	public void view() {
		System.out.println("Tr1... view method");
	}
}

class SubTr1 extends Tr1 {
	public void draw() {
		System.out.println("SubTr1... draw");
	}
	@Override
	public void view() {
		super.view();
		System.out.println("SubTr1... view");
	}
	
	public void test() {
		
	}

}

public class TransTest1 {
	public static void main(String[] args) {
//		Tr1 ins = new Tr1();
//		ins.prt();
//		ins.view();
//		System.out.println("========");
//
//		SubTr1 ins2 = new SubTr1();
//		ins2.draw();
//		ins2.view();
//		ins2.prt();
		System.out.println("========");
		
		Tr1 ins3 = new SubTr1();
		
		SubTr1 ins4 = (SubTr1)new Tr1(); // int Long의 관계처럼 Tr1보다 SubTr1이 더 커서 Tr1에 SubTr1이 안 담김. 그래서 형변환.
									// 그렇지만 java.lang.ClassCastException 에러가 남. new로 실제 만든 애는 Tr1이라.
		                            // 변수 앞의 타입이 변수가 가르킬 수 있는(가르키는)  타입.
	
	
	}
	
	

}
