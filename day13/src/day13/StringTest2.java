package day13;

/* String : ������ ���Ϸ��� ���ڿ�
 * ex String name = "hong";
 * name += "123";
 * 
 * ���۱���� ������ ���ڿ� ǥ��, ������ �ϱ� ���� ���ڿ� ��ü
 * StringBuffer : ����ȭ ó�� (locking)// �����Ͽ콺 �湮�� ���
 * StringBuilder : �񵿱� ó�� (unlocking)-> �ӵ��� ���� // �����Ͽ콺 �湮�� ��
 * 
 * garbage collection => �� �޸𸮿��� ��� ���ϴ� �޸𸮸� �ֱ������� ����
 * => garbage collector 
 * 
 * �Ӱ迵��(critical section) : �����ڿ�
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
