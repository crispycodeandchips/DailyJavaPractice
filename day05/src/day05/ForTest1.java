package day05;

public class ForTest1 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
		
		// jdk5 
		
//		for(int a:arr)
//			System.out.println(a);
		
		String[] name = {"hong", "kim", "park"};
		for(String data:name)
			System.out.println(data);
		
		
	}
}
