package day09;

public class Sub1 extends Super1 {

	private String hakno;
	private String dept;
	
	public Sub1(String name, int age, String addr, String hakno, String dept) {
		//super(name, age, addr);
		//this(hakno, dept); // super�� �� ���� ���� ���� �ٸ� �����ڵ��� ��������� ȣ���� �ȵ�.
		// this�� Super�� ȥ�������� ����� �Ұ�!
		this(name, age, addr, hakno); // super�� �и����� ���� this�� ��ü������ ��������� ��.
		this.dept = dept;
	}
	public Sub1(String name, int age, String addr, String hakno){
		super(name, age, addr);
		this.hakno = hakno;
	}
	public Sub1(String hakno, String dept) {
		this.hakno = hakno;
		this.dept = dept;
	}
	
}
