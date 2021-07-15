package day15;


import java.util.ArrayList;
import java.util.Date;



public class ArrayListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList arr=new ArrayList();
       ArrayList arr2=new ArrayList(3);
       
       arr.add("hong");
       arr.add(new Date());
       arr.add(new Man("hong", 20));
       arr.add(1,"park");
       
       String name=(String) arr.get(0);
       //String irum=(String) arr.get(1);
       System.out.println(name);
       //System.out.println(irum);
       
       Date d=(Date) arr.get(1);
       System.out.println(d);
       
       
		/*
		 * for(int i=0; i<arr.size(); i++) System.out.println(arr.get(i));
		 */
       
	}
}