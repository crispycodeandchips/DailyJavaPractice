package day03;

public class for2Test2 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=9; j+=2) {
				
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("======");
		
		int a = 1;
		for (int k=1; k<=4; k++) {
			
			for (int l=1; l<=3; l++)
			{
				System.out.print(a++ +"\t");
			}
			System.out.println();
		}
	}
}
