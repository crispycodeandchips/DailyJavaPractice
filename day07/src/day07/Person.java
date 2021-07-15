package day07;

// private: 클래스내에서만

public class Person {
	private long personId;
	private String name; // 변수
	private int age;
	private String phoneNo;
	private String address;
	
	// 1. 객체에서는 매개변수가(인자)가 없는 생성자를 먼저 호출.
	// 2. 해당 생성자와 연결된 다른 생성자가 있는지를 확인
	// 3. 해당 생성자와 연결된 매개변수를 찾음.
	// 4. 해당 메서드 출력.
	
	// 생성자 personId, name, age
	public Person(long personId, String name, int age){
		this(personId, name); // 값 자체가 직접 인자로 들어가는 것도 가능함.
		this.age = age; // 참조변수 this
	}
	
	// 생성자 personId, name, age, address;
	public Person(long personId, String name, int age, String address) {
	this(personId, name, age);
	this.address = address;
	}
	
	// 생성자 personId, name
	public Person(long personId, String name){
		this.personId = personId;
		this.name = name;
	}
	
	// 생성자 personId, name, phoneNo, address 에 관한 생성자를 만드시오.
	public Person(long personId, String name, int age, String phoneNo, String address) {
	this(personId, name, age, address);
	this.phoneNo = phoneNo;
	}
	
	// 변경할 메서드, 외부에서 가져오는 메서드
	// set - 변경, get-가져오는
	
	
	// 값을 매개변수로 받아와서 this로 연결
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// 매개변수 필요없고
	// return 값만 받아오면 됨. 말 그대로 받기만 할 거니까.
	public long getPersonId() {
		return personId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public String getAddress() {
		return address;
	}
}
