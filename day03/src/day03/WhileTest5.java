package day03;

import java.util.Scanner;

public class WhileTest5 {
	public static void main(String[] args) {

//		10 입력, 10 밑의 홀수 합을 모두 더해서 10이 넘기 전에 stop.
//		1 3 5 7 9 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());

//		int i = 1, tot = 0;
//		while (true) { // while은 조건이 참일 동안 계속 반복이므로 계속 반복하면 무한루프
//
//			if (i % 2 == 1) {
//				tot += i;
//				if (tot > num)
//					break;
//				System.out.println(i + " ");
//			}
//			i++;
//		}
		
		int tot=0;
		for (int i=1;  ; i++) 
		{
			if(i%2==1) {
				tot += i;
				if(tot>num) break;
				System.out.println(i+"  ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}