package day04;

import java.util.Scanner;

public class Exersise {
	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println(" 1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------------------");
			System.out.print("����");
			
			String ch = sc.nextLine();
			int money = 0;
			
			if(ch.equals("1"))
			{
				System.out.println("���ݾ�>>");
				money = Integer.parseInt(sc.nextLine());
				balance += money;
				
			}else if(ch.equals("2"))
			{
				System.out.println("��ݾ�>>");
				money = Integer.parseInt(sc.nextLine());
				balance -= money;
				
			}else if(ch.equals("3"))
			{
				System.out.println("�ܰ�: "+balance);
			}else if(ch.equals("4"))
			{
				break;
			}else {
			System.out.println("�Է¿���!!!");	
			}
			
		
		} // while

		System.out.println("���α׷� ����");
	} // main	
} // class
