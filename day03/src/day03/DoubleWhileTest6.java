package day03;

import java.util.Scanner;

public class DoubleWhileTest6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("깊이를 입력하세요");
		int dept = Integer.parseInt(sc.nextLine());

		if(dept>0)
		{
			int i=1;
			while(i<=dept) {
				int j=1;
				while(j<=i) {
					System.out.print("*\t");
					j++;
				}
				System.out.println();
				i++;
			}

	}else 
		System.out.println("입력오류!!!");
}

}
