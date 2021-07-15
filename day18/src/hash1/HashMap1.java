package hash1;

import java.util.HashMap;

class Irum{
	  private String firstname;
	  private String lastname;
	  
	  public Irum(String firstname, String lastname)
	  {
		  this.firstname=firstname;
		  this.lastname=lastname;
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		Irum other = (Irum) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	  
	  
	  
//	 public String toString()
//	 {
//		 return firstname+", "+lastname;
//	 }
	 
}

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Irum, Integer> hm=new HashMap<Irum, Integer>();
          hm.put(new Irum("±è", "À¯Áø"),27);
          hm.put(new Irum("±è","¿ø°â"), 29);
          hm.put(new Irum("ÀÌ","Ã¤ÇÏ"), 29);
          
          System.out.println(new Irum("±è","À¯Áø"));
          System.out.println(new Irum("±è","À¯Áø"));         
          
        int age=hm.get(new Irum("±è","À¯Áø"));
          System.out.println(age);

	
	  String name="hong";
	  String name2="hong";
	  
	  System.out.println(name==name2);
	
	}
}