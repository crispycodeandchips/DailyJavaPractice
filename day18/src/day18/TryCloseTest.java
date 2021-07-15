package day18;

import java.io.IOException;

import javax.management.modelmbean.XMLParseException;

class Sample implements  AutoCloseable
{
	  void prt()  throws IOException, XMLParseException
	  {
		   System.out.println("prt!!!");
	  }

	@Override
	public void close() throws IOException {
		System.out.println("close method!!!");
	}
}

public class TryCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           Sample ins=null;
//		    try {
//		    	ins=new Sample();
//		    	 ins.prt();
//		    }catch(IOException| XMLParseException e)
//		    {
//		    	System.out.println(e);
//		    }finally {
//		    	if(ins!=null) try { ins.close();} catch(IOException e) {}
//		    }
		
		  try(Sample ins=new Sample();
				  ){   //try-with-resources block 
			    ins.prt();
		  }catch(IOException| XMLParseException e) {
			  System.out.println(e);
		  }
	}
}
