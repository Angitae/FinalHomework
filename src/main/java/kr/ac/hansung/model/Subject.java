package kr.ac.hansung.model;

public class Subject {
	
	private int year;
	private int semester;
	private String subjectcode;
	private String subjectname;
	private String division;
	private int grade;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getdivision() {
		return division; 	
	}
	public void setdivision(String division) {
		this.division = division;
	}
	public int getgrade() {
		return grade;
	}
	public void setgrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return  year +"년 " +  semester + "학기 " +", 교과목명="
				+ subjectname;
	}

}
