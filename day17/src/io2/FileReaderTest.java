package io2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           BufferedReader br=null;
           try {
        	   br=new BufferedReader(new FileReader("c:\\msa\\myboard/myfav.txt"));
        	   while(true) {
        		   String str=br.readLine();
        		   
        		   if(str==null) break;
        		   System.out.println(str);
        	   }
           }catch(IOException  e) {
        	   System.out.println(e);
           }finally {
        	   if(br!=null) try { br.close();} catch(IOException e) {}
           }
	}

}
