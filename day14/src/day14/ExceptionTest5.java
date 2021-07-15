package day14;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest5 {
	public static void main(String[] args) throws IOException{
		
		   Scanner sc=new Scanner(System.in);
	        System.out.println("숫자를 입력하세요");
	         int su=Integer.parseInt(sc.nextLine());
	         
//	         if(su>=2)
//	         {
//	        	 System.out.println(su);
//	         }else {
//	        	 System.out.println("입력오류!!!");
//	         }
			
	          if(su<2)
	               throw new IOException();
	           System.out.println(su);
	           
		}
	}
