package day04;


// 1 :  - + - + 패턴
// 2 :  + - + - 패턴 
//(조건을 잡아서 활용)
// 1,2의 입력 외에는 입력 오류! 라고 출력
import java.util.Scanner;

public class HwTest2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
    	System.out.println("input choice");
    	String choice=sc.nextLine();
    	
    	
    	if(choice.equals("1") || choice.equals("2"))
    	{
    		if(choice.equals("1"))
    		{
    	      for(int i=1; i<=2; i++)
    	      {
                  for(int j=1; j<=4; j++)
                  {
                	  if(j%2==0)
                	  {
                		  System.out.print("+");
                	  }else {
                		  System.out.print("-");
                	  }
                  }
                 System.out.println("");
    	      }
    			
    			
    		}else {
    			 for(int i=1; i<=2; i++)
       	         {
                     for(int j=1; j<=4; j++)
                     {
                   	  if(j%2==0)
                   	  {
                   		  System.out.print("-");
                   	  }else {
                   		  System.out.print("+");
                   	   }
                     }
    			  System.out.println();
    			
    		}  //for
     	   }
    	}else {
    		System.out.println("입력오류!!!");
    	} //else
    	
	} // for
} // class
