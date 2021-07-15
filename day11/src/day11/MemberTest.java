package day11;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberPro pro = new MemberPro();
		for(int i=0; i<10; i++)
		{
			
			System.out.println("input name");
			String name = sc.nextLine();
			System.out.println("input kor");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.println("input eng");
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.println("계속 입력?");
			int yn = Integer.parseInt(sc.nextLine());
			if(yn==0)
				break;
//			else if(yn==1)
//				continue;
//			else
//				System.out.println("문자를 잘못 입력했습니다.");
			
		}
		
		  //정렬
        pro.descSort();
           
     //출력 
        pro.prt();
        
	}
}
