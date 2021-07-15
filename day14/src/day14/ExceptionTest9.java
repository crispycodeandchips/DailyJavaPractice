package day14;

import java.util.Scanner;

class UserException extends Exception {

	public UserException() {
		super("입력오류 양수를 입력해야 함!!!");
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
			
		} catch (Exception e) { // 가장 상위 클래스인 Exception을 마지막에 써줌.
			System.out.println(e); // 위에 애들이 다 못 받으면 내가 받을께
		}
	}

}
