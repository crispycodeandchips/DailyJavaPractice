package day14;

import java.util.Scanner;

public class SystemTest4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("��� �Է�");
			String yn = sc.nextLine();

			if (yn.equals("n"))
				//break;
			System.exit(0); //jvm �������Ḧ ��Ű�� ������ => exit(0)
			
		} // while
		// System.out.println("done!!!");

	} // main

}
