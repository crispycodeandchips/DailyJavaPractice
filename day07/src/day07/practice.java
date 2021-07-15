package day07;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 인원수는 ?");
		int num = Integer.parseInt(sc.nextLine());

		String name[] = new String[num];
		int kor[] = new int[num];
		int eng[] = new int[num];
		int tot[] = new int[num];
		float avg[] = new float[num];
		String result[] = new String[num];

		if (num > 10) {
			System.out.println("인원을 잘못 입력했습니다");

		} else {
				
			for (int i = 0; i < name.length; i++) {
				System.out.println("이름을 입력하세요");
				name[i] = sc.nextLine();
			}
			
			for (int i = 0; i < kor.length; i++) {
				System.out.println("국어점수를 입력하세요");
				kor[i] = Integer.parseInt(sc.nextLine());
			}
			for (int i = 0; i < eng.length; i++) {
				System.out.println("영어점수를 입력하세요");
				eng[i] = Integer.parseInt(sc.nextLine());
			}
			
				System.out.println("이름\t국어\t영어\t총점\t평균\t성취도");
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
