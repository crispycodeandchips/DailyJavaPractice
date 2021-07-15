package other;

/*
 * Sample 클래스에는 callDouble과 prt 메서드 2개가 있으며
배열을 받아서 callDouble에서는 각 값을 2배 늘리는 메서드이며
Prt는 그 값을 출력하는 메서드 이다. 
SampleTest 에서 Sample 객체를 만들고 각 메서드를 호출하시오.
class SampleTest                                       class Sample
{                                                      {
  public static void main(String[] args)                각 메서드와 필요한 필드를 
   {                                                      작성하시오.
         int[] arr={10,20,30};                         }
	      Sample ins=new Sample();
          ins.calDouble(arr);
	       ins.prt(arr);
   }
}

 * 
 * 
 * 
 */
public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30};                                   
	      Sample ins=new Sample();
          ins.calDouble(arr);
	      ins.prt(arr);
 
	      
	      System.out.println("-=====");
	      int[] result=   ins.getArr();

	      for(int index:result)
	    	  System.out.println(index);
	
	}
}