package day14;

import java.io.IOException;

import javax.management.modelmbean.XMLParseException;

/*
 * �޼��� �������̵�
 * ��Ӱ��迡�� �θ� Ŭ�������� ������ �޼��带 �ڽ� Ŭ�������� �ٽ� ����(������)
 * 
 * �θ𿡼� ������ �޼����� �̸�, �Ű����� Ÿ��, ����, ������ ����, ����Ÿ�Ե� ���ƾ� ��(�޼��� �ñ״��İ� ���ƾ� ��)
 * ���������� ���ų� �о��
 * ���ܴ� ���ų� �����
*/

class A1 {
	
	void prt() throws IOException, XMLParseException {
		System.out.println("prt");
	}
}

class A2 extends A1 {

	@Override
	public void prt() throws Exception {

	}
	public class OverrideTest {

	}
}
