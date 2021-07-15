package day05;

public class ArrTest4 {
	public static void main(String[] args) {

		int[][] arr = new int[3][4]; //2차원 배열인데 과감하게 넘겨도 됨. 안씀
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.println(arr[i][j]+"\t");
		}
//		System.out.println(arr.length); //3
//		System.out.println(arr[0].length); //4
//		System.out.println(arr[1].length); //4
//		System.out.println(arr[2].length); //4
//		
		
	}
}
