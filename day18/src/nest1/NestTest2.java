package nest1;

class Outer2
{
	public  String name;
	public static  String nick;
	
	  class Inner2{
		  public String name2;
		 // public static  String nick2;  ����!!
		  public static final int su=20;
		  public static void prt()
		  {
			  System.out.println("prt!!!");
		  }
	  }

}
public class NestTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer2 ins=new Outer2();
         ins.name="hong";
         System.out.println(ins.name);
         Outer2.nick="abc";
         System.out.println(Outer2.nick);
         System.out.println("====================");
         
         
        Outer2.Inner2 obj= ins.new Inner2();
         obj.name2="park";
         System.out.println(obj.name2);
         
          System.out.println(Outer2.Inner2.su);
         
         
	}

}
