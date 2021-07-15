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
		// addScore가 불릴 때만 새로운 객체가 생성됨
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
			
			System.out.println(studentName + " 학생의 " + subject.getSubjectName() + " 과목의 성적은 " + subject.getScore() + " 점 입니다.");
		}
		System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다." );
	}
}
