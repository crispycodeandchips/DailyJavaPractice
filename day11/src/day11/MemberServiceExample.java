package day11;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MemberService memberSerivce=new MemberService();
     boolean result=memberSerivce.login("hong","12345");
     if(result) {
    	   System.out.println("�α��� �Ǿ����ϴ�");
    	   memberSerivce.logout("hong");
     }
     else
    	 System.out.print("���̵� �Ǵ� �н����尡 �ùٸ��� �ʽ��ϴ�");     
	}

}
