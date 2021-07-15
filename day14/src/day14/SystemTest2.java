package day14;

public class SystemTest2 {
	public static void main(String[] args) {
		
/* System.arraycopy(src, srcPos, dest, destPos, length); */
		
		
		
		/*
		 * int[] arr= {10,20,30,40,50}; int[] arr2=arr;
		 * 
		 * arr2[1]=100;
		 * 
		 * for(int item:arr) System.out.println(item);
		 * System.out.println("============");
		 * 
		 * for(int item:arr2) System.out.println(item);
		 * 
		 * System.out.println("==================");
		 */

		 int[] arr= {10,20,30,40,50,60,70};
		 
		 int[] arr2= {100,200,300,400,500,600};
		 
		 System.arraycopy(arr, 1, arr2, 2,5 );
		
         for(int item:arr) {
        	 System.out.println(item);
         }
         System.out.println("==============");
         
         
         for(int item:arr2)
        	 System.out.println(item);
         System.out.println("==================");
		
	}

}
