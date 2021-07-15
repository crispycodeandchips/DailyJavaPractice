package day06;

class Person1 {
	int score = 20;
	
	Person1(int score) {
		score =+ score;
		System.out.println(this.score);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 ins = new Person1(50);
	}

}
