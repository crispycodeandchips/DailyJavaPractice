package day15;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<String> s=new Stack<String>();
       
       s.push("hello1");
       s.push("hello2");
       s.push("hello3");

         String name=s.pop();
         System.out.println(name);
         System.out.println(s.pop());
         
         System.out.println(s.peek());
         System.out.println(s.peek());
       //  System.out.println(s.pop());
       //  System.out.println(s.pop());   
         
	}

}
