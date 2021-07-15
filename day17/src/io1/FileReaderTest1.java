package io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  FileReader fr=null;
	  try {
		  fr=new FileReader("c:\\msa/hello.txt");
		  
		  while(true)
		  {
			 int data=fr.read();
			  if(data==-1)
				  break;
			  
			  System.out.print((char)data);
		  }
	  }catch(FileNotFoundException e)
	  {
		  System.out.println("파일을 찾을 수가 없습니다 "+e);
	  }catch(IOException e) {
		  System.out.println(e);
	  }
	  finally {
		  if(fr!=null) try { fr.close();} catch(IOException e) {}
	  }
	}
}
