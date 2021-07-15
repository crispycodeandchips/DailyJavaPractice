package hash1;

class Person1{
	private String name;
	private int age;
	public Person1(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "name:"+name+", age:"+age;
	}
}

public class HashTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="hong";
       String name2="park";
       
       System.out.println(name.hashCode());
       System.out.println(name2.hashCode());
       
       Person1 p1=new Person1("park",20);
       Person1 p2=new Person1("park",20);
       
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());
	}

}
