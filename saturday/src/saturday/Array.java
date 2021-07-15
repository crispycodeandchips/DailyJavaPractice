package saturday;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	
	String[] name = new String[5];
			
//	name[0] = "hong";
//	name[1] = "park";
//	name[2] = "kim";
//	name[3] = "lee";
//	name[4] = "yoo";
		
	
//	//for(int i = 0; i<5; i++) {
//		
//		System.out.println(i.length);
//	}
	
	
	for (int i = 0; i<3; i++) {
		name[i] = sc.nextLine();
	}
	
	
	for (int j =0; j<3; j++) 
	System.out.println(name[j]);
	}
}