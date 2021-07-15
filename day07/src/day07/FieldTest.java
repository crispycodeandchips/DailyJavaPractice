package day07;

class Field1 {
	
	private String name = "data1";
	
	public Field1(String name)
	{
		this.name=name;
	}
	public Field1()
	{
		
	}
	public void prt()
	{
		System.out.println(name);
	}	
}

public class FieldTest {
	public static void main(String[] args) {
		
		 Field1 ins=new Field1("hello");
		 ins.prt();
		 
		 System.out.println("-=====");
		 Field1 ins2=new Field1();
		 ins2.prt();
		
	}
}
