package day08;

public class Member {
	
	String name;
	String id;
	String pw;
	int age;
	
	public Member (String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean login(String id, String pw) {
		
		if (id == "hong" && pw == "12345") {
			System.out.println("true");
			return true;
			
		}
		
		else
			return false;
	} // end method	
	
	public void logout() {
		System.out.println("로그아웃 되었습니다");
	}
}

