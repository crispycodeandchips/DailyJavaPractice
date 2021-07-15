package day13;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		String name = "abcd";
		int data = name.compareTo("Abd");
		System.out.println(data);
		System.out.println((int)'a');
		System.out.println((int)'A');
		
		//String 배열을 이용하여 이름을 외부에 입력받아 5개 입력하고
		// 값을 내림차순으로 정렬할 것.
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i=1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j])<0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			} // for j
		} //for i

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}

