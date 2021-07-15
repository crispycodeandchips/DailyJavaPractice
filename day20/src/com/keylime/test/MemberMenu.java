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
	//Ŭ�����̸��� ���� �޼��� ��� 
	public MemberMenu(Scanner sc) {
		this.sc=sc;
		service=new MemberService();
	}
	
  public void insert() {
   while(true)
   {
	  System.out.println("ȸ���߰� ");
	  System.out.println("========");
	  /*
	   * ȸ����ȣ�� �Է��Ͻÿ�.
	   * 111
	   * �̹� �����ϴ� ȸ���Դϴ�. 
	   * 
	   * �̸�
	   * ����
	   * ȸ���� �߰� �Ǿ����ϴ�. 
	   */
	  
	  System.out.println("ȸ���� �Է��Ͻÿ�");
	  String hakno=sc.nextLine();
	  String name="";
	  int age=0;
	  boolean result=false;
	    if(service.checkNo(hakno))
	    {
	        System.out.println("�̹� �����ϴ� ȸ���Դϴ�");	
	    }else {
	    	 System.out.println("�̸��� �Է��ϼ���");
	    	 name=sc.nextLine();
	    	 System.out.println("���̸� �Է��ϼ���");
	    	 age=Integer.parseInt(sc.nextLine());
	    	 try {
	    		 
		    	 result=service.memberinsert(new MemberDTO(hakno, name, age));
	    	 }catch(DuplicateException e) {
	    		 System.out.println(e);
	    	 }
	    	 if(result)
	    		 System.out.println("�Է¼���");
	    	 else
	    		 System.out.println("�Է½���");
	    }
	    
	    System.out.println("��� �Է��ұ��?");
	    String yn=sc.nextLine();
//	    if("y".equalsIgnoreCase(yn))
//	    	insert(); //recursive call �����Լ� 
   
       if("n".equalsIgnoreCase(yn))
               break;
     }
  }
	
  //40�б��� 
   public void   view() {
	    //��ü ����  getList��� �޼��� ���
	 List<MemberDTO> list= service.getList();
	 System.out.println("ȸ����ȣ \t �̸�\t  ����");
	 System.out.println("=====================");
	 for(MemberDTO dto:list)
		 System.out.println(dto);
		 
	   
   }
  
/*
 *  ȸ����ȣ�� �Է��ؼ�
 *  �� �ش��ϴ� ȸ���� ȸ����ȣ, �̸�, ���̸� ����ϴ� 
 *  �޼��� 
 *    
 */ //
   public void searchMember() {
	   while(true)
	   {
	   System.out.println("ȸ����ȣ�� �Է��ϼ���");
	   String hakno=sc.nextLine();
	   try {
	 MemberDTO dto=service.searchData(hakno);
     System.out.println("ȸ����ȣ:"+dto.getHakno());
     System.out.println("�̸� :"+dto.getName());
	 System.out.println("���� :"+dto.getAge());
	   } catch(NoDataException e) {
		   System.out.println(e);
	   }
	 System.out.println("��� �Է��ұ��?");
	 String yn=sc.nextLine();
	 if("n".equalsIgnoreCase(yn))
		    break;
       }
   }


/*
 *   �й��� �Է¹޾Ƽ�  �� �ش��ϴ� �й��� ���� �ڷḦ ���� 
  */
    public void delete() {
    	System.out.println("������ �ڷ��� �й��� �Է��ϼ���");
    	String hakno=sc.nextLine();
    	
     	 boolean result=service.deleteMember(hakno);
    	 if(result)
    		 System.out.println("�ڷᰡ �����Ǿ����ϴ�");
    	 else
    		 System.out.println("�ڷ� ���� ����!!");
    }

    /*
     *   �й��� �Է¹޾Ƽ�  �� �й��� �ش��ϴ� �ڷḦ ����
     *   => ���̸� ����...
     * 
     * 
     */
	public void modify() {
		// TODO Auto-generated method stub
	
	  System.out.println("������ �й��� �Է��ϼ���");
	  String hakno=sc.nextLine();
	 
		 
		 try {
			 System.out.println("������ ���̴� ");
			 int age=Integer.parseInt(sc.nextLine());
		    MemberDTO modifydata=service.modifyData(hakno, age);
		    
		     if(modifydata==null)
		    	System.out.println("������ �ȵ�");
		    else
		    	System.out.println("��������!!");
		 } catch(NoDataException e)
		 {
			 System.out.println(e);
		 }
		 
//		  if("".equals(modifydata.getHakno()))
//			   System.out.println("���� ����");
//		  else
//			  System.out.println("��������!!");
		
	}
}