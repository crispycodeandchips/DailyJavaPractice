package day13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 *  �ֹι�ȣ�� �Է��Ͽ� 
 *   900101-1010111
 *   1990�⵵ 01�� 01�� 
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
		gender="����";
	else
		gender="����";
	// 2021
	
	GregorianCalendar calendar=new GregorianCalendar();
	int nowyear=calendar.get(Calendar.YEAR);
	int age=nowyear-Integer.parseInt(year);
	
	System.out.println("�̸� :"+name);
	System.out.println("�ֹι�ȣ :"+jumin);
	System.out.println("�������:"+year+"�⵵"+ m+"��"+d+"��");
	System.out.println("���� :"+gender);
	System.out.println("����:"+age);
	
	}
}
