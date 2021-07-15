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
		
		// arr 배열을 출력하는 메서드 구현
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
			for (int index:arr)
				System.out.println(index);
		
	}
	}

public class ArrTest2 {
	public static void main(String[] args) {
		// 결과 hello란 문자열이 나오도록 view를 호출하시오.
		
		Arr2 ins = new Arr2();
//		String content = "hello";
//		ins.view(content);
		
		
		// view2 메서드 호출해서 홍길동 20을 출력하라.
//		ins.view2("hong",20);
		
		// view3 메서드 호출 => 10, 30, 50을 출력하라.
		System.out.println("======");
//		int[] arr = {10,30,50};
//		ins.view3(arr);
		ins.view3(new int[] {10,30,50});
	}

}
