package day03;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {


		// 0~100�� ������ ������ �Է� �޾Ƽ� A~F ������ ����� ��.
		Scanner sc = new Scanner(System.in);
		String result=" ";
		
		while (true) 
		{
			System.out.println("������ �Է��ϼ���");
			int score = Integer.parseInt(sc.nextLine());

			if(score>= 0)
			{

				if(score>=90)
					result="A";
				else if(score>=80)
					result="B";
					else if(score>=70)
						result="C";
						else if(score>=60)
							result="D";
							else
								result="F";
				
				System.out.println("����: "+score);
				System.out.println("����: "+result);
			}
			else {
				System.out.println("�Է� ����! ������ �߸� �Է��߽��ϴ�.");
			}
			
			System.out.println("�ٽ� �Է��ұ��?");
			String yn = sc.nextLine();
			if(yn.equals("n"))
				break;
		} // end while
		sc.close();
	} // end main
} // end class
