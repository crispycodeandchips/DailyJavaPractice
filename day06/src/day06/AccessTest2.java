package day06;

/* ���� ������
 *	private : Ŭ���� �������� ����
 * 	default
 * 	protected
 * 	public : ��ü����
*/
public class AccessTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Access2 ins = new Access2("hong");
	
	ins.setName("park");
	System.out.println(ins.getName());
//	ins.name = "hong";
//	System.out.println(ins.name); // ������ ����
}

}
