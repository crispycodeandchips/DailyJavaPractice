package nest1;

class Student
{
	
	public class Man{   //��� Ŭ���� 
		public String name;
		public int age;
	}
	
	public String dept; // ������� 
	public  String hakno;
}



public class NestTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student s=new Student();
           s.dept="a1";
           System.out.println(s.dept);
         Student.Man ins=s.new Man();
         ins.name="ȫ�浿";
         System.out.println(ins.name);
            
	}
}
