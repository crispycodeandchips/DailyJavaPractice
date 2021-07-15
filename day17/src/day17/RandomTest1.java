package day17;

import java.util.Random;

public class RandomTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random rnd=new Random();
       
       Random rnd2=new Random(System.currentTimeMillis());
       
       for(int i=0; i<30; i++)
    	   System.out.println(rnd2.nextInt(5));  // 1~4±îÁö.. 
 
       
         System.out.println("=========================");
         
         for(int i=0; i<100; i++)
        	 System.out.println(rnd2.nextInt(4)+1);
 
	}
}
