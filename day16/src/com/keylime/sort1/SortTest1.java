package com.keylime.sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Integer> arr=new ArrayList<Integer>();
          arr.add(10);
          arr.add(40);
          arr.add(20);
          arr.add(30);
          arr.add(5);
          
          for(Integer item:arr)
        	  System.out.println(item);
          System.out.println("===============");
          
          Collections.sort(arr); //���� 

          Iterator<Integer>  ita=arr.iterator();
          
          while(ita.hasNext())
        	  System.out.println(ita.next());
          System.out.println("=============");
          for(int i=0; i<arr.size(); i++)
        	  System.out.println(arr.get(i));
          
	}
}