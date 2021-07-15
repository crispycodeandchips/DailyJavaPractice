package day07;

class Final2 {
	
	static final int num = 10;
	static final int[] num2; //클래스 변수
	static {
		
		num2 = new int[3];
		
		for(int i=0; i<num2.length; i++)
			num2[i] = i * 100;
	}
	
}


public class StaticFinal4 {
	public static void main(String[] args) {
		
	int[] arr = Final2.num2;
	
	for(int item: arr)
		System.out.println(item);
	}

}