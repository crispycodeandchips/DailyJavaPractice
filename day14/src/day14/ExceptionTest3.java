package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Runtime�� �ƴ� Exception : checked Exception

public class ExceptionTest3 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input name");
		try {
		String name = br.readLine();
		} catch (IOException e) {
			System.out.println("���� ó��");
		}
				
	}
}
