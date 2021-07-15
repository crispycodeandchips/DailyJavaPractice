package day12;

import java.util.Scanner;

public class BankApplicationTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		BankApplication app = new BankApplication();
		while(run){
			System.out.println("==============");
			System.out.println("1.계좌생성 2. 계좌목록 3. 예금 4. 출금 5. 종료");
			System.out.println("==============");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo==1) {
				// 계좌 생성
				// 계좌번호, 계좌주, 초기 입금액
				app.createAccount();
			}else if(selectNo==2) {
				app.accountList();
				// 계좌 목록
			}else if(selectNo==3) {
				app.deposit();
				// 예금
			}else if(selectNo==4) {
				app.withdraw();
			}else if(selectNo==5) {
				run = false;
			}
			
		} // while
		System.out.println("프로그램 종료");
	} // class


} // main
