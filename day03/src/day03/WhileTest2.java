package day03;

public class WhileTest2 {
	public static void main(String[] args) {

		// 1  3  5  7  9

//		int i = 0;
//		while(i<9) // 조건이 <=면 10까지 나오게 되니까 9
//		{
//			i++;
//			if (i%2==1)
//
//				System.out.print(i+"  "); // 증가했을 때 i 값이 1이 되어야 하니까 초기값은 0
//		}
		
		//1. 5부터 10까지
		
		// 출력할건지 조건을 먼저 생각할건지
		// 단계를 먼저 생각 
		
//		int i = 4;
//		while(i<9) {
//			
//			i++;
//			
//			System.out.print(i+" ");
//		}
//		System.out.print("10");
		
		//2. 10부터 5까지
		
		int i = 11;
		while (i>6) {
			
			i--;
			System.out.print(i+" ");
			
		}
	}

}
