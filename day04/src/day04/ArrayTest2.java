package day04;

public class ArrayTest2 {
	public static void main(String[] args) {
		
// value: ��  variable: ����
		
//		int[] arr = new int[2]; // new�� �� heap �޸𸮴� �ʱⰪ�� 0���� �������!
//
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
//		
//		System.out.println("=======");
////		System.out.println(arr.length);
//		
//		arr[0] = 100;
//		arr[1] = 200;
//		
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
		
		int[] arr = {10,20,30,40}; // => �迭�� �ʱ�ȭ
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("�̸��� �Է��ϼ���");
			System.out.println(arr[i]);
		}
	}
}
