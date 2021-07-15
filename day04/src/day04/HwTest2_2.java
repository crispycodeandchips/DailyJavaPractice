package day04;
// while  - + - +
//        - + - +

import java.util.Scanner;

public class HwTest2_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input choice");
		String choice = sc.nextLine();

		int i=1,j=1;
		if(choice.equals("1"))
		{

			while(i<=2)
			{
				j=1;
				while(j<=4)
				{

					if(j%2==0)
						System.out.println("+");
					else
						System.out.println("-");
					j++;
				} //while j
				System.out.println();
				i++;
		    	} // while i
			}else {
				System.out.println("입력오류!!");
			} //if

		} // main

	} // class