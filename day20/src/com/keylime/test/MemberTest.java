package com.keylime.test;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		MemberMenu menu=new MemberMenu(sc);
		while(true)
		{
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ��ȸ");
			System.out.println("5. ��ü����");
			System.out.println("6. ���α׷� ����");
			String ch=sc.nextLine();
			
			if(ch.equals("1"))
			    menu.insert();
			else if(ch.equals("2"))
				 menu.modify();
			else if(ch.equals("3"))
				 menu.delete();
			else if(ch.equals("4"))  //��ȸ
			    menu.searchMember();
			else if(ch.equals("5"))
				menu.view();
			else if(ch.equals("6"))
			{
				System.out.println("���α׷� ����");
				break;
			}
			else
				System.out.println("��� ������ �߸��Ǿ����ϴ�.");
		}
	}
}
