package day06;

/* 접근 지정자
 *	private : 클래스 내에서만 접근
 * 	default
 * 	protected
 * 	public : 전체공개
*/
public class AccessTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Access2 ins = new Access2("hong");
	
	ins.setName("park");
	System.out.println(ins.getName());
//	ins.name = "hong";
//	System.out.println(ins.name); // 컴파일 오류
}

}
