package day14;

import java.util.Scanner;

class UserException extends Exception {

	public UserException() {
		super("�Է¿��� ����� �Է��ؾ� ��!!!");
	}
}

public class ExceptionTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num");
		int num = Integer.parseInt(sc.nextLine());
		try {
			if (num < 0)
				throw new UserException();
			System.out.println("num : " + num);

		} catch (UserException e) { //System.out.println(e.toString());
			System.out.println(e);
			e.printStackTrace();
			
		} catch (Exception e) { // ���� ���� Ŭ������ Exception�� �������� ����.
			System.out.println(e); // ���� �ֵ��� �� �� ������ ���� ������
		}
	}

}
