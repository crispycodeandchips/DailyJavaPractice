package inter3;

public abstract class Animal {
	public void eat(String food) {
		System.out.println(food + "먹습니다");
	}

	public abstract void sound(); // 추상 메소드
}
