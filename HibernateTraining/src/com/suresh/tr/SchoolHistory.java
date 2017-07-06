package com.suresh.tr;

public class SchoolHistory {
	
	
	String schoolName;
	int lastGrade;
	
	Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	int studentId;
	
	
	public SchoolHistory() {
		
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getLastGrade() {
		return lastGrade;
	}
	public void setLastGrade(int lastGrade) {
		this.lastGrade = lastGrade;
	}
	public SchoolHistory(String schoolName, int lastGrade) {
		super();
		this.schoolName = schoolName;
		this.lastGrade = lastGrade;
	}
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lastGrade;
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchoolHistory other = (SchoolHistory) obj;
		if (lastGrade != other.lastGrade)
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}
}
