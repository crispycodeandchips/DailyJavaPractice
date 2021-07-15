package day13;

/* String : 변경을 안하려는 문자열
 * ex String name = "hong";
 * name += "123";
 * 
 * 버퍼기능을 포함한 문자열 표현, 조작을 하기 위한 문자열 객체
 * StringBuffer : 동기화 처리 (locking)// 쉐어하우스 방문을 잠금
 * StringBuilder : 비동기 처리 (unlocking)-> 속도가 높다 // 쉐어하우스 방문을 엶
 * 
 * garbage collection => 힙 메모리에서 사용 안하는 메모리를 주기적으로 지움
 * => garbage collector 
 * 
 * 임계영역(critical section) : 공유자원
*/

public class StringTest2 {
	public static void main(String[] args) {
		
		String name = "hong";
		String name2 = new String("hong");
		
		char ch1 = name.charAt(0);
		System.out.println(ch1);
		System.out.println("============");
		
		
		//gnoh?  charAt()... 
		for(int i = name.length()-1; i>0; i--)
			System.out.println(name2.charAt(i));
		 System.out.println("========");
  	   
  	   String data1 = "hong";
  	
  	   int result = data1.compareTo("hon");
  	   System.out.println(result);
  	
  	   int result2 = data1.compareTo("hong");
  	   System.out.println(result2);
  	
  	   int result3 = data1.compareTo("park");
  	   System.out.println(result3);
	}

}
