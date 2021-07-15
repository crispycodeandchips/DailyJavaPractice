package day05;

class Man{
	int age = 10;
}

public class RefTest {
	public static void main(String[] args) {
		
		Man ins1 = new Man();
		Man ins2  = new Man();
		System.out.println(ins1==ins2); // false
		System.out.println(ins1.age==ins2.age); // true 
		
		Man ins3=ins1;
		System.out.println(ins3==ins1); // true
		
	}

}
