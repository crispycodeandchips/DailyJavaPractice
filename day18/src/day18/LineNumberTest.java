package day18;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try( 
		LineNumberReader r=new LineNumberReader(new FileReader("./hello.txt"));
         ){
             while(true) {
            	 String content=r.readLine();
            	 if(content==null) break;
            	 
            	 System.out.println(r.getLineNumber()+":"+ content);
            }
        	
        }catch (IOException e) {
	
            System.out.println(e);
        }
	}

}
