package day08;

class Phone {

	private String model;
	private String color;

	public void call() {
		System.out.println("��ȭ�� �̴ϴ�");
	}
}

class SmartPhone extends Phone {

	private String os;

	public void getMsg() {
		System.out.println("�޼����� �����ϴ�");
	}

	public void listenToMusic() {
		System.out.println("������ ����ϴ�");
	}
}

public class SuperSubTest2 {
	public static void main(String[] args) {

		SmartPhone ins = new SmartPhone();
		ins.call();
		ins.getMsg();
		ins.listenToMusic();
	}
}
