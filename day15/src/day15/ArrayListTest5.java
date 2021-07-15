package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * class Person
{
private int pno;
private String pname;
 // 생성자, setter  getter...
}

 * 
 */
public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *          번호를 입력하세요
		 *           
		 *          이름을 입력하세요
		 *            
		 *       계속 입력? n
		 * 
		 *     출력... 
		 *     
		 *        30분...  => 35분까지... 
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
		     
             System.out.println("번호를 입력하시오");
             p1.setPno(Integer.parseInt(sc.nextLine()));
             System.out.println("이름을 입력하시오");
             p1.setPname(sc.nextLine());
             persons.add(p1);
             
             
			/*
			 * System.out.println("input pno");
			 * int pno=Integer.parseInt(sc.nextLine()); System.out.println("input pname");
			 * String pname=sc.nextLine(); // person.add(new Person(pno, pname)); Person
			 * p=new Person(pno, pname); persons.add(p);
			 */
           
         
			System.out.println("계속 입력할까요?"); 
			String yn=sc.nextLine();
			if(yn.contentEquals("n"))
				break;
		}

       for(Person p: persons)
    	   System.out.printf("%d  %s\n", p.getPno(), p.getPname());
		
	}
}
