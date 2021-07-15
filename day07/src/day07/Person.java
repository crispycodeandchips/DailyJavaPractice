package day07;

// private: Ŭ������������

public class Person {
	private long personId;
	private String name; // ����
	private int age;
	private String phoneNo;
	private String address;
	
	// 1. ��ü������ �Ű�������(����)�� ���� �����ڸ� ���� ȣ��.
	// 2. �ش� �����ڿ� ����� �ٸ� �����ڰ� �ִ����� Ȯ��
	// 3. �ش� �����ڿ� ����� �Ű������� ã��.
	// 4. �ش� �޼��� ���.
	
	// ������ personId, name, age
	public Person(long personId, String name, int age){
		this(personId, name); // �� ��ü�� ���� ���ڷ� ���� �͵� ������.
		this.age = age; // �������� this
	}
	
	// ������ personId, name, age, address;
	public Person(long personId, String name, int age, String address) {
	this(personId, name, age);
	this.address = address;
	}
	
	// ������ personId, name
	public Person(long personId, String name){
		this.personId = personId;
		this.name = name;
	}
	
	// ������ personId, name, phoneNo, address �� ���� �����ڸ� ����ÿ�.
	public Person(long personId, String name, int age, String phoneNo, String address) {
	this(personId, name, age, address);
	this.phoneNo = phoneNo;
	}
	
	// ������ �޼���, �ܺο��� �������� �޼���
	// set - ����, get-��������
	
	
	// ���� �Ű������� �޾ƿͼ� this�� ����
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
	
	
	// �Ű����� �ʿ����
	// return ���� �޾ƿ��� ��. �� �״�� �ޱ⸸ �� �Ŵϱ�.
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
