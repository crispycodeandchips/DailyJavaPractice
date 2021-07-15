package day12;


class Sample
{
	  private String name;
	  private int age;
	  public Sample(String name, int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	
}

public class ObjectTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sample ins=new Sample("hong",10);
         String result= ins.toString();
         System.out.println(result);
         System.out.println(ins.toString());
         System.out.println(ins);
	}

}
