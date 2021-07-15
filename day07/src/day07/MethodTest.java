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
		String name = ins.prt(); // 받아와서 name에 저장을 했음
		System.out.println(name);
		
		System.out.println("======");
		ins.prt(); // 받아와서 어디 다른데에 안 담고 그냥 버림.
	}
}
