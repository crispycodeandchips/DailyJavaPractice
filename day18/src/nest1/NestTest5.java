package nest1;

interface Runnable{	
	void run();	
}

class Sample
{
	public void prt(final int data) {
		System.out.println(data);
		//data+=20;
	}
	
	
	Runnable  getRun(int su) // final int su
	   {
		      class RunImple implements Runnable{
				@Override
				public void run() {
					// TODO Auto-generated method stub
                       System.out.println("run method »£√‚!!!");					
                       System.out.println(su);
                     //  su+=20;
				}
		      }
		
		     RunImple ins=new RunImple();
		    		 
		  return ins;
	   }
}

public class NestTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sample ins=new Sample();
        Runnable r=  ins.getRun(20);
        r.run();
        
        ins.prt(100);
	}

}
