package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, Integer> hm=new HashMap<String, Integer>();
      //추가 
      hm.put("a1", 10);
      hm.put("a2",20);
      hm.put("a3",30);
      hm.put("a4",40);
      
      
//      Set<String> s=hm.keySet();
//      Iterator<String> ita=  s.iterator();
    
        // 전체보기
        Iterator<String> ita=hm.keySet().iterator();
         while(ita.hasNext())
         {
        	 String key=ita.next();
        	 int value=hm.get(key);  //Integer=> int (auto UnBoxing)
        	 System.out.println(key+", "+value);
         }
      
          int data= hm.remove("a3");
          System.out.println(data+"가 삭제됨!!!");
        System.out.println("=============================");

         ita=hm.keySet().iterator();
        while(ita.hasNext())
        {
       	 String key=ita.next();
       	 int value=hm.get(key);  //Integer=> int (auto UnBoxing)
       	 System.out.println(key+", "+value);
        }
       System.out.println("============================");
          hm.put("a1",100);
          ita=hm.keySet().iterator();
          while(ita.hasNext())
          {
         	 String key=ita.next();
         	 int value=hm.get(key);  //Integer=> int (auto UnBoxing)
         	 System.out.println(key+", "+value);
          }
	}
}
