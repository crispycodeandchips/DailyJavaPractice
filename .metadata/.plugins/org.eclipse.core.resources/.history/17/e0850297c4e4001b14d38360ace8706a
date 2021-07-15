package nest1;

class Outer3
{
	public String irum="aa";
	static class Inner3{   // static inner class 
		 String name;
		 public static String nick;
		 
		public void prt()		{
			  System.out.println(irum);
             nick="aaa";
			System.out.println("prt!!");
		}
		public static void paint()		{
			//System.out.println(name);
			System.out.println("paint");
		}
	}
}

public class NestTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer3.Inner3.paint();
          Outer3.Inner3 ins=new Outer3.Inner3();
        ins.prt();
        ins.name="park";
        Outer3.Inner3.nick="hello";
        System.out.println(Outer3.Inner3.nick);
          
	}

}
