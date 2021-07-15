package abstract1;

/* �߻�Ŭ������ ��ü������ ���� ���ϴ� Ŭ����
 * Ŭ���� �̸� �տ� abstract
 * abstract class Ŭ������{} -> �߻�Ŭ����
 * ��ü ������ ���ؼ��� 
*/
abstract class Dog { // Ŭ���� �տ� abstract�� ���̸� �װ� ��ü�� �� ����� Ŭ����.
	public void sound() {
		System.out.println("�۸�");
	}

	public void eat() {
		System.out.println("���� �Խ��ϴ�");
	}
	
	public abstract void act(); // ���� �ְ� ������ ����. // �߻� �޼���
}

class ShihTzu extends Dog {
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("�ڸ� ���");
		System.out.println("������� ¢�´�");
	}
	
}
class GoldenRetriever extends Dog {
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("���� �μ���");
		System.out.println("���ĸ� ��´�");
		System.out.println("���� �μ���");
		
	}
	
	
}

public class AbstractTest1 {
	public static void main(String[] args) {
		//Dog ins = new Dog();
		//GoldenRetriever ins = new GoldenRetriever();
		//Dog ins2 = new Dog(); // ��ü �� ���� 
		Dog ins3 = new GoldenRetriever();
		ins3.sound(); // �޼��� ȣ�� ����� ������, ����� �� �ٸ���.s (������)
		ins3.eat(); // �޼���� Dog ��ü�� �޼���, ����� GR��ü�� ���
		ins3.act();
		System.out.println("====================");
		ins3 = new ShihTzu();
		ins3.sound(); // �޼��� ȣ�� ����� ������, ����� �� �ٸ���. (������)
		ins3.eat(); // �޼���� Dog ��ü�� �޼���, ����� ST��ü�� ���
		ins3.act();
		//GoldenRetriever ins4 = new Dog();
	}
}
