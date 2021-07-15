package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 *       자료구조  - 객체 저장.. 
 *       List:  중복을 허용한 순서보장된 collection
 *               선형구조
 *               
 *            ArryList   Vector : 배열 - 검색이 용이
 *                 ArrayList: 비동기
 *                 Vector:  동기화
 *            LinkedList: 이중 링크드 리스트 : 추가, 삭제 용이 
 *               비동기
 *      Map : key, value로 매핑되어진 구조  둘다, 객체를 저장
 *            key는 순서보장이 안됨!!
 *            
 *        key: null을 허용하지 않음, 중복허용이 x => Set타입 자료
 *        value : key에 의해 value 를 찾고
 *            value은 중복이 허용됨
 *     
 *        Hashtable  : 동기처리됨    
 *        HashMap  :  비동기 
 * 
 *    Set  : 집합 
 *         중복x, 순서x
 *     HashSet, TreeSet,  LinkedHashSet
 *      
 *     
 * 
 */


public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            HashMap<String, Integer> hm=new HashMap<String, Integer>();
             hm.put("a1", 10);
             hm.put("a2",20);
             hm.put("a3",50);
             hm.put("t1", 150);
             hm.put("a1", 400);
             hm.put("s1", 10);
            // hm.put(null,2);
            // hm.put("eee",null);
             //  자료 받아서 출력    get 
		/*
		 * System.out.println(hm.get("a1")); //400 System.out.println(hm.get("a2"));
		 * //20 System.out.println(hm.get("a3")); //50 System.out.println(hm.get("t1"));
		 * //150 System.out.println(hm.get("a1")); //400
		 * System.out.println(hm.get("s1")); //10
		 */
         
//            Set<String> s= hm.keySet();
//            
//            Iterator<String>  ita= s.iterator();
     
             Iterator<String> ita=hm.keySet().iterator();
             while(ita.hasNext()) {
            	   String key=ita.next();
            	   int value=hm.get(key);
            	   System.out.println("key:"+key+", value:"+value);
            	 
             }
	}
}
