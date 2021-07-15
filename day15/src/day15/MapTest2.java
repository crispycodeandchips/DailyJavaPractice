package day15;

import java.util.HashMap;
import java.util.Hashtable;

class Name{
	  private String name;
	  private int age;
	  
	  public Name(String  name, int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	
	  public String toString()
	  {
		  return "name:"+name+", age:"+age;
	  }
	  
}

class Student{
	 private String hak;
	 public Student(String hak)
	 {
		 this.hak=hak;
	 }
	  public String toString()
	  {
		  return "hak:"+hak;
	  }
	  
	
}

public class MapTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Name, Integer> hm=new HashMap<Name, Integer>();
		  // hm.put(null, new Student("hong"));
           hm.put(null,10 );
           
         int su=  hm.get(null);
         System.out.println(su);
	}
}
