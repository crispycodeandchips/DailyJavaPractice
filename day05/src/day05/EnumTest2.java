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
			System.out.println("�Ͽ����Դϴ�");
			break;
		case Mon:
			System.out.println("�������Դϴ�");
			break;
			default:
		}
		
		
	}
}
