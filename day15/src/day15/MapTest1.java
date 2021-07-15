package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 *       �ڷᱸ��  - ��ü ����.. 
 *       List:  �ߺ��� ����� ��������� collection
 *               ��������
 *               
 *            ArryList   Vector : �迭 - �˻��� ����
 *                 ArrayList: �񵿱�
 *                 Vector:  ����ȭ
 *            LinkedList: ���� ��ũ�� ����Ʈ : �߰�, ���� ���� 
 *               �񵿱�
 *      Map : key, value�� ���εǾ��� ����  �Ѵ�, ��ü�� ����
 *            key�� ���������� �ȵ�!!
 *            
 *        key: null�� ������� ����, �ߺ������ x => SetŸ�� �ڷ�
 *        value : key�� ���� value �� ã��
 *            value�� �ߺ��� ����
 *     
 *        Hashtable  : ����ó����    
 *        HashMap  :  �񵿱� 
 * 
 *    Set  : ���� 
 *         �ߺ�x, ����x
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
             //  �ڷ� �޾Ƽ� ���    get 
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
