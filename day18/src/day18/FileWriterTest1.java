package day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           FileWriter fw=null;
           try {
        	   fw=new FileWriter("./hello.txt");
        	   fw.write("hello");
        	   
        	   System.out.println("파일을 생성했습니다.");
           }catch(IOException e) {
        	   System.out.println(e);
           }finally {
        	   if(fw!=null) try { fw.close();} catch(IOException e) {}
           }
	}

}
