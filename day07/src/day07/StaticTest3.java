package day07;

// �ʱ�ȭ...
// final

// ��� : ������ �ʴ� ��
// final ����

class Final1 {

	final int num = 20;
	final int num2; // �ʱ�ȭ
	final int[] num3;

	public Final1(int num2) // ������ : ��ü �ʱ�ȭ (�ν��Ͻ� ���� �ʱ�ȭ)
	{						// 		��ü ������ �ؾ� �� �ϵ��� ���
		this.num2 = num2;

		num3 = new int[4];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = i * 20;
		}
	}
}

public class StaticTest3 {

	public static void main(String[] args) {

//		final int num = 20;
//		num = 100;
//		
//		System.out.println(num);

//		final int num;
//		num = 100;
//		//num += 200;
//		System.out.println(num);

		Final1 ins = new Final1(100);
		System.out.println(ins.num);
		System.out.println(ins.num2);

		ins.num += 100;
		ins.num2 += 300;

	}
}
