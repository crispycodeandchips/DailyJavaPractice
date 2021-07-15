package day04;

public class FiboTest {
public static void main(String[] args) {
	
	int a1=1, a2=1;
	int a3;
	
	System.out.print(a1+"\t");
	System.out.println(a2+"\t");
	
	//5
	for(int i=1; i<5-2; i++)
	{
		a3=a1+a2;
		System.out.print(a3+"\t");
		a1=a2;
		a2=a3;
	}
		
	
	
}
}
