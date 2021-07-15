package io1;

import java.io.PrintStream;

class Sample
{
	
}
public class OutputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          PrintStream ps=System.out;
          
          ps.print(true);
          ps.print("aaa");
          ps.print(10.2f);
          ps.print(10.2);
          ps.print(new Sample());
          ps.printf("%s %d","hong",20 );
          System.out.println("=====================");
          System.out.printf("%d  %o  %X", 10, 10,10);
          
	}

}
