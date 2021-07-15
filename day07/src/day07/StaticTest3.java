package day07;

// 초기화...
// final

// 상수 : 변하지 않는 값
// final 변수

class Final1 {

	final int num = 20;
	final int num2; // 초기화
	final int[] num3;

	public Final1(int num2) // 생성자 : 객체 초기화 (인스턴스 변수 초기화)
	{						// 		객체 생성시 해야 할 일들을 기술
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
