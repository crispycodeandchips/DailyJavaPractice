package day06;

// String : Ŭ������ ... Ŭ������ �迭�� ���� �� �ִ�.

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
		 * Exception ��¼�� ��¼�� nullpointerexception ������ ��
		 */
	}
}
