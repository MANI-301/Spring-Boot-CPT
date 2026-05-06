package session_1;

import java.util.List;

public class Instructor {

	private String name;
	private int yearsOfExp;
	private  String title;
	private String gender;
	private boolean onlineCourse;
	private List<String> courses;
	
	public Instructor() {}
	public Instructor(String name, int yearsOfExp, String title, String gender, boolean onlineCourse,
			List<String> courses) {
		super();
		this.name = name;
		this.yearsOfExp = yearsOfExp;
		this.title = title;
		this.gender = gender;
		this.onlineCourse = onlineCourse;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isOnlineCourse() {
		return onlineCourse;
	}
	public void setOnlineCourse(boolean onlineCourse) {
		this.onlineCourse = onlineCourse;
	}
	public List<String> getCourse() {
		return courses;
	}
	public void setCourse(List<String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yearsOfExp=" + yearsOfExp + ", title=" + title + ", gender=" + gender
				+ ", onlineCourse=" + onlineCourse + ", courses=" + courses + "]";
	}
	
	
	
}
