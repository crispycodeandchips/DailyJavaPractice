package day09;

public class DogTest {
	public static void main(String[] args) {
		
		Dog[] ins = new Dog[5]; 
		//���� ��ü�� 5�� �����Ͽ� �迭�� �߰��Ѵ�
		// �� �׷� string ������ �޾Ƽ� �迭�� �߰� �ؾ� �� �� ������ �𸣰ڴ�...?
		
		ins[0] = new Dog("�ϳ�", "�ð�");
		ins[1] = new Dog("��", "����");
		ins[2] = new Dog("��", "�˰�");
		ins[3] = new Dog("��", "���ð�");
		ins[4] = new Dog("�ټ�", "�鰳");
		
		for (int i = 0; i < ins.length; i++) {
			System.out.println(ins[i]);
		}
	}
}
