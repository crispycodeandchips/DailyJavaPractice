package com.keylime.dto;

public class MemberDTO {
	private String hakno;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "MemberDTO [hakno=" + hakno + ", name=" + name + ", age=" + age + "]";
	}
	public MemberDTO(String hakno, String name, int age) {
		super();
		this.hakno = hakno;
		this.name = name;
		this.age = age;
	}
	public String getHakno() {
		return hakno;
	}
	public void setHakno(String hakno) {
		this.hakno = hakno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MemberDTO() {
		super();
	}

}
