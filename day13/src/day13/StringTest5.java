package day13;

public class StringTest5 {
	public static void main(String[] args) {
		String name = "abc";
		System.out.println(name.compareToIgnoreCase("ABC"));
		
		name = name.concat("1111");
		System.out.println(name);
		
		boolean result = name.contains("11");
		System.out.println(result);
		
		// endsWith, startsWith
		System.out.println("=============");
		String data = "hong gil dong";
		System.out.println(data.endsWith("ng")); //~�� ������
		System.out.println(data.endsWith("on"));
		System.out.println(data.startsWith("ho")); // ~�� �����ϳ�
		System.out.println(data.startsWith("e"));
		
		// index of
		System.out.println(data.indexOf("g")); // 3��° // ex) ga -1 : ��ã��
		System.out.println(data.indexOf("g",7)); // 7��°���� g�� ã��(��������)
		
		// lastIndexOf ���������� ã�°�
		System.out.println("=============");
		String data2 = "hong gil dong";
		System.out.println(data2.lastIndexOf("g")); // �տ��� 4��°���� �������� ã��
		System.out.println(data2.lastIndexOf("g",10));
		
		String name1 = "";
		String name2 = null;;
		
		System.out.println("===========");
		System.out.println(name1 == null);
		System.out.println(name2 == null);
		
		System.out.println("============");
		
		System.out.println(name1.isEmpty());
		//System.out.println(name2.isEmpty());
		
		String data3 = "hong gil dong";
		// System.out.println(data3.replace("g", "hello"));
		
		// String�� �׻� ���ο� �����͸� ����(����)�� ������ ���ο� �޸𸮸� ����
		// �׷��� �Ʒ� ����� ������� �ʰ� �׳� �״�� ����.
		System.out.println("============");
		data3.replace("g", "hello");
		System.out.println(data3);
		
		// trim ������ ������ �� ���
		String data4 = "     h                 ong     ";
		System.out.println("eee"+data4.trim()+"123"); 
		/* 
		*/
		
	}
}
