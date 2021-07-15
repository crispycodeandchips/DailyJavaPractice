package inter3;

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalAction ins = new AnimalAction();
		// ins.do1(new Dog());
		// ins.do1(new Cat());
		
		// 2
		Animal a = new Dog();
		Animal b = new Cat();
		ins.do1(new Dog());
		System.out.println("====");
		ins.do1(new Cat());
	}
}
