package day04;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {

		// 1. int ������ �迭ũ�� 3���� ���� Scanner�� �̿��Ͽ� ���� �Է��Ͻÿ�.
		// 2. �Էµ� ���� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		// �Է¹�
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("input number[%d]", arr[i]);
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		// ��¹�
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
