package day10;

public class SuperSubTest1 {
	public static void main(String[] args) {
		
	//	Super1 ins = new Sub1();
//		
//		Super1 ins = new Sub1();
//		
//		ins.prt();
//		ins.view(); // 메서드는 Sub1에서 못 만들지만 그림상 sub1이 Super1을 덮고 있으므로 Sub1의 view를 봄.
		//ins.draw(); // -> ins는 Super1을 가르키므로 sub1클래스에 들어있는 draw 메서드는 사용불가.
		
		//Sub1 ins2 = (Sub1)new Super1(); // 강제캐스팅
		// ClasCastException // 자식은 부모를 낳을 수 없다. 원숭이 -> 사람 (x)
		// 부모한테 받은 재산으로 자산을 확장한 정상적인 자식을 생각할 것. (자식 영역이 더 큼)
		// 클래스 변환 오류
		
//		Super1 ins3 = new Sub1();
//		Sub1 ins4 = (Sub1)ins3;
//		
//		ins4.view(); // sub1
//		ins4.prt(); // Super1.prt
//		ins4.draw(); // Sub1.draw
		
//		Super1 ins = new Sub1(); // Super1에서 Sub1으로 형변환이 가능하다
//		Sub1 ins2 = (Sub1)ins;
		
		Super1 obj1 = new Sub1();
	//	Sub1 obj2 = (Sub1)obj1;
		
		if (obj1 instanceof Sub1) {
			
			Sub1 obj2 = (Sub1) obj1;
			
		}
		
		Super1 ins2 = new Super1();
		if (ins2 instanceof Sub1) {
			Sub1 ins3 = (Sub1) ins2;
			
		}else {
			System.out.println("형변환이 안됩니다.");
		}
		
	}
}
