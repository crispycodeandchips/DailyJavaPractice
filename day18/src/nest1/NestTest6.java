package nest1;

interface  Hello{
    void sayHello();
}

public class NestTest6 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	  Hello ins=new Hello() {
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("안녕하세요!!!");
		}
	};  //익명클래스  anonymous class
	
	ins.sayHello();
	
	ins=new Hello() {
		
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			   System.out.println("hello");
		}
	};
	ins.sayHello();
	
}
}
