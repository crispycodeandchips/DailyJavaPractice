package day06;

class Arr2
{
	public void view(String name) {
	
		System.out.println(name);
	}
	
	public void view2(String name, int age) {
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public void view3(int[] arr) {
		
		// arr �迭�� ����ϴ� �޼��� ����
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
			for (int index:arr)
				System.out.println(index);
		
	}
	}

public class ArrTest2 {
	public static void main(String[] args) {
		// ��� hello�� ���ڿ��� �������� view�� ȣ���Ͻÿ�.
		
		Arr2 ins = new Arr2();
//		String content = "hello";
//		ins.view(content);
		
		
		// view2 �޼��� ȣ���ؼ� ȫ�浿 20�� ����϶�.
//		ins.view2("hong",20);
		
		// view3 �޼��� ȣ�� => 10, 30, 50�� ����϶�.
		System.out.println("======");
//		int[] arr = {10,30,50};
//		ins.view3(arr);
		ins.view3(new int[] {10,30,50});
	}

}
