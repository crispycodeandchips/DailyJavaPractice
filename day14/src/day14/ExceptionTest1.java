package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest1 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {
		System.out.println("숫자1");
		int num = Integer.parseInt(br.readLine());
		System.out.println("숫자2");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println(num/num2);
	}
	
}
}
