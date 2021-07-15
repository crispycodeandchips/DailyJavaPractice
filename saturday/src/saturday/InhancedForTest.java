package saturday;

public class InhancedForTest {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		for (int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}
}
