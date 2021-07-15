package day04;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(scanner.nextLine());
				
		int def = 1; 
		int sum = 0;
		
		for(int i=1; i<=num; i++ ) {
			
			if(i%2==1) {
				
				sum += def;
				System.out.print(def + " ");
				
				
			} //if
			
			else {
				
				def += sum;
				System.out.print(sum + " ");
				
				
			} //else
			
		} // for
	}

}
