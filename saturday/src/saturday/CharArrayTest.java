package saturday;

public class CharArrayTest {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
			//System.out.println(alphabets[i]);
		}
		
		for (char bowl : alphabets) {
			System.out.println(bowl + "," + (int)bowl);
		}
	}

}
