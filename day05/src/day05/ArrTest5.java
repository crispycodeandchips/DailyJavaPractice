package day05;

// 자바에서는 하나도 안 중요함 -_- 과감히 넘어가도 됨
public class ArrTest5 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[7];
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.println(arr[i][j]+"\t");
			}	
			System.out.println();
		}

	}

}
