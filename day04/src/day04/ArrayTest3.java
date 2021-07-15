package day04;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {

		// 1. int 저장할 배열크기 3개를 만들어서 Scanner를 이용하여 값을 입력하시오.
		// 2. 입력된 값을 출력하시오.

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		// 입력문
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("input number[%d]", arr[i]);
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		// 출력문
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
