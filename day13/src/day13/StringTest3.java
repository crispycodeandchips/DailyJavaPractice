package day13;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		String name = "abcd";
		int data = name.compareTo("Abd");
		System.out.println(data);
		System.out.println((int)'a');
		System.out.println((int)'A');
		
		//String �迭�� �̿��Ͽ� �̸��� �ܺο� �Է¹޾� 5�� �Է��ϰ�
		// ���� ������������ ������ ��.
		
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

