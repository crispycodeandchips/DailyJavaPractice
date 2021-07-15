package day09;

public class Sub1 extends Super1 {

	private String hakno;
	private String dept;
	
	public Sub1(String name, int age, String addr, String hakno, String dept) {
		//super(name, age, addr);
		//this(hakno, dept); // super를 맨 위에 쓰는 순간 다른 생성자들은 축약형으로 호출이 안됨.
		// this와 Super는 혼용형으로 사용이 불가!
		this(name, age, addr, hakno); // super와 분리하지 말고 this와 일체형으로 묶어버려야 함.
		this.dept = dept;
	}
	public Sub1(String name, int age, String addr, String hakno){
		super(name, age, addr);
		this.hakno = hakno;
	}
	public Sub1(String hakno, String dept) {
		this.hakno = hakno;
		this.dept = dept;
	}
	
}
