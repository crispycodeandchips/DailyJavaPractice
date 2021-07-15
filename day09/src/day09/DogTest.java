package day09;

public class DogTest {
	public static void main(String[] args) {
		
		Dog[] ins = new Dog[5]; 
		//도그 객체를 5개 생성하여 배열에 추가한다
		// 를 그럼 string 값으로 받아서 배열에 추가 해야 될 것 같은데 모르겠다...?
		
		ins[0] = new Dog("하나", "시골개");
		ins[1] = new Dog("둘", "집개");
		ins[2] = new Dog("셋", "똥개");
		ins[3] = new Dog("넷", "도시개");
		ins[4] = new Dog("다섯", "들개");
		
		for (int i = 0; i < ins.length; i++) {
			System.out.println(ins[i]);
		}
	}
}
