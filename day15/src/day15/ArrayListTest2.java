package day15;

import java.util.ArrayList;
import java.util.Date;

/*
 *  제네릭 : 객체 타입을 지정 
 * 
 * 
 */

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String>  arr=new ArrayList<String>(3);
            arr.add("hong");
            arr.add("kim");
            //arr.add(new Date());
            //arr.add(1, new Man("hong",20));
             
            arr.add("park");
            arr.add("lee");
            
            System.out.println(arr.size());
            
            for(int i=0; i<arr.size(); i++)
            {
            	String name=arr.get(i);
            	System.out.println(name);
            }
            System.out.println("==================");

            for(String item:arr)
            	System.out.println(item);
            
	}

}
