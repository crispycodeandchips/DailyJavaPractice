package day03;

import java.util.Scanner;

public class ScoreTest2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("국어 점수를 입력하세요");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력하세요");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력하세요");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor+eng+math;
		float avg = (float)sum/3; //sum이 int 였으니까 캐스팅해서 계산
		String result = "";
		
		if(avg >= 90) 
			result = "A";
		else if(avg>=80)
			result = "B";
		else if(avg>=70)
			result = "C";
		else if(avg>=60)
			result = "D";
		else 
			result = "F";
		
		System.out.printf("name:%s\n", name); //%s:문자열 %d:정수형 %.2f:실수형
		System.out.printf("kor:%d\n", kor);
		System.out.printf("eng:%d\n", eng);
		System.out.printf("math:%d\n",math);
		System.out.printf("sum:%d\n",sum);
		System.out.printf("avg:%.2f\n",avg);
		System.out.printf("grade:%s\n",result);

	}

}
