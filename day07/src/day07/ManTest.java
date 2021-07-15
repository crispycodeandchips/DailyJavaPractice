package day07;
/*
 * 메서드 오버로딩(method overloading)
 * 같은 클래스 내에서 같은 이름의 메서드가 여러개 있는 것.
 * ex) 전부 다 다르지만 이름만 같은 메서드
 * void prt(){}
 * void prt(String name){}
 * void prt(int su){}
 * void prt(String name, String addr){}
 * void prt(String name, int age){}
 * void prt(int age, String name){}
 * 
 * ※ 오버로딩이 안되는 경우
 * ex) 이름도 같고 실제로도 같은 메서드 (둘 다 스트링)
 * void prt(String name, String addr){}
 * void prt(String addr, String name){}
*/

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man ins = new Man();
		ins.modify("hong", 20);
		ins.print();

		Man ins2 = new Man();
		System.out.println("======");
		ins2.modify("kim", "seoul");
		ins2.print();
	}

}
