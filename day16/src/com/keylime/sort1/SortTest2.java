package com.keylime.sort1;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> arrstr=new ArrayList<>();
      arrstr.add("park");
      arrstr.add("kim");
      arrstr.add("kang");
      arrstr.add("ahn");
      arrstr.add("hong");
      
      for(String item: arrstr)
    	  System.out.println(item);
      
      System.out.println("===============");
      
      Collections.sort(arrstr);
      
      for(String item:arrstr)
    	  System.out.println(item);
      
	}
}
