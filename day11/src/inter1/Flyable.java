package inter1;

/*
 * 	�������̽�
 * 	interface �������̽� �̸� {
 * 
 * 	}
 * 	public abstract method
 * 	class ���� �������̽� ��ӹ��� ���� implements�� ���
 * 	�����ڰ� ����!!!
 * 	Ŭ���� �޼���� ��� ����!
 * 	public static final ����(���)
*/
public interface Flyable {
	void prt();
	int num = 10; // public static final ����
	static void print() {
		System.out.println("prt!!!");
	} // jdk8 �̻����

	default void draw() {
		System.out.println("draw");
	} // jdk8 �̻���� ��� ����
}
