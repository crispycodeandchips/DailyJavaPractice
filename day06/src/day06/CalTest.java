package day06;

import java.util.Scanner;

class Cal {
	int add(int num1, int num2) { // �ش� �޼ҵ� �ȿ����� ����ִ� �����μ�, �޼ҵ带 ���������� �����.
		return num1 + num2;
	}

	int sub(int num1, int num2) {
		return num1 - num2;
	}

	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	String div(int num1, int num2) {
		if(num2==0)
		return "0���� ���� �� �����ϴ�.";
		else if(num1%num2==0)
			return num1/num2+"";
		else 
			return (float)num1/num2+"";
		
	}
}

public class CalTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input num1");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("input num2");
		int num2 = Integer.parseInt(sc.nextLine());

		Cal ins = new Cal();

		System.out.printf("%d + %d=%d\n", num1, num2, ins.add(num1, num2));
		System.out.printf("%d - %d=%d\n", num1, num2, ins.sub(num1, num2));
		System.out.printf("%d * %d=%d\n", num1, num2, ins.mul(num1, num2));
		System.out.printf("%d / %d=%s\n", num1, num2, ins.div(num1, num2));
	}
}
