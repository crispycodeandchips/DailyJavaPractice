package com.keylime.test;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		MemberMenu menu=new MemberMenu(sc);
		while(true)
		{
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 전체보기");
			System.out.println("6. 프로그램 종료");
			String ch=sc.nextLine();
			
			if(ch.equals("1"))
			    menu.insert();
			else if(ch.equals("2"))
				 menu.modify();
			else if(ch.equals("3"))
				 menu.delete();
			else if(ch.equals("4"))  //조회
			    menu.searchMember();
			else if(ch.equals("5"))
				menu.view();
			else if(ch.equals("6"))
			{
				System.out.println("프로그램 종료");
				break;
			}
			else
				System.out.println("기능 선택이 잘못되었습니다.");
		}
	}
}
