package day03;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {

		// //숫자를 입력받아서 1부터 그 값까지 출력한 후 합계를 구하시오 (for, while)
		// Scanner sc = new Scanner(System.in);
		// System.out.println("숫자를 입력하세요");
		// int num = Integer.parseInt(sc.nextLine());
		//
		// int i=1;
		// int sum = 0;
		// while(i<=num) {
		//
		// sum += i;
		// System.out.println(i);
		// i++;
		// }
		// System.out.println("\n총합: "+sum);

		/*
		 * + - + - + -
		 * 
		 * 숫자입력 6
		 * 
		 * 숫자 3 + - +
		 * 
		 * while 문으로
		 */
		//
		// Scanner sc1 = new Scanner(System.in);
		// System.out.println("숫자를 입력하세요");
		// int num = Integer.parseInt(sc1.nextLine());
		//
		// int i = 1;
		// String result="";
		// while (i<=num) {
		//
		// if(i%2==1) {
		// result += "+";
		// }else {
		// result += "-";
		// }
		// i++;
		// }

		
		
		//5!=5*4*3*2*1=120
		
		// 누적할 수 있는 변수 하나
		// 실제 계산할 수 있는 변수 하나
		// 그리고 얘네들을 저장할 수 있는 변수 하나
		 Scanner sc=new Scanner(System.in);
		 System.out.println("숫자를 입력하세요");
		 int num = Integer.parseInt(sc.nextLine());
		
		 int i = num;
		 String data = "";
		 int result = 1; //곱해야 하니까 초기값이 1; // 5 4 3 2 1   
		 while (i>=1) {
		 if(i==num) { //입력값과 시작값이 같을 때
		 data += i; //""+5 => "5" 문자열과 숫자열을 단순 연결
		 }else {
		 data += "*"+i;
		 }
		 result *=i;
		 i--;
		 }
		 System.out.println(num+"!="+data+"="+result);
	
	}
}
