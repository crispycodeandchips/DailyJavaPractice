package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8570852696767271120L;
	private String name;
	private transient int age;  // 직렬화는 처리안하는 인스턴스 변수 
	private String nick;
	
	private static int su;//클래스변수  직렬화를 못함!!
	public Person(String name, int age, int su) {
		this.name=name;
		this.age=age;
		this.su=su;
	}	
	public String toString() {
		return "name:"+name+", age:"+age+", su:"+su;
	}
}

public class ObjectWriteTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./d2.txt"));) {
          oos.writeObject(new Person("hong",20,100));  //직렬화 
        	System.out.println("파일쓰기 완료");
        }catch(IOException e) {
        	System.out.println(e);
        }
	}
}
