package day14;

import java.io.IOException;

class Sample {
	public void prt(int num) throws IOException {

		if (num < 0)
			throw new IOException("�Է¿���");
		System.out.println(num + "�� ���");
	}
}

public class ExceptionTest7 {
	public static void main(String[] args) /* throws IOException */ {
		Sample ins = new Sample();
		try {
			ins.prt(-1);
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("�����޼���...");
		} finally {
			System.out.println("���α׷� ����");
		}
	}
}