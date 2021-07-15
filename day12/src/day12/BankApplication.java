package day12;

import java.util.Scanner;

public class BankApplication {

	private Account[] accountArray = new Account[100];
	private int index = 0;
	private Scanner sc = new Scanner(System.in);

	public void createAccount() {
		// ���¹�ȣ, ������, �ʱ��Աݾ�
		System.out.println("==========");
		System.out.println("���»���");
		System.out.println("==========");
		System.out.println("���¹�ȣ");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if(acc == null)
		{
			System.out.println("������");
			String owner = sc.nextLine();
			System.out.println("�ʱ��Աݾ�");
			int balance = Integer.parseInt(sc.nextLine());
			
			accountArray[index++] = new Account(ano, owner, balance);
		
		}else {
			System.out.println("������ ���¹�ȣ�� �ֽ��ϴ�.");
		}

//		Account acc = new Account(ano, owner, balance);
//		accountArray[index] = acc;
//		index = index+1;

		// ������, �ʱ��Ա�

		// accountArray �־��
	} // createAccount

	public void accountList() {
		// TODO Auto-generated method stub
		System.out.println("==========");
		System.out.println("���¸��");
		System.out.println("==========");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t %s\t %d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
					accountArray[i].getBalance());
		} // for
	} // accountList

	public void deposit() { // ���¸� ã�� ��, ã�� ���� �Ա��� ����� balance += money;
		// TODO Auto-generated method stub
		System.out.println("==========");
		System.out.println("����");
		System.out.println("==========");
		System.out.println("���¹�ȣ");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if (acc == null)
			System.out.println("�ش� ���¸� ã�� ���߽��ϴ�.");
		else
			System.out.println("���ݾ�");
		int money = Integer.parseInt(sc.nextLine());
		acc.setBalance(acc.getBalance() + money); /// 111 500 100 => 600
		System.out.println("������ �����Ǿ����ϴ�.");

	} // deposit

	public Account findAccount(String ano) {
		Account result = null;

		for (int i = 0; i < index; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				result = accountArray[i];
				break;
			}
		} // for
		return result;
	} // find Account

	public void withdraw() {
		System.out.println("==========");
		System.out.println("���");
		System.out.println("==========");

		System.out.println("���¹�ȣ");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if (acc == null)
			System.out.println("�ش� ���¸� ã�� ���߽��ϴ�.");
		else {
			System.out.println("��ݾ�");
			int money = Integer.parseInt(sc.nextLine());
			if (acc.getBalance() < money) {
				System.out.println("�ܰ� ����");
			} else {
				acc.setBalance(acc.getBalance() - money); /// 111 500 100 => 600
				System.out.println("����� �����Ǿ����ϴ�.");
			}
		}
	} // withdraw
} // class
