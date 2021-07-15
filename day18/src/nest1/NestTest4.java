package nest1;

class Outer4{
	String dept="abc";
	public void prt() {
		System.out.println("prt!!");
		String name="hello";//local variable 
		
		class Sample{  //local inner class
			void paint()
			{
				System.out.println(dept);
				System.out.println(name);
				System.out.println("paint");
			}
		}// sample
		
		Sample ins=new Sample();
		ins.paint();
	}
	
	public void view()
	{
		Sample ins=new Sample();
		
	}
	
}


public class NestTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer4 ins=new Outer4();
          ins.prt();
	}

}