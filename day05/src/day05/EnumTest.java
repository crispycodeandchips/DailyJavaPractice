package day05;

enum Week{ //���� Ÿ�� //enum : ����� Ÿ���� �����ϴ� �ֵ��߿� �ϳ���
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
