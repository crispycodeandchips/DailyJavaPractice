package day14;

import java.io.IOException;

class Sample1 {
	public void prt(int num) {

		try {
			if (num < 0)
				throw new IOException("입력오류");
			System.out.println(num + "는 양수");
		} catch (IOException e) {
			System.out.println("받았어요..." + e);
			System.out.println("ioException catch 영역");
		} finally {
			System.out.println("prt finally");
		}
	} // prt method
} // class

public class ExceptionTest8 {
	public static void main(String[] args) {
		Sample1 ins  = new Sample1();
		ins.prt(-1);
	}
}
