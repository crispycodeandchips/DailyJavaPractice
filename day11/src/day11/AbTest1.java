package day11;

/*
 *  추상클래스  
 *  : 인스턴스 생성을 못하는 클래스 
 *  
 * abstract  class 클래스이름{
 *  }
 * 
 * 추상메서드+일반메서드 + 클래스메서드 
 * 생성자도 선언할수 있음
 *  변수: 필드(멤버변수+ 클래스변수)
 *  
 * 
 * 일반클래스에서  추상클래스를 상속받아서 오버라이딩 후 객체 생성
 * 
 * 추상메서드   abstract  void prt();
 *  
 * 
 */

abstract class Dog{
	private String name;
	public static int age;
	public Dog() {
		System.out.println("생성자!!!");
	}
	 public abstract void act(); //추상메서드 
	 public void eat()
	 {
		 System.out.println("밥을 먹습니다. ");
	 }
	 public static void prt()
	 {
		 System.out.println("prt");
	 }
}
class ShihTzu extends Dog{
	
	@Override
	public void act(){
		 System.out.println("사람을 보면 짖는다. ");
	}
	public void fav() {
		System.out.println("특기는 자는 것!!");
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
