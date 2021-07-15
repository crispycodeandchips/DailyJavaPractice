package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class UserArray {
   private ArrayList<StudentDTO> arr=new ArrayList<StudentDTO>();
   
	public void insertData(Scanner sc) {
		
		while(true) {
		System.out.println("�й��� �Է��ϼ���");
	    String hak=sc.nextLine();
	    StudentDTO result=isCheckHakno(hak);
		 if(!result.getHakno().isEmpty()) {
			 System.out.println("���� �й��� �ֽ��ϴ�.");
		 }else {
			 System.out.println("�̸�");
			 String name=sc.nextLine();
			 System.out.println("���� ");
			 int age=Integer.parseInt(sc.nextLine());
			 arr.add(new StudentDTO(hak, name, age));
			 System.out.println("�Է¿Ϸ�!!!");
		 }
	    
	    System.out.println("��� �Է��ұ��?");
		String yn=sc.nextLine();
		if(yn.equalsIgnoreCase("n"))
			break;
		} 
		
	}
	
	private  StudentDTO isCheckHakno(String hakno)
	{
		/*
		 * for(int i=0; i<arr.size(); i++) { if(arr.get(i).getHakno().equals(hakno))
		 * return true; } return false;
		 */
		  for(StudentDTO data:arr)
		  {
			  if(data.getHakno().contentEquals(hakno))
				  return data;
		  }
		  return new StudentDTO("","",0);
		
	}
	
	public void printAll()
	{
		System.out.println(" �й�\t �̸� \t ����");
		for(StudentDTO dto:arr)
		{
			System.out.printf("%s \t %s \t %d\n", dto.getHakno(), dto.getName(), dto.getAge());
		}
	}
	
	public void modify(Scanner sc) {
		 String hakno="";
		   while(true) {
			   System.out.println("������ �й���?");
			   hakno=sc.nextLine();
			  StudentDTO dto= isCheckHakno(hakno);
			   if(dto.getHakno().isEmpty())
			   {
				   System.out.println("������ �ڷᰡ �����ϴ�.");
			   }else {
				   System.out.println("������ ���̴� ?");
				   int age=Integer.parseInt(sc.nextLine());
				   dto.setAge(age);
				   System.out.println("�����Ϸ�!!!");
			   }//if
			   System.out.println("��� ����?");
			   String yn=sc.nextLine();
			   if(yn.equals("n"))
				   break;
		   }//while
		
	}//modify
	//45�б���...
	public  void  view(Scanner sc) {
		
		while(true) {
		System.out.println("��ȸ�� �й���?");
		String hakno=sc.nextLine();
		StudentDTO dto= isCheckHakno(hakno);
		
		if(dto.getHakno().isEmpty())
		{
			System.out.println("��ȸ�� �й��� �����ϴ�.");
		}else {
		System.out.println("��ȸ�� �й��� �ڷ�� ������ �����ϴ�.");
	    System.out.println("�й� :"+dto.getHakno());
	    System.out.println("�̸� :"+dto.getName());
	    System.out.println("���� :"+dto.getAge());
		}
		
		System.out.println("��� ��ȸ�ұ��?");
		String yn=sc.nextLine();
		if(yn.equals("n"))
			break;
		
		}//while
	}//view


	public void remove(Scanner sc) {
		// TODO Auto-generated method stub
		
	while(true) {	
		System.out.println("������ �й���?");
		String hakno=sc.nextLine();
		StudentDTO dto=isCheckHakno(hakno);
		if(dto.getHakno().isEmpty()) {
			System.out.println("������ �й��� �����ϴ�.");
		}else {
			  arr.remove(dto);
			  System.out.println("�����Ϸ�!!!");
		}
		System.out.println("��� �����ұ��?");
		String yn=sc.nextLine();
		if(yn.equalsIgnoreCase("n"))
			break;
		
	} // while
		
	}
}
