package day04;

public class HwTest4 {
	public static void main(String[] args) {

		// 1 3 5 7 9 
		
		int odd=0, even=0, tot=0;
		
		for(int i=1; i<=20; i++)
		{
			
			if(i%2==0)
			{
				 // ¦�� 
				even += i;
			}else {
				
			} // Ȧ��
			odd += i;
			
		} // for
		tot = odd + even;
		System.out.println("¦����: "+even);
		System.out.println("Ȧ����: "+odd);
		System.out.println("����: "+tot);
	} // main
}// class
