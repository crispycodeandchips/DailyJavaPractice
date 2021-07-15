package day05;

public class ArrTest {
public static void main(String[] args) {
	
	float[] arr = new float[3];
	
	for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]); //0.0f
	//double => 0.0 char =>
	
	char[] ch= new char[3];
	for(int i=0; i<ch.length; i++)
		System.out.println(ch[i]); //'\0' => ' '
}
}
