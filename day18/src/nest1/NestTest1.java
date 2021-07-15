package nest1;

class Student
{
	
	public class Man{   //¸â¹ö Å¬·¡½º 
		public String name;
		public int age;
	}
	
	public String dept; // ¸â¹öº¯¼ö 
	public  String hakno;
}



public class NestTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student s=new Student();
           s.dept="a1";
           System.out.println(s.dept);
         Student.Man ins=s.new Man();
         ins.name="È«±æµ¿";
         System.out.println(ins.name);
            
	}
}
