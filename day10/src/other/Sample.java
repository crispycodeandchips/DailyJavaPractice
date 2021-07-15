package other;

public class Sample {
	
	private int [] arr;
	public void calDouble(int[] arr) {
		this.arr=arr;
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
		{
			//arr[i]=arr[i]*2;
			this.arr[i]*=2;
			
		}		
		
	}
	public int[]   getArr() {
		return arr;
	}
	

	public void prt(int[] arr) {
		// TODO Auto-generated method stub
		  for( int index  :arr)
			  System.out.println(index);
		  System.out.println("=======");
		  
		  for(int i=0; i<arr.length ;i++)
		      System.out.println(arr[i]);
	
	}
}
