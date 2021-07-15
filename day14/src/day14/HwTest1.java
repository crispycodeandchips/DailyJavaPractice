package day14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HwTest1 {
	
	public static void main(String[] args) {
		
		// Split - 특정 문자를 기준으로 잘라줌
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input email");
//		String email = sc.nextLine();
//		
//		String data = "abcabcabc";
//		String[] result = data.split("b");
//		for (String item : result) // item -> i=0; //
//		System.out.println(item);
		
		
//		// StringTokenizer - 공백을 기준으로 잘라줌
//		StringTokenizer stk = new StringTokenizer("hong gil dong");
//		
//		System.out.println(stk.countTokens());
//		
//		while (stk.hasMoreTokens())
//			
//		System.out.println(stk.nextToken());
	
			
//		StringTokenizer stk2 = new StringTokenizer("hong, kim, lee, park",",");
//		while(stk2.hasMoreElements()) {
//			String data = (String)stk2.nextElement();
//			System.out.println(data);
//	}

//	StringTokenizer stk3 = new StringTokenizer("hong, kim; lee, park", ",; ",true);
//	while (stk3.hasMoreTokens())
//		System.out.println(stk3.nextToken());
		
		System.out.println("input email");
		String email = sc.nextLine();
//		
//		String[] data = email.split("@");
//				System.out.println("아이디 : " + data[0]);
//		System.out.println("도메인 : "+data[1]);

		StringTokenizer stk = new StringTokenizer(email,"@");
		System.out.println("이메일 : " + stk.nextToken());
		System.out.println("도메인 :  "+ stk.nextToken());
	}
	}


