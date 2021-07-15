package day06;

class Access1 {
	private int num; // 정보 은닉

	Access1(int num) {
		if (num < 0)
			num = 0;
		this.num = num;
	}
	
	void prt()
	{
		System.out.println("num :"+num);
	}
}

public class AccessTest1 {
	public static void main(String[] args) {

//		Access1 ins = new Access1();
//		ins.num = -100;
//		System.out.println(ins.num);

		Access1 ins = new Access1(-10);
		ins.prt();
	}
}
