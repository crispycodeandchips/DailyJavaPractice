package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * class Person
{
private int pno;
private String pname;
 // ������, setter  getter...
}

 * 
 */
public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *          ��ȣ�� �Է��ϼ���
		 *           
		 *          �̸��� �Է��ϼ���
		 *            
		 *       ��� �Է�? n
		 * 
		 *     ���... 
		 *     
		 *        30��...  => 35�б���... 
		 *       
		 * 
		 * 
		 * 
		 */
		/*
		 * String test1="hong"; String test2="hong"; StringBuilder test3=new
		 * StringBuilder("hong"); System.out.println(test1.equals(test2));
		 * System.out.println(test1.equals(test3));
		 * 
		 * System.out.println(test1.contentEquals(test2));
		 * System.out.println(test1.contentEquals(test3));
		 */


		Scanner sc=new Scanner(System.in); 
        List<Person> persons=new ArrayList<>();
        
        Person p1=new Person();
        
		while(true) {
		     
             System.out.println("��ȣ�� �Է��Ͻÿ�");
             p1.setPno(Integer.parseInt(sc.nextLine()));
             System.out.println("�̸��� �Է��Ͻÿ�");
             p1.setPname(sc.nextLine());
             persons.add(p1);
             
             
			/*
			 * System.out.println("input pno");
			 * int pno=Integer.parseInt(sc.nextLine()); System.out.println("input pname");
			 * String pname=sc.nextLine(); // person.add(new Person(pno, pname)); Person
			 * p=new Person(pno, pname); persons.add(p);
			 */
           
         
			System.out.println("��� �Է��ұ��?"); 
			String yn=sc.nextLine();
			if(yn.contentEquals("n"))
				break;
		}

       for(Person p: persons)
    	   System.out.printf("%d  %s\n", p.getPno(), p.getPname());
		
	}
}
