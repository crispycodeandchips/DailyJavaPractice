package day12;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 1;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		  boolean result=false;
//		
//		  if(obj instanceof Person)
//		  {
//			  Person p=(Person)obj;
//			  if(name.equals(p.name)&& age==p.age)
//				  result=true;
//			  else 
//				  result=false;
//		  }
//		  return result;
// 	}
//	
	
}

public class ObjectEquTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1=new Person("park",20);
       Person p2=new Person("hong", 20);
       
       boolean result= p1.equals(p2);
       System.out.println(result);

       System.out.println("----------");
		
        System.out.println(p1.equals(p2));
		
	}
}
