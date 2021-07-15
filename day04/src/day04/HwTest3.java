package day04;

import java.util.Scanner;

//       *
//     * *
//   * * *
// * * * *

// i 는 세로로 4번 돌고
// j 는 가로로 4번 돌고
// 느슨하게 돌아가는 애가 앞에(? 겉에서) 돌아감
// i가 별이라면 세로로 4번 돌아갈 때 전체에서 별(i)를 빼면 공백 3칸이 생기므로
// 4-i = 공백칸 -> 4-i = " "

public class HwTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		int dept = Integer.parseInt(sc.nextLine());

		if (dept < 0 || dept > 10) {
			System.out.println("입력오류");
		} else {

			for (int i = 1; i <= dept; i++) {
				for (int j = 1; j <= dept - i; j++) {
					System.out.print(" ");
				} // for j 공백에 관한 것

				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				} // for j *에 관한 것

				System.out.println();
			} // for

		} // else

	} // main

} // class
