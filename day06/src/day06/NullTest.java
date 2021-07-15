package day06;

// String : 클래스다 ... 클래스도 배열을 만들 수 있다.

class Sample {
	public void prt()
	{
		System.out.println("prt");
	}
}

public class NullTest {

	public static void main(String[] args) {
		
		Sample ins = null;
		ins.prt();
		/*
		 * Exception 어쩌구 저쩌구 nullpointerexception 에러가 뜸
		 */
	}
}
