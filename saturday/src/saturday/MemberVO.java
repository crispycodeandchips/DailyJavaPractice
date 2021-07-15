package saturday;

public class MemberVO {

	private String name;
	private String jumin;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	public String[] getBirth() {
		
	String year = jumin.substring(0,2);
	String month = jumin.substring(2,4);
	String day = jumin.substring(4,6);
	String[] birth = new String[]{year, month, day};
	return birth;
		
		
	}
	

}
