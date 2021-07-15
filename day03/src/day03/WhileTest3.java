package day03;

import java.util.Scanner;

public class WhileTest3 {
	
	public static void main(String[] args) {
		
		// 5부터 10까지
		int i = 5;
		while(i<=10) {
			
			System.out.print(i+" ");
			i++;
		}
			System.out.println();
		
		
		// 10부터 5까지
		i=10;
		while(i>=5) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
//		//시작값과 끝값을 입력받아 그 구간을 출력.
//		//시작값 3 끝값 10
//		Scanner sc = new Scanner(System.in);
//		System.out.println("input start");
//		int s = Integer.parseInt(sc.nextLine());
//		System.out.println("input end");
//		int e = Integer.parseInt(sc.nextLine());
//		
//		//증가부터 할건지 출력부터 할건지
//		i=s;
//		while(i<=e) {
//			
//			System.out.print(i+" ");
//			i++;
//		}
//		System.out.println();
		
//		//숫자를 입력받아서 1부터 그 값까지 출력한 후 합계를 구하시오 (for, while)
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = Integer.parseInt(sc1.nextLine());
//		
//		int j = num;
//		int sum = 0;
//		while (1 <= j ) {
//			
//			{
//			System.out.print(j);
//			j++;
//			}
//			sum += j;
//			System.out.println(sum);
//		}
	
		
	}

}
