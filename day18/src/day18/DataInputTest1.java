package day18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try(DataInputStream dis=new DataInputStream(new FileInputStream("./d1.txt"));) {
			  double a1= dis.readDouble();  //10.2
			  
              int a2= dis.readInt();  //10
              String result=dis.readUTF();  //æ»≥Á«œººø‰
              float d3=dis.readFloat();  //10.2f
              
              
              System.out.println(a1+1);
              System.out.println(a2+1);
              System.out.println(result);
              System.out.println(d3+10);
              
		}catch(IOException e) {
			
			System.out.println(e);
		}
			
	}
}
