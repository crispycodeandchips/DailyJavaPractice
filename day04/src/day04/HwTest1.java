package day04;

import java.util.Scanner;

// 1-1/2+1/3....
public class HwTest1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		int num = Integer.parseInt(sc.nextLine());
		String data = "1";
		float result=1;
		
//		//for
//		for(int i=2; i<=num; i++) //È¦¼öÀÇ ¹Ýº¹(?)
//		{
//			if(i%2==0) {
//				data +="- 1/"+i; 
//			result -= 1.0f/i; // 1/2 =>0.0
//		}
//		else 
//		{
//			data += "+ 1/"+i;
//			result +=1.0f/i;
//		} 
//		} //end for
		
		
		//while
		int i=2;
		while(i<=num)
		{
			if(i%2==0) {
				data += "-1/"+i;
				result -= 1.0f/i;
			}else {
				data += "+1/"+i;
				result += 1.0f/i;
			}
			i++;
			
		}//while
				
				
				
				
				
				
System.out.println(data+"="+result);		

		sc.close();

	}
}
