package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class UserArray {
   private ArrayList<StudentDTO> arr=new ArrayList<StudentDTO>();
   
	public void insertData(Scanner sc) {
		
		while(true) {
		System.out.println("학번을 입력하세요");
	    String hak=sc.nextLine();
	    StudentDTO result=isCheckHakno(hak);
		 if(!result.getHakno().isEmpty()) {
			 System.out.println("기존 학번이 있습니다.");
		 }else {
			 System.out.println("이름");
			 String name=sc.nextLine();
			 System.out.println("나이 ");
			 int age=Integer.parseInt(sc.nextLine());
			 arr.add(new StudentDTO(hak, name, age));
			 System.out.println("입력완료!!!");
		 }
	    
	    System.out.println("계속 입력할까요?");
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
		System.out.println(" 학번\t 이름 \t 나이");
		for(StudentDTO dto:arr)
		{
			System.out.printf("%s \t %s \t %d\n", dto.getHakno(), dto.getName(), dto.getAge());
		}
	}
	
	public void modify(Scanner sc) {
		 String hakno="";
		   while(true) {
			   System.out.println("수정할 학번은?");
			   hakno=sc.nextLine();
			  StudentDTO dto= isCheckHakno(hakno);
			   if(dto.getHakno().isEmpty())
			   {
				   System.out.println("수정할 자료가 없습니다.");
			   }else {
				   System.out.println("수정할 나이는 ?");
				   int age=Integer.parseInt(sc.nextLine());
				   dto.setAge(age);
				   System.out.println("수정완료!!!");
			   }//if
			   System.out.println("계속 수정?");
			   String yn=sc.nextLine();
			   if(yn.equals("n"))
				   break;
		   }//while
		
	}//modify
	//45분까지...
	public  void  view(Scanner sc) {
		
		while(true) {
		System.out.println("조회할 학번은?");
		String hakno=sc.nextLine();
		StudentDTO dto= isCheckHakno(hakno);
		
		if(dto.getHakno().isEmpty())
		{
			System.out.println("조회할 학번이 없습니다.");
		}else {
		System.out.println("조회한 학번의 자료는 다음과 같습니다.");
	    System.out.println("학번 :"+dto.getHakno());
	    System.out.println("이름 :"+dto.getName());
	    System.out.println("나이 :"+dto.getAge());
		}
		
		System.out.println("계속 조회할까요?");
		String yn=sc.nextLine();
		if(yn.equals("n"))
			break;
		
		}//while
	}//view


	public void remove(Scanner sc) {
		// TODO Auto-generated method stub
		
	while(true) {	
		System.out.println("삭제할 학번은?");
		String hakno=sc.nextLine();
		StudentDTO dto=isCheckHakno(hakno);
		if(dto.getHakno().isEmpty()) {
			System.out.println("삭제할 학번이 없습니다.");
		}else {
			  arr.remove(dto);
			  System.out.println("삭제완료!!!");
		}
		System.out.println("계속 삭제할까요?");
		String yn=sc.nextLine();
		if(yn.equalsIgnoreCase("n"))
			break;
		
	} // while
		
	}
}
