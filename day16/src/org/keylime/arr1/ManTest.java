package org.keylime.arr1;

/*
 *     입력   출력    삭제   수정
 *   CRUD( create:입력, read: 출력, Update : 수정, Delete:삭제)
 * 
 * 
 */

public class ManTest {
	public static void main(String[] args) {
		
		ManPro p1 = new ManPro();
		
		p1.addMan(new Man("a1", 20));
		p1.addMan(new Man("a2", 20));
		p1.addMan(new Man("a3", 20));
		p1.addMan(new Man("a4", 20));
		
		p1.printAll(); // 다 출력
		
		// a2, 30을 가지고 있는 모든 자료를 삭제
		p1.removeMan(new Man("a2",30));
		
		p1.printAll();
		
	    System.out.println("===================");
        p1.removeMan("a2"); 
        
        p1.printAll();
       
		
	}

}
