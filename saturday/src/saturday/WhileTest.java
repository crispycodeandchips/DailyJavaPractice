package saturday;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int input;
		int sum = 0;
		
		
		// while��
//		while (input !=0) {
//			sum += input;
//			input = Integer.parseInt(scanner.nextLine());
//		}
//		
//		System.out.println(sum);
		
		
		// do while�� 
		do {
			input = Integer.parseInt(scanner.nextLine());
			sum += input;
		}
		
		while (input != 0);
		
		System.out.println(sum);
	}

}
