package day04;

import java.util.Scanner;

public class Exersise {
	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택");
			
			String ch = sc.nextLine();
			int money = 0;
			
			if(ch.equals("1"))
			{
				System.out.println("예금액>>");
				money = Integer.parseInt(sc.nextLine());
				balance += money;
				
			}else if(ch.equals("2"))
			{
				System.out.println("출금액>>");
				money = Integer.parseInt(sc.nextLine());
				balance -= money;
				
			}else if(ch.equals("3"))
			{
				System.out.println("잔고: "+balance);
			}else if(ch.equals("4"))
			{
				break;
			}else {
			System.out.println("입력오류!!!");	
			}
			
		
		} // while

		System.out.println("프로그램 종료");
	} // main	
} // class
