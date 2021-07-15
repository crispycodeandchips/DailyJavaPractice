package day17;

public class StudentDTO {
	  private String hakno;
	  private String name;
	  private int age;
	public String getHakno() {
		return hakno;
	}
	public void setHakno(String hakno) {
		this.hakno = hakno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentDTO(String hakno, String name, int age) {
		super();
		this.hakno = hakno;
		this.name = name;
		this.age = age;
	}
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDTO [hakno=" + hakno + ", name=" + name + ", age=" + age + "]";
	}
}
