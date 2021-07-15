package day05;

enum Week1
{
	Sun, Mon, Tue, Wed, Tur, Fri, Sat
	
	}

public class EnumTest2 {
	public static void main(String[] args) {
		
		Week1 w = Week1.Sun;
		switch(w)
		{
		case Sun:
			System.out.println("일요일입니다");
			break;
		case Mon:
			System.out.println("월요일입니다");
			break;
			default:
		}
		
		
	}
}
