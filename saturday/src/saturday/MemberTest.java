package saturday;

import java.util.Scanner;

public class MemberTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���");
	String name = sc.nextLine();
	System.out.println("�ֹι�ȣ�� �Է��ϼ���");
	String jumin = sc.nextLine();
	
	MemberVO m = new MemberVO();
	m.setName(name);
	m.setJumin(jumin);
	
	
	
}
}
