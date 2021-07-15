package practice;

import java.util.ArrayList;

public class Student {

	int studentNum;
	String studentName;
	ArrayList<Subject> subjectList;
	
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	} 
	
	public void addScore(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		// addScore�� �Ҹ� ���� ���ο� ��ü�� ������
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStNum() {
		return studentNum;
	}
	
	public void setstudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public void showInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			total += subject.getScore();
			
			System.out.println(studentName + " �л��� " + subject.getSubjectName() + " ������ ������ " + subject.getScore() + " �� �Դϴ�.");
		}
		System.out.println(studentName + " �л��� ������ " + total + " �� �Դϴ�." );
	}
}
