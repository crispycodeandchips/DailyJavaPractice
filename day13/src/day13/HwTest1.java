package day13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 *  주민번호를 입력하여 
 *   900101-1010111
 *   1990년도 01월 01일 
 * 
 * 
 */

public class HwTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("input name");
	String name=sc.nextLine();
	System.out.println();//9001011010111
	System.out.println("input juminNo");
	String jumin=sc.nextLine();
	
	String y=jumin.substring(0,2);
	String m=jumin.substring(2,4);
	String d=jumin.substring(4,6);
	String g=jumin.substring(7,8); 
	String year="";
	String gender="";
	if(g.equals("1") || g.equals("2"))
		 year="19"+y;
	else
		year="20"+y;
	
	if(g.equals("1")|| g.equals("3"))
		gender="남자";
	else
		gender="여자";
	// 2021
	
	GregorianCalendar calendar=new GregorianCalendar();
	int nowyear=calendar.get(Calendar.YEAR);
	int age=nowyear-Integer.parseInt(year);
	
	System.out.println("이름 :"+name);
	System.out.println("주민번호 :"+jumin);
	System.out.println("생년월일:"+year+"년도"+ m+"월"+d+"일");
	System.out.println("성별 :"+gender);
	System.out.println("나이:"+age);
	
	}
}
