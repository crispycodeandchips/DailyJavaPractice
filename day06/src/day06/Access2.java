package day06;

public class Access2 {

	private String name;

	public Access2(String name) {
		this.name = name;
	} // ������
		// name���� ������ ��� getter and setter

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void prt() {
		System.out.println(name);
	}

}
