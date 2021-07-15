package com.keylime.sort1;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<StudentDTO> arr=new ArrayList<>();
        //arr... 5∞≥ ¿˙¿Â
        
           arr.add(new StudentDTO("01","park",  20));
           arr.add(new StudentDTO("02", "kim2", 10));
           arr.add(new StudentDTO("03", "han", 13));
           arr.add(new StudentDTO("04", "kim1", 10));
           arr.add(new StudentDTO("05", "kang", 25));
           
		  for(StudentDTO item:arr)
			  System.out.println(item);
		
		  System.out.println("=================");
		   Collections.sort(arr);
		   
		   for(StudentDTO item:arr)
	           System.out.println(item);	   
		
	}
}
