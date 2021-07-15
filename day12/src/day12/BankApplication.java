package day12;

import java.util.Scanner;

public class BankApplication {

	private Account[] accountArray = new Account[100];
	private int index = 0;
	private Scanner sc = new Scanner(System.in);

	public void createAccount() {
		// 계좌번호, 계좌주, 초기입금액
		System.out.println("==========");
		System.out.println("계좌생성");
		System.out.println("==========");
		System.out.println("계좌번호");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if(acc == null)
		{
			System.out.println("예금주");
			String owner = sc.nextLine();
			System.out.println("초기입금액");
			int balance = Integer.parseInt(sc.nextLine());
			
			accountArray[index++] = new Account(ano, owner, balance);
		
		}else {
			System.out.println("기존의 계좌번호가 있습니다.");
		}

//		Account acc = new Account(ano, owner, balance);
//		accountArray[index] = acc;
//		index = index+1;

		// 계좌주, 초기입금

		// accountArray 넣어야
	} // createAccount

	public void accountList() {
		// TODO Auto-generated method stub
		System.out.println("==========");
		System.out.println("계좌목록");
		System.out.println("==========");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t %s\t %d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
					accountArray[i].getBalance());
		} // for
	} // accountList

	public void deposit() { // 계좌를 찾는 일, 찾은 곳에 입금을 해줘야 balance += money;
		// TODO Auto-generated method stub
		System.out.println("==========");
		System.out.println("예금");
		System.out.println("==========");
		System.out.println("계좌번호");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if (acc == null)
			System.out.println("해당 계좌를 찾지 못했습니다.");
		else
			System.out.println("예금액");
		int money = Integer.parseInt(sc.nextLine());
		acc.setBalance(acc.getBalance() + money); /// 111 500 100 => 600
		System.out.println("예금이 성공되었습니다.");

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
		System.out.println("출금");
		System.out.println("==========");

		System.out.println("계좌번호");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if (acc == null)
			System.out.println("해당 계좌를 찾지 못했습니다.");
		else {
			System.out.println("출금액");
			int money = Integer.parseInt(sc.nextLine());
			if (acc.getBalance() < money) {
				System.out.println("잔고 부족");
			} else {
				acc.setBalance(acc.getBalance() - money); /// 111 500 100 => 600
				System.out.println("출금이 성공되었습니다.");
			}
		}
	} // withdraw
} // class
