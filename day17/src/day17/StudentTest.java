package day17;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		UserArray ins=new UserArray();  
	   while(true){
		
		    System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 전체보기");
			System.out.println("6. 종료");
			System.out.println("기능 선택?");
			String choice=sc.nextLine();
			
/*		
		    
			else if(choice.equals("3"))
				
			else if(choice.equals("4"))
			
	*/		
			if(choice.equals("1"))
		        ins.insertData(sc);	
			else if(choice.equals("2"))
				ins.modify(sc);
			else if(choice.equals("3"))
				 ins.remove(sc);
			else if(choice.equals("4"))
				ins.view(sc);
	        else if(choice.equals("5"))
	            ins.printAll();
         	else if(choice.equals("6"))
         	{
         		System.out.println("프로그램을 종료합니다.");
         		break;
         	}else {
         		System.out.println("기능을 잘못 입력했습니다.");
         	}
	   }
		
	}
}