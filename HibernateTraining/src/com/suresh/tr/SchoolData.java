package com.suresh.tr;

public class SchoolData {

	public SchoolData() {

	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	private String school;
	private String contactnumber;

	private int studentId;

	public int getStudentId() {
		return studentId;
	}

	public SchoolData(String sch, String con) {
		this.school = sch;
		this.contactnumber = con;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private Student student;

}
