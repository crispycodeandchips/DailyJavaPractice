package other;

/*
 * Sample Ŭ�������� callDouble�� prt �޼��� 2���� ������
�迭�� �޾Ƽ� callDouble������ �� ���� 2�� �ø��� �޼����̸�
Prt�� �� ���� ����ϴ� �޼��� �̴�. 
SampleTest ���� Sample ��ü�� ����� �� �޼��带 ȣ���Ͻÿ�.
class SampleTest                                       class Sample
{                                                      {
  public static void main(String[] args)                �� �޼���� �ʿ��� �ʵ带 
   {                                                      �ۼ��Ͻÿ�.
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