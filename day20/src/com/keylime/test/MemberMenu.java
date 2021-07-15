package com.keylime.test;

import java.util.List;
import java.util.Scanner;

import com.keylime.dto.MemberDTO;
import com.keylime.exception.DuplicateException;
import com.keylime.exception.NoDataException;
import com.keylime.service.MemberService;

public class MemberMenu {
   private Scanner sc;
   private MemberService service;
	//클래스이름과 같은 메서드 모양 
	public MemberMenu(Scanner sc) {
		this.sc=sc;
		service=new MemberService();
	}
	
  public void insert() {
   while(true)
   {
	  System.out.println("회원추가 ");
	  System.out.println("========");
	  /*
	   * 회원번호를 입력하시오.
	   * 111
	   * 이미 존재하는 회원입니다. 
	   * 
	   * 이름
	   * 나이
	   * 회원이 추가 되었습니다. 
	   */
	  
	  System.out.println("회원을 입력하시오");
	  String hakno=sc.nextLine();
	  String name="";
	  int age=0;
	  boolean result=false;
	    if(service.checkNo(hakno))
	    {
	        System.out.println("이미 존재하는 회원입니다");	
	    }else {
	    	 System.out.println("이름을 입력하세요");
	    	 name=sc.nextLine();
	    	 System.out.println("나이를 입력하세요");
	    	 age=Integer.parseInt(sc.nextLine());
	    	 try {
	    		 
		    	 result=service.memberinsert(new MemberDTO(hakno, name, age));
	    	 }catch(DuplicateException e) {
	    		 System.out.println(e);
	    	 }
	    	 if(result)
	    		 System.out.println("입력성공");
	    	 else
	    		 System.out.println("입력실패");
	    }
	    
	    System.out.println("계속 입력할까요?");
	    String yn=sc.nextLine();
//	    if("y".equalsIgnoreCase(yn))
//	    	insert(); //recursive call 제귀함수 
   
       if("n".equalsIgnoreCase(yn))
               break;
     }
  }
	
  //40분까지 
   public void   view() {
	    //전체 보기  getList라는 메서드 출력
	 List<MemberDTO> list= service.getList();
	 System.out.println("회원번호 \t 이름\t  나이");
	 System.out.println("=====================");
	 for(MemberDTO dto:list)
		 System.out.println(dto);
		 
	   
   }
  
/*
 *  회원번호를 입력해서
 *  그 해당하는 회원의 회원번호, 이름, 나이를 출력하는 
 *  메서드 
 *    
 */ //
   public void searchMember() {
	   while(true)
	   {
	   System.out.println("회원번호를 입력하세요");
	   String hakno=sc.nextLine();
	   try {
	 MemberDTO dto=service.searchData(hakno);
     System.out.println("회원번호:"+dto.getHakno());
     System.out.println("이름 :"+dto.getName());
	 System.out.println("나이 :"+dto.getAge());
	   } catch(NoDataException e) {
		   System.out.println(e);
	   }
	 System.out.println("계속 입력할까요?");
	 String yn=sc.nextLine();
	 if("n".equalsIgnoreCase(yn))
		    break;
       }
   }


/*
 *   학번을 입력받아서  그 해당하는 학번에 대한 자료를 삭제 
  */
    public void delete() {
    	System.out.println("삭제할 자료의 학번을 입력하세요");
    	String hakno=sc.nextLine();
    	
     	 boolean result=service.deleteMember(hakno);
    	 if(result)
    		 System.out.println("자료가 삭제되었습니다");
    	 else
    		 System.out.println("자료 삭제 실패!!");
    }

    /*
     *   학번을 입력받아서  그 학번에 해당하는 자료를 수정
     *   => 나이만 수정...
     * 
     * 
     */
	public void modify() {
		// TODO Auto-generated method stub
	
	  System.out.println("수정할 학번을 입력하세요");
	  String hakno=sc.nextLine();
	 
		 
		 try {
			 System.out.println("수정할 나이는 ");
			 int age=Integer.parseInt(sc.nextLine());
		    MemberDTO modifydata=service.modifyData(hakno, age);
		    
		     if(modifydata==null)
		    	System.out.println("수정이 안됨");
		    else
		    	System.out.println("수정성공!!");
		 } catch(NoDataException e)
		 {
			 System.out.println(e);
		 }
		 
//		  if("".equals(modifydata.getHakno()))
//			   System.out.println("수정 실패");
//		  else
//			  System.out.println("수정성공!!");
		
	}
}