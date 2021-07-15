package day07;

public class SortTest1 {
	public static void main(String[] args) {
		
		int[] arr = {20, 52, 30, 10, 31, 5};
		int temp;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					//(ÀÚ¸®)¹Ù²Û´Ù
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} // for j
		} // for i
		
		for(int index:arr)
			System.out.println(index+"\t");
	}
}
