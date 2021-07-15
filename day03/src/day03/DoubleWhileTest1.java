package day03;

public class DoubleWhileTest1 {
	public static void main(String[] args) {

		int i = 1;
		while(i<=3)
		{
		int j = 1;
		while (j<=3) 
		{
			System.out.print("* \t");
			j++;
		}
		System.out.println();
		i++;
		}
	}
}
