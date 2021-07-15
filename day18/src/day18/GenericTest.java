package day18;

class UseArrayList<T>
{
	private T[] data;
	private int age;
	int index=0;

	public UseArrayList(int initalsize) {
		 data=(T[]) new Object[initalsize];
		
		}
	 public   void add(T o) {
	         data[index]=o;
	         index++;
	 }
	 public  T  get(int i) {
		 
		 if(index<=i)
			 throw new ArrayIndexOutOfBoundsException();
		 return data[i];
	 }
}

public class GenericTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseArrayList<String> ins=new UseArrayList(10);
         ins.add("hong");
         //ins.add(10);
         ins.add("park");
         
        System.out.println(ins.get(0)); 
        System.out.println(ins.get(1)); 
        //System.out.println(ins.get(2)); 
	}

}
