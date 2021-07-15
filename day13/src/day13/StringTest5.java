package day13;

public class StringTest5 {
	public static void main(String[] args) {
		String name = "abc";
		System.out.println(name.compareToIgnoreCase("ABC"));
		
		name = name.concat("1111");
		System.out.println(name);
		
		boolean result = name.contains("11");
		System.out.println(result);
		
		// endsWith, startsWith
		System.out.println("=============");
		String data = "hong gil dong";
		System.out.println(data.endsWith("ng")); //~로 끝나냐
		System.out.println(data.endsWith("on"));
		System.out.println(data.startsWith("ho")); // ~로 시작하냐
		System.out.println(data.startsWith("e"));
		
		// index of
		System.out.println(data.indexOf("g")); // 3번째 // ex) ga -1 : 못찾음
		System.out.println(data.indexOf("g",7)); // 7번째부터 g를 찾음(공백포함)
		
		// lastIndexOf 끝에서부터 찾는것
		System.out.println("=============");
		String data2 = "hong gil dong";
		System.out.println(data2.lastIndexOf("g")); // 앞에서 4번째부터 역순으로 찾음
		System.out.println(data2.lastIndexOf("g",10));
		
		String name1 = "";
		String name2 = null;;
		
		System.out.println("===========");
		System.out.println(name1 == null);
		System.out.println(name2 == null);
		
		System.out.println("============");
		
		System.out.println(name1.isEmpty());
		//System.out.println(name2.isEmpty());
		
		String data3 = "hong gil dong";
		// System.out.println(data3.replace("g", "hello"));
		
		// String은 항상 새로운 데이터를 저장(조작)할 때마다 새로운 메모리를 만듦
		// 그래서 아래 결과는 변경되지 않고 그냥 그대로 나옴.
		System.out.println("============");
		data3.replace("g", "hello");
		System.out.println(data3);
		
		// trim 공백을 제거할 때 사용
		String data4 = "     h                 ong     ";
		System.out.println("eee"+data4.trim()+"123"); 
		/* 
		*/
		
	}
}
