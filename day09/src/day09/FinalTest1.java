package day09;

	// final ���� : ��� - ��������, �ν��Ͻ� ����, Ŭ���� ������ ���� ����...
	// final �޼��� : �������̵� �Ұ�
	// final Ŭ���� : ��ӺҰ� (��������), ���� Ŭ����

class Final1 {
public void prt() {
	System.out.println("final1 prt method");
}

}

class SubFinal1 extends Final1 {
	
	@Override
	public void prt() { // ������ : ��Ӱ��迡�� �θ𿡼� ���ǵ� �޼��带 �ڽ�Ŭ�������� �ٽ� ����
		System.out.println("SubFinal1");
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		
	}
}