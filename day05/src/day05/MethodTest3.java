package day05;

import java.util.Scanner;

// MethodTest3���� �Է¹޾Ƽ� A class prt �޼��忡�� ����ϴ� ���� !!!
// MethodTest3���� ���̸� �Է¹޾Ƽ� 
// 		A class�� calAge()�� �޼��带 ����� 10�� 20�� 30�� 40�� 50�� 60�븦 ���
// MethodTest3���� ���̸� ����ϴ� ����
class A
{
	void prt(String irum) {
		System.out.println("�̸��� :"+irum);
	}
	
	String calAge(int age){
	// ���... �Ű�����... 10�� 20�� ~ 60��...?
	// return
		String result = "";
		
		if (age/10==0)
			result="0��";
		else if (age/10==1)
			result="10��";
		else if (age/10==2)
			result="20��";
		else if (age/10==3)
			result="30��";
		else if (age/10==4)
			result="40��";
		else if (age/10==5)
			result="50��";
		else if (age/10==6)
			result="60��";
		else
			result = "������ ����";
		return result;
	
	}
}
public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ins = new A();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		ins.prt(name);
		//instance // print
		
	
		
		System.out.println("���̸� �Է��ϼ���");
		int age = Integer.parseInt(sc.nextLine());
		
		String degree = ins.calAge(age);
		System.out.println("���� : "+degree);

	
	}

}
