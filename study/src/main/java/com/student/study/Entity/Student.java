package com.student.study.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
private String sname;
private String gender;
private int age;
private String std;
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", age=" + age + ", std=" + std + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getStd() {
	return std;
}
public void setStd(String std) {
	this.std = std;
}

}
