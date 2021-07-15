package day03;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {


		// 0~100점 사이의 점수를 입력 받아서 A~F 학점을 출력할 것.
		Scanner sc = new Scanner(System.in);
		String result=" ";
		
		while (true) 
		{
			System.out.println("점수를 입력하세요");
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
				
				System.out.println("점수: "+score);
				System.out.println("학점: "+result);
			}
			else {
				System.out.println("입력 오류! 점수를 잘못 입력했습니다.");
			}
			
			System.out.println("다시 입력할까요?");
			String yn = sc.nextLine();
			if(yn.equals("n"))
				break;
		} // end while
		sc.close();
	} // end main
} // end class
