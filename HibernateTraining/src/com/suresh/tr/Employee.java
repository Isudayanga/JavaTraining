package com.suresh.tr;

public class Employee {
int empid;

AllocationData allocationData=new AllocationData();
public AllocationData getAllocationData() {
	return allocationData;
}
public void setAllocationData(AllocationData allocationData) {
	this.allocationData = allocationData;
}
String name;
String city;
int age;



public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
