package day16;

import java.util.ArrayList;

public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person("hong", 20);
		System.out.println(p1);
		/*
		 * ��ü MemberArrayList�� ��ü�� ���� addMember �޼��带 ȣ���ؼ� �ڷ� 4���� �Է��Ͻÿ�.
		 */

		 MemberPro  ins=new MemberPro();
         ins.addMember(new Person("a1",20));
         ins.addMember(new Person("a2",30));
         ins.addMember(new Person("a4",20));
         ins.addMember(new Person("a5",10));
         ins.addMember(new Person("a1",25));
        
          // ins  printAll�޼��带 ȣ���Ͽ�   �߰��� ������ ��� ����Ͻÿ�. 
         
          ins.printAll();
          // ins.addMember("name",20);
         ins.addMember("hong", 20);   
         System.out.println("-==================");
         ins.print("a1");
         
         //a1�̶�� �ڷ� �ϳ��� ������
         ArrayList<Person> result= ins.print("a1"); 
        
         // ins�� prt�޼��� ȣ��� ����ϵ���!!!
         System.out.println("===== result  ======");
         
         for(Person p: result)
         {
       	   System.out.println(p.getName()+", "+p.getAge());
         }
       	  
         //���� 
          
         boolean r=ins.removePerson(new Person("a4",20));
         
           if(r)
           	System.out.println("���� ����!!!");
           else
           	System.out.println("���� ����!!");
           System.out.println("================");
           
           ins.printAll();
           System.out.println("=======����    ====");
       
          r=ins.modifyPerson(new Person("a1",20), new Person("a1",100));
            if(r)
           	 System.out.println("�����Ϸ�");
            else
           	 System.out.println("���� ����!!");
            
            ins.printAll();       
	}
}

