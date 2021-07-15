package day03;

import java.util.Scanner;

/*
 * kor eng 모두 90 이상이면 very good
 * kor eng 중 하나라도 90 이상이면 god
 * 둘 다 90이 안되면 bad 
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
