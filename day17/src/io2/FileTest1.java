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
        	  System.out.println("폴더 생성 성공!!!");
          else
        	  System.out.println("폴더 생성 실패!!!");
          
       System.out.println("=============================");
       File f3=new File("c:\\msa/sample1", "hello.txt");
        try{
           boolean result2= f3.createNewFile();
           if(result2)
        	   System.out.println("파일생성 성공!!");
           else
        	   System.out.println("파일생성 실패!!");
        }catch(IOException e) {
        	System.out.println(e);
        }
        
     result= f3.delete();
        if(result)
        	System.out.println("파일 삭제 성공!!");
        else
        	System.out.println("파일 삭제 실패!!");
     
      result=f2.delete();
        if(result)
        	System.out.println("폴더 삭제 성공");
        else
        	System.out.println("폴더 삭제 실패!!");
	}
}
