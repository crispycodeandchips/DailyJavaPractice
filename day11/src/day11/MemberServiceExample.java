package day11;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MemberService memberSerivce=new MemberService();
     boolean result=memberSerivce.login("hong","12345");
     if(result) {
    	   System.out.println("로그인 되었습니다");
    	   memberSerivce.logout("hong");
     }
     else
    	 System.out.print("아이디 또는 패스워드가 올바르지 않습니다");     
	}

}
