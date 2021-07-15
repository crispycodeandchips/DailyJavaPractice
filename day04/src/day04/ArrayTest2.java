package day04;

public class ArrayTest2 {
	public static void main(String[] args) {
		
// value: 값  variable: 변수
		
//		int[] arr = new int[2]; // new를 쓴 heap 메모리는 초기값을 0으로 만들어줌!
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
		
		int[] arr = {10,20,30,40}; // => 배열의 초기화
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("이름을 입력하세요");
			System.out.println(arr[i]);
		}
	}
}
