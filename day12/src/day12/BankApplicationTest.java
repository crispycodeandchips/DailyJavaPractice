package day12;

import java.util.Scanner;

public class BankApplicationTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		BankApplication app = new BankApplication();
		while(run){
			System.out.println("==============");
			System.out.println("1.���»��� 2. ���¸�� 3. ���� 4. ��� 5. ����");
			System.out.println("==============");
			System.out.println("����>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo==1) {
				// ���� ����
				// ���¹�ȣ, ������, �ʱ� �Աݾ�
				app.createAccount();
			}else if(selectNo==2) {
				app.accountList();
				// ���� ���
			}else if(selectNo==3) {
				app.deposit();
				// ����
			}else if(selectNo==4) {
				app.withdraw();
			}else if(selectNo==5) {
				run = false;
			}
			
		} // while
		System.out.println("���α׷� ����");
	} // class


} // main
