package com.suresh.tr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

	private int studentId;
	List<SchoolHistory> schoolHistories;
	private String name;
	private int age;
	private SchoolData schoolData;



	public Student() {
		schoolData = new SchoolData();
		schoolHistories = new ArrayList<>();
		setSchoolData(schoolData);

	}

	public Student(int id, String name, int age, SchoolData schoolData2, SchoolHistory schoolHistory,
			Notification notification) {
		setAge(age);
		setStudentId(id);
		setName(name);
		schoolData = getSchoolData();
		setSchoolData(schoolData2);
		schoolHistories = new ArrayList<>();
		//schoolHistories =getSchoolHistories();
		schoolHistories.add(schoolHistory);
	}

	public void addSchoolHistory(SchoolHistory history) {
		history.setStudent(this);
		schoolHistories.add(history);

	}

	public List<SchoolHistory> getSchoolHistories() {
		return schoolHistories;
	}

	public void setSchoolHistories(List<SchoolHistory> schoolHistories) {
		this.schoolHistories = schoolHistories;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public SchoolData getSchoolData() {
		return schoolData;
	}

	public void setSchoolData(SchoolData schoolData) {
		this.schoolData = schoolData;
		schoolData.setStudent(this);
	}

}
