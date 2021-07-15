package inter1;

/*
 * 	인터페이스
 * 	interface 인터페이스 이름 {
 * 
 * 	}
 * 	public abstract method
 * 	class 에서 인터페이스 상속받을 떄는 implements로 사용
 * 	생성자가 없음!!!
 * 	클래스 메서드는 사용 가능!
 * 	public static final 변수(상수)
*/
public interface Flyable {
	void prt();
	int num = 10; // public static final 변수
	static void print() {
		System.out.println("prt!!!");
	} // jdk8 이상부터

	default void draw() {
		System.out.println("draw");
	} // jdk8 이상부터 사용 가능
}
