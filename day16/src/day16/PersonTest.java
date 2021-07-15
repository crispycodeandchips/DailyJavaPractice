package day16;

import java.util.ArrayList;

public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person("hong", 20);
		System.out.println(p1);
		/*
		 * 객체 MemberArrayList로 객체를 만들어서 addMember 메서드를 호출해서 자료 4개를 입력하시오.
		 */

		 MemberPro  ins=new MemberPro();
         ins.addMember(new Person("a1",20));
         ins.addMember(new Person("a2",30));
         ins.addMember(new Person("a4",20));
         ins.addMember(new Person("a5",10));
         ins.addMember(new Person("a1",25));
        
          // ins  printAll메서드를 호출하여   추가한 내용을 모두 출력하시오. 
         
          ins.printAll();
          // ins.addMember("name",20);
         ins.addMember("hong", 20);   
         System.out.println("-==================");
         ins.print("a1");
         
         //a1이라는 자료 하나만 보도록
         ArrayList<Person> result= ins.print("a1"); 
        
         // ins의 prt메서드 호출시 출력하도록!!!
         System.out.println("===== result  ======");
         
         for(Person p: result)
         {
       	   System.out.println(p.getName()+", "+p.getAge());
         }
       	  
         //삭제 
          
         boolean r=ins.removePerson(new Person("a4",20));
         
           if(r)
           	System.out.println("삭제 성공!!!");
           else
           	System.out.println("삭제 실패!!");
           System.out.println("================");
           
           ins.printAll();
           System.out.println("=======수정    ====");
       
          r=ins.modifyPerson(new Person("a1",20), new Person("a1",100));
            if(r)
           	 System.out.println("수정완료");
            else
           	 System.out.println("수정 실패!!");
            
            ins.printAll();       
	}
}

