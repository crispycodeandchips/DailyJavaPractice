package day14;

import java.io.IOException;

class Sample1 {
	public void prt(int num) {

		try {
			if (num < 0)
				throw new IOException("�Է¿���");
			System.out.println(num + "�� ���");
		} catch (IOException e) {
			System.out.println("�޾Ҿ��..." + e);
			System.out.println("ioException catch ����");
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
