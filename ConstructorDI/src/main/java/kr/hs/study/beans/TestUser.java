package kr.hs.study.beans;

public class TestUser {
	
	private String school;
	private int grade;
	private Person user;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	public TestUser() {
		System.out.println("TestUser의 기본생성자");
	}
	
	public void PrintUser() {
		System.out.println(school + grade + user);
	}
	
	
}
