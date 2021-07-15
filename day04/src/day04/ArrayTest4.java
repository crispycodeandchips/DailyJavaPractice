package day04;

import java.util.Scanner;

/*
 * 문자열 여러개로 구성된 배열 예제
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
		System.out.println("배열의 크기를 입력하세요");
		int size = Integer.parseInt(scanner.nextLine());
		String[] arr = new String[size];
		
		for(int i=0; i<arr.length; i++)
			
		{ System.out.println("이름을 입력하세요");
			arr[i] = scanner.nextLine();
		}
		System.out.println("이름");
		System.out.println("======");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
				
	}

}
