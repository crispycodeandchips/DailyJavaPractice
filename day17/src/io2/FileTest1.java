package io2;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f=new File("c:\\msa");
        
        String[] flists= f.list();
        
        for(String filelist:flists)
        	System.out.println(filelist);
        
        
        
        File f2=new File(f, "sample1");
        
        boolean result=f2.mkdir();
        
          if(result)
        	  System.out.println("���� ���� ����!!!");
          else
        	  System.out.println("���� ���� ����!!!");
          
       System.out.println("=============================");
       File f3=new File("c:\\msa/sample1", "hello.txt");
        try{
           boolean result2= f3.createNewFile();
           if(result2)
        	   System.out.println("���ϻ��� ����!!");
           else
        	   System.out.println("���ϻ��� ����!!");
        }catch(IOException e) {
        	System.out.println(e);
        }
        
     result= f3.delete();
        if(result)
        	System.out.println("���� ���� ����!!");
        else
        	System.out.println("���� ���� ����!!");
     
      result=f2.delete();
        if(result)
        	System.out.println("���� ���� ����");
        else
        	System.out.println("���� ���� ����!!");
	}
}
