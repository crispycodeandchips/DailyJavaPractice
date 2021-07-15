package day12;


class Sample1
{
	  private String name;
	  private int age;
	  public Sample1(String name, int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	@Override
	public String toString() {
		return "Sample1 [name=" + name + ", age=" + age + "]";
	}
	
	  
	  
	/*
	 * @Override public String toString() { return "name:" + name + ", age:" + age;
	 * }
	 */
	  
}

public class ObjectTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample1 ins=new Sample1("hong", 20);
        System.out.println(ins.toString());
        System.out.println(ins);
	}
}
