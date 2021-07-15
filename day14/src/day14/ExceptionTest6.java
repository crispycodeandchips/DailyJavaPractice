package day14;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		
		try {
			if(num<2)
				throw new IOException(); // 일감을 던짐 
			System.out.println(num);
		} catch(IOException e) { 
			System.out.println(e.toString()); // 'e' 하는 순간 toString() 메소드를 호출함
		}finally {
			System.out.println("done");
		}
	}
}
