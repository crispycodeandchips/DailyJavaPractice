package day08;

class Phone {

	private String model;
	private String color;

	public void call() {
		System.out.println("전화를 겁니다");
	}
}

class SmartPhone extends Phone {

	private String os;

	public void getMsg() {
		System.out.println("메세지를 보냅니다");
	}

	public void listenToMusic() {
		System.out.println("음악을 듣습니다");
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
