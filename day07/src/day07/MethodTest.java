package day07;

class Man1 {
	public String prt()
	{
		return "hong";
	}
}

public class MethodTest {
	public static void main(String[] args) {
		
		Man1 ins = new Man1();
		String name = ins.prt(); // �޾ƿͼ� name�� ������ ����
		System.out.println(name);
		
		System.out.println("======");
		ins.prt(); // �޾ƿͼ� ��� �ٸ����� �� ��� �׳� ����.
	}
}
