package day14;

import java.util.Calendar;

public abstract class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		int w = calendar.get(Calendar.DAY_OF_WEEK);

		switch (w) {
		case 1: 
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;

		default:
			break;
		}

		System.out.println(calendar.get(Calendar.YEAR));

		System.out.println("=====================");
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("=====================");

		int d1 = calendar.get(Calendar.DATE);
		//int d2 = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(w);
		System.out.println(d1);
		//System.out.println(d2);

	}

}
