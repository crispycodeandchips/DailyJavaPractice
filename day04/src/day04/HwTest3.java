package day04;

import java.util.Scanner;

//       *
//     * *
//   * * *
// * * * *

// i �� ���η� 4�� ����
// j �� ���η� 4�� ����
// �����ϰ� ���ư��� �ְ� �տ�(? �ѿ���) ���ư�
// i�� ���̶�� ���η� 4�� ���ư� �� ��ü���� ��(i)�� ���� ���� 3ĭ�� ����Ƿ�
// 4-i = ����ĭ -> 4-i = " "

public class HwTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int dept = Integer.parseInt(sc.nextLine());

		if (dept < 0 || dept > 10) {
			System.out.println("�Է¿���");
		} else {

			for (int i = 1; i <= dept; i++) {
				for (int j = 1; j <= dept - i; j++) {
					System.out.print(" ");
				} // for j ���鿡 ���� ��

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				} // for j *�� ���� ��

				System.out.println();
			} // for

		} // else

	} // main

} // class
