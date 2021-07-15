package com.keylime.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserTable ins=new UserTable();
		
		while(true)
		{
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 전체보기");
			System.out.println("6. 종료");
		    
			System.out.println("기능선택?");
			String choice=sc.nextLine();
			
			
			switch (choice) {  // byte  short int char String enum
			case "1":   //35분까지...
				System.out.println("학번을 입력하세요 ");
				String hak=sc.nextLine();  //
				boolean result=ins.ischeck(hak); // 학번을 입력받아서  usertable에서 학번이 있는 check 
				if(result)
				{
					 System.out.println("기존 학번이 존재합니다");
				}else {
					System.out.println("이름을 입력하세요");
					String name=sc.nextLine();
					System.out.println("나이를 입력하세요");
					int age=Integer.parseInt(sc.nextLine());
					 //추가하는 기능
					//ins.insert(hak, name, age);
					 result=ins.insert(new StudentDTO(hak, name, age));
					 
					 
					if(result)
						System.out.println("입력성공");
					else
						System.out.println("입력실패 ");
					
				}
				break;
				
			case "2":
				System.out.println("수정할 학번은?");  //학번 이름 나이 
				String hakno=sc.nextLine();
				StudentDTO dto= ins.search(hakno);
				
				if(dto==null)
					System.out.println("수정할 학번이 없습니다.");
				else {
					 System.out.println("수정할 나이는");
					 int age=Integer.parseInt(sc.nextLine());
					 result=ins.modify(hakno, age);
					 if(result)
						 System.out.println("수정완료");
					 else
						 System.out.println("수정실패");
				}
				break;
			
			case "3":
				// 학번을 입력받아서  학번이 없으면 없다고 메세지 있으면 지움  delete 메서드 
				System.out.println("삭제할 학번은");
			    hakno=sc.nextLine();
				result=ins.delete(hakno);
				if(result)
					System.out.println("삭제 성공!!");
				else
					System.out.println("삭제 실패!!!");
				
			    break;
			case "4":
				 //조회   출력
				System.out.println("조회할 학번을 입력하세요");
				 hakno=sc.nextLine();
				 dto=ins.search(hakno);
				  if(dto==null)
					  System.out.println("조회한 자료가 없습니다.");
				  else {
					  System.out.println("번호 :"+dto.getHakno());
					  System.out.println("이름 :"+dto.getName());
					  System.out.println("나이 :"+dto.getAge());
				  }
				
				break;
			case "5":
				  //전체보기 
				// 출력
				HashMap<String, StudentDTO> list=ins.list(); 
				 Iterator<String> ita=list.keySet().iterator();
				 System.out.println("번호    \t  이름\t        나이 ");
				 while(ita.hasNext())
				 {
					String key= ita.next();
					 dto=list.get(key);
					 System.out.printf("%s \t  %s\t %d\n", dto.getHakno(), dto.getName(), dto.getAge());
				 }
				
				break;
			case "6":
			       System.out.println("프로그램을 종료합니다.");
	               System.exit(0);
				break;
				
			default: 
				System.out.println("코드를 잘못 입력하셨습니다.");
				break;
			}
			
			
		}

	}

}
