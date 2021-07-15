package day15;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet<String> s=new HashSet<String>();
         s.add("park");
         s.add("s1");
         s.add("a2");
         s.add("s1");
         
        Iterator<String> ita= s.iterator();
         while(ita.hasNext())
        	 System.out.println(ita.next());
	}

}
