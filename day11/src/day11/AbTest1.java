package day11;

/*
 *  �߻�Ŭ����  
 *  : �ν��Ͻ� ������ ���ϴ� Ŭ���� 
 *  
 * abstract  class Ŭ�����̸�{
 *  }
 * 
 * �߻�޼���+�Ϲݸ޼��� + Ŭ�����޼��� 
 * �����ڵ� �����Ҽ� ����
 *  ����: �ʵ�(�������+ Ŭ��������)
 *  
 * 
 * �Ϲ�Ŭ��������  �߻�Ŭ������ ��ӹ޾Ƽ� �������̵� �� ��ü ����
 * 
 * �߻�޼���   abstract  void prt();
 *  
 * 
 */

abstract class Dog{
	private String name;
	public static int age;
	public Dog() {
		System.out.println("������!!!");
	}
	 public abstract void act(); //�߻�޼��� 
	 public void eat()
	 {
		 System.out.println("���� �Խ��ϴ�. ");
	 }
	 public static void prt()
	 {
		 System.out.println("prt");
	 }
}
class ShihTzu extends Dog{
	
	@Override
	public void act(){
		 System.out.println("����� ���� ¢�´�. ");
	}
	public void fav() {
		System.out.println("Ư��� �ڴ� ��!!");
	}	
}

public class AbTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Dog ins=new Dog();
     	ShihTzu ins3=new ShihTzu();
		 ins3.act();
		 ins3.eat();
		 ins3.fav();
		
		System.out.println("======");		
		Dog ins2=new ShihTzu();
         ins2.act();
         ins2.eat();
         System.out.println("======");
			
	}
}
