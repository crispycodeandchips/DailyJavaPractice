package day14;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = Integer.parseInt(sc.nextLine());
		
		try {
			if(num<2)
				throw new IOException(); // �ϰ��� ���� 
			System.out.println(num);
		} catch(IOException e) { 
			System.out.println(e.toString()); // 'e' �ϴ� ���� toString() �޼ҵ带 ȣ����
		}finally {
			System.out.println("done");
		}
	}
}
