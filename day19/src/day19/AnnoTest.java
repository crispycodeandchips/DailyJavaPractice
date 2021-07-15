package day19;

class Sample1
{
	@Deprecated
	public void prt()
	{
		System.out.println("Sample1-prt");
	}
	
	public void paint()
	{
		System.out.println("Sample1-paint method");
	}
}
class Sample2 extends Sample1
{
	public void view()
	{
		System.out.println("Sample2-view");
	}
	
	@Override
	public void paint() {
		System.out.println("Sample2-paint method");
	}
	
}


public class AnnoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Sample1 ins=new Sample2();
         ins.paint();
         
         
         Sample1 ins2=new Sample1();
         ins2.prt();
	}
}
