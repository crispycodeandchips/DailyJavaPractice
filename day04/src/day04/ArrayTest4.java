package day04;

import java.util.Scanner;

/*
 * ���ڿ� �������� ������ �迭 ����
*/
public class ArrayTest4 {
	public static void main(String[] args) {
//		String name = "hong";
//		
//		System.out.println(name);
		
//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
		
//		String[] name = new String[4];
//		name[0] = "hong";
//		name[1] = "kim";
//		name[2] = "park";
//		name[3] = "kang";
//		
//		for(int i=0; i<name.length; i++)
//			System.out.println(name[i]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int size = Integer.parseInt(scanner.nextLine());
		String[] arr = new String[size];
		
		for(int i=0; i<arr.length; i++)
			
		{ System.out.println("�̸��� �Է��ϼ���");
			arr[i] = scanner.nextLine();
		}
		System.out.println("�̸�");
		System.out.println("======");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
				
	}

}
