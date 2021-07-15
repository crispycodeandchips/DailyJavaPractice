package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Sample{
	
	public void prt(List<String> arr) //Ãâ·Â...
	{
		/*
		 * for(String item:arr) System.out.println(item);
		 */
		/*
		 * for(int i=0; i<arr.size(); i++) System.out.println(arr.get(i));
		 */
		
		 Iterator<String>  ita= arr.iterator();
		  while(ita.hasNext())
		  {
			   String data=ita.next();
			   System.out.println(data);
		  }
		
	}
}

public class ArrayListTest6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Sample ins=new Sample();
            List<String> arr=new ArrayList<>();
            arr.add("hong");
            arr.add("kim");
            arr.add("park");
            ins.prt(arr);
		
	}
}