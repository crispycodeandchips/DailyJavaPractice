package com.keylime.sort1;

import java.util.Comparator;

public class MyCompare implements Comparator<PersonDTO>{

	@Override
	public int compare(PersonDTO o1, PersonDTO o2) {
		// TODO Auto-generated method stub
		//return -(o1.getAge()-o2.getAge());
	     return  -(o1.getName().compareTo(o2.getName()));
	
	}
}
