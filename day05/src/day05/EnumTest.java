package day05;

enum Week{ //열거 타입 //enum : 사용자 타입을 선언하는 애들중에 하나다
	sun, mon, thue, wed, tur, fri, sat
	
}

public class EnumTest {
	public static void main(String[] args) {

		System.out.println(Week.sun);
		System.out.println(Week.fri);
		
		
		Week w = Week.wed;
		
		System.out.println(w);
		
		
	}
}
