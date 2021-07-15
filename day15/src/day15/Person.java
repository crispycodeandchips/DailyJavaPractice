package day15;

public class Person {
	private int pno;
	private String pname;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Person(int pno, String pname) {
		super();
		this.pno = pno;
		this.pname = pname;
	}
	public Person() {
		super();
	}
}
