package day17;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		UserArray ins=new UserArray();  
	   while(true){
		
		    System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ��ȸ");
			System.out.println("5. ��ü����");
			System.out.println("6. ����");
			System.out.println("��� ����?");
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
         		System.out.println("���α׷��� �����մϴ�.");
         		break;
         	}else {
         		System.out.println("����� �߸� �Է��߽��ϴ�.");
         	}
	   }
		
	}
}