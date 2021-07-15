package saturday;

import java.util.Scanner;

public class MemberTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	String name = sc.nextLine();
	System.out.println("주민번호를 입력하세요");
	String jumin = sc.nextLine();
	
	MemberVO m = new MemberVO();
	m.setName(name);
	m.setJumin(jumin);
	
	
	
}
}
