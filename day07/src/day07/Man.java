package day07;

/*   
 * �޼��� �����ε�(method overloading) 
 *  Ŭ���� ������  �̸��� ���� �޼��带 ������ ������ �� �ִ�. 
 *  => �޼��� �̸��� ������ �Ű������� Ÿ��, ����, ������ �ٸ� �� �ٸ� �޼���� �ν�!!
 *      ��, ����Ÿ�԰��� �������
 */

public class Man {

	private String name;
	private int age;
	private String addr;
	private String phone;

	// name�� age�� �����ϴ� �޼���
	public void modify(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name�� addr�� ����ϴ� �޼���
	public void modify(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
	}

	// name�� phone�� ����ϴ� �޼���

	// Duplicate method prt(String, String) in type Man

//	
//	 public string prt(String name, String addr) { 
// 	  return "hong"; 
//	}
	
//	 public void prt(String name, String addr) { 
//  
//	}
//	 
}
