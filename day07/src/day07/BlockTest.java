package day07;

class Sample1 {
	static {
		System.out.println("static 초기화 블록"); 
		//클래스 불러올 때 맨 처음 한번만 동작하는 애
	}
//	{
//		System.out.println("초기화 블록");
//	}

Sample1() {
	System.out.println("생성자!!!!!");
}

}

public class BlockTest {
	public static void main(String[] args) {
		Sample1 ins = new Sample1();
		Sample1 ins2 = new Sample1();
	}

}
