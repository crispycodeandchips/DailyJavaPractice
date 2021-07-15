package day17;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {10,20,30,40,50};
         int total;
         int su;
         for(int i=0; i<arr.length; i++)
         {
        	 su=arr[i];
         }
         
         
		/*
		 * for(int num:arr) total+=num; //num[0] num[1] num[2] num[3]....
		 * num[arr.length-1];
		 */
//          for(int i=0; i<arr.length; i++)
//        	   total+=arr[i];
         
        String[]  arr2= {"hong","lee","park"};
        
        for(String str:arr2)
        	System.out.println(str);
         
         System.out.println(total);
	}

}