package day03;

import java.util.Scanner;

/*
 * kor eng ��� 90 �̻��̸� very good
 * kor eng �� �ϳ��� 90 �̻��̸� god
 * �� �� 90�� �ȵǸ� bad 
*/

public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input su1");
		int su1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("input su2");
		int su2 = Integer.parseInt(sc.nextLine());
		
		if(su1>=90 && su2 >=90)
			System.out.println("very good");
		else if(su1>=90 || su2>90)
			System.out.println("good");
		else
			System.out.println("bad");

	}
	

}
