package day15;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Man> arr=new ArrayList<Man>();
       arr.add(new Man("hong", 20));
       arr.add(new Man("park",10));
       arr.add(new Man("kim",12));
       arr.add(new Man("ha", 20));
       
       for(Man ins:arr)
       {
    	   System.out.println(ins.getName()+", "+ins.getAge());
       }
	}

}
