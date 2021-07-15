package day08;

class Super5 {
	
	private String name;
	public Super5(String name) {
		this.name = name;
	}
	// public Super5() {} // subclass에서 호출한 생성자는 이 기본 생성자가 아니라 String name을 값으로 받는 생성자이기 때문에
	// 이 기본 생성자를 호출할 경우 에러가 남.
}

class Sub5 extends Super5 {
	public Sub5(String name) {
		// super("hong");
		super(name);
		
	}
}

public class SuperSubTest5 {

}
