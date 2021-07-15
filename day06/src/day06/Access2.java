package day06;

public class Access2 {

	private String name;

	public Access2(String name) {
		this.name = name;
	} // 생성자
		// name값을 변경할 기능 getter and setter

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
