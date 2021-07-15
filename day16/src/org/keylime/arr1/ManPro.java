package org.keylime.arr1;

import java.util.ArrayList;

public class ManPro {
   private ArrayList<Man> man=new ArrayList<Man>();

   public void addMan(Man m) {
	       man.add(m);
   }

   public  void  printAll()
   {
	     for(Man ins:man)
	    	 System.out.println(ins);
   }

    public  void removeMan(Man ins) {
    	   for(int i=0; i<man.size(); i++)
    	   {
    		    Man p=man.get(i);
    		    if(p.getName().contentEquals(ins.getName()) && p.getAge()==ins.getAge()) {
    		    	  man.remove(i);
    	    }
    }
    	
    }
   
   
   public  void removeMan(String name) {
	       for(int i=0; i<man.size(); i++) {
	    	       if(man.get(i).getName().equals(name))
	    	       {
	    	    	     man.remove(i);
	    	    	     i--;
	    	       }
	       }
	    
   }
   
}
