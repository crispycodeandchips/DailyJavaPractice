package day07;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� �ο����� ?");
		int num = Integer.parseInt(sc.nextLine());

		String name[] = new String[num];
		int kor[] = new int[num];
		int eng[] = new int[num];
		int tot[] = new int[num];
		float avg[] = new float[num];
		String result[] = new String[num];

		if (num > 10) {
			System.out.println("�ο��� �߸� �Է��߽��ϴ�");

		} else {
				
			for (int i = 0; i < name.length; i++) {
				System.out.println("�̸��� �Է��ϼ���");
				name[i] = sc.nextLine();
			}
			
			for (int i = 0; i < kor.length; i++) {
				System.out.println("���������� �Է��ϼ���");
				kor[i] = Integer.parseInt(sc.nextLine());
			}
			for (int i = 0; i < eng.length; i++) {
				System.out.println("���������� �Է��ϼ���");
				eng[i] = Integer.parseInt(sc.nextLine());
			}
			
				System.out.println("�̸�\t����\t����\t����\t���\t���뵵");
				System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + tot[i] + "\t" + avg[i] + "\t" + result[i]);

				tot[i] = kor[i] + eng[i];
				avg[i] = (float) tot[i] / 2;

				if (avg[i] >= 90) {
					result[i] = "A";

				} else if (avg[i] >= 80) {
					result[i] = "B";

				} else if (avg[i] >= 70) {
					result[i] = "C";

				} else if (avg[i] >= 60) {
					result[i] = "D";

				} else
					result[i] = "F";

		} // end else

	} // end main

} // end class
