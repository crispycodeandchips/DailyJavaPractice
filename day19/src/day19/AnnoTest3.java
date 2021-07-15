package day19;

import java.util.ArrayList;
import java.util.List;


class Sample3{

	  @SafeVarargs
	static <T>  List<T> asList(T...tlists){
		    List<T> result=new ArrayList<>();	
		    for(T list: tlists)
		    	result.add(list);
	
	  return result;
	  }
}


public class AnnoTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> arr= Sample3.asList("hong","kim",20);
      
      for(String item:arr)
    	  System.out.println(item);
	}

}
