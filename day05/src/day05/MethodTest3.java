package day05;

import java.util.Scanner;

// MethodTest3에서 입력받아서 A class prt 메서드에서 출력하는 문제 !!!
// MethodTest3에서 나이를 입력받아서 
// 		A class에 calAge()의 메서드를 만들어 10대 20대 30대 40대 50대 60대를 출력
// MethodTest3에서 나이를 출력하는 문제
class A
{
	void prt(String irum) {
		System.out.println("이름은 :"+irum);
	}
	
	String calAge(int age){
	// 고민... 매개변수... 10대 20대 ~ 60대...?
	// return
		String result = "";
		
		if (age/10==0)
			result="0대";
		else if (age/10==1)
			result="10대";
		else if (age/10==2)
			result="20대";
		else if (age/10==3)
			result="30대";
		else if (age/10==4)
			result="40대";
		else if (age/10==5)
			result="50대";
		else if (age/10==6)
			result="60대";
		else
			result = "나머지 세대";
		return result;
	
	}
}
public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ins = new A();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		ins.prt(name);
		//instance // print
		
	
		
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(sc.nextLine());
		
		String degree = ins.calAge(age);
		System.out.println("세대 : "+degree);

	
	}

}
