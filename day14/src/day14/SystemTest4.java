package day14;

import java.util.Scanner;

public class SystemTest4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("계속 입력");
			String yn = sc.nextLine();

			if (yn.equals("n"))
				//break;
			System.exit(0); //jvm 정상종료를 시키고 싶을때 => exit(0)
			
		} // while
		// System.out.println("done!!!");

	} // main

}
