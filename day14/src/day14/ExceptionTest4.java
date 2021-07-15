package day14;

class Cal {
	private int num1;
	private int num2;
	public Cal(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int div() {
		//return num1/num2; // ArithmeticException
		
		int result = 0;
		try { // 적극적 개입
			result = num1/num2;
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요!!!");
		}
		return result;
	}
}

public class ExceptionTest4 {

	public static void main(String[] args) {
		Cal ins = new Cal(10,0);
		System.out.println(ins.div());
	}
}
