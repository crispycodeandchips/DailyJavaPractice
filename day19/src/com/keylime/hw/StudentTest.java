package com.keylime.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserTable ins=new UserTable();
		
		while(true)
		{
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ��ȸ");
			System.out.println("5. ��ü����");
			System.out.println("6. ����");
		    
			System.out.println("��ɼ���?");
			String choice=sc.nextLine();
			
			
			switch (choice) {  // byte  short int char String enum
			case "1":   //35�б���...
				System.out.println("�й��� �Է��ϼ��� ");
				String hak=sc.nextLine();  //
				boolean result=ins.ischeck(hak); // �й��� �Է¹޾Ƽ�  usertable���� �й��� �ִ� check 
				if(result)
				{
					 System.out.println("���� �й��� �����մϴ�");
				}else {
					System.out.println("�̸��� �Է��ϼ���");
					String name=sc.nextLine();
					System.out.println("���̸� �Է��ϼ���");
					int age=Integer.parseInt(sc.nextLine());
					 //�߰��ϴ� ���
					//ins.insert(hak, name, age);
					 result=ins.insert(new StudentDTO(hak, name, age));
					 
					 
					if(result)
						System.out.println("�Է¼���");
					else
						System.out.println("�Է½��� ");
					
				}
				break;
				
			case "2":
				System.out.println("������ �й���?");  //�й� �̸� ���� 
				String hakno=sc.nextLine();
				StudentDTO dto= ins.search(hakno);
				
				if(dto==null)
					System.out.println("������ �й��� �����ϴ�.");
				else {
					 System.out.println("������ ���̴�");
					 int age=Integer.parseInt(sc.nextLine());
					 result=ins.modify(hakno, age);
					 if(result)
						 System.out.println("�����Ϸ�");
					 else
						 System.out.println("��������");
				}
				break;
			
			case "3":
				// �й��� �Է¹޾Ƽ�  �й��� ������ ���ٰ� �޼��� ������ ����  delete �޼��� 
				System.out.println("������ �й���");
			    hakno=sc.nextLine();
				result=ins.delete(hakno);
				if(result)
					System.out.println("���� ����!!");
				else
					System.out.println("���� ����!!!");
				
			    break;
			case "4":
				 //��ȸ   ���
				System.out.println("��ȸ�� �й��� �Է��ϼ���");
				 hakno=sc.nextLine();
				 dto=ins.search(hakno);
				  if(dto==null)
					  System.out.println("��ȸ�� �ڷᰡ �����ϴ�.");
				  else {
					  System.out.println("��ȣ :"+dto.getHakno());
					  System.out.println("�̸� :"+dto.getName());
					  System.out.println("���� :"+dto.getAge());
				  }
				
				break;
			case "5":
				  //��ü���� 
				// ���
				HashMap<String, StudentDTO> list=ins.list(); 
				 Iterator<String> ita=list.keySet().iterator();
				 System.out.println("��ȣ    \t  �̸�\t        ���� ");
				 while(ita.hasNext())
				 {
					String key= ita.next();
					 dto=list.get(key);
					 System.out.printf("%s \t  %s\t %d\n", dto.getHakno(), dto.getName(), dto.getAge());
				 }
				
				break;
			case "6":
			       System.out.println("���α׷��� �����մϴ�.");
	               System.exit(0);
				break;
				
			default: 
				System.out.println("�ڵ带 �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
			
		}

	}

}
