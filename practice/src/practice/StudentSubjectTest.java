package practice;

public class StudentSubjectTest {
	public static void main(String[] args) {
		
		Student lee = new Student(1001, "이똘똘");
		Student kim = new Student(1002, "김마리");
		
		lee.addScore("Math", 0);
		lee.addScore("English", 90);
		lee.addScore("Science", 20);
		lee.addScore("History", 98);
		
		kim.addScore("Math", 80);
		kim.addScore("Korean", 80);
		
		lee.showInfo();
		kim.showInfo();
	}

}

//
//걱정된다 진짜 이거 소리 100% 다 들려 안 들릴 수가 없어
//...... 노트북 가지고 와서 들리냐고 밖에서 시험해보고 그러고 끊었어야 하나봐
//소리 장난없이 들려... 완충패드 들고와도 별반 다르지 않을 것 같은 느낌.
//이 정도면 다 들리는데 안 들릴 수가 없는데... 하아아...
//나도 눈치 안보고 쓰고 싶어 돌아버리겠네 존나 눈치 보여서 하......
//시끄러울듯 완전 와다다와다다와다다...
//안들릴수가 없어 이거 100% 들려... 하......
//
////왠지 코딩하면 소리 졸라 날 것 같은 느낌인데 맞네 하... 고민된다 
////내가 더 신경쓰여 여기서 소리가 울려서
////막 소리가 울려 그냥 커피랑 도서관 가야하나 올리고 써도 소음이 없진 않은듯
////키보드 커버 가져올까 했는데 가져와도 뭐... 다 들리는거 아냐??? 무서운데 