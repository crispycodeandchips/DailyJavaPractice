package io1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        InputStreamReader isr=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(isr);
        
		//������ ���� : ���ڷ��̼� ��� 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("�����͸� �Է��ϼ���");
         while(true) {
        	 try {
        	   String str=br.readLine();
        	   System.out.println(str);
        	   if(str.equals("bye"))
        		   break;
        	 } catch(IOException e)
        	 {
        		 System.out.println(e);
        	 }
         }
	}
}
