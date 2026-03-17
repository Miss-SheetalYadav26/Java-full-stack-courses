package project3.example.sheetal.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Student {
@Id
private int sid;
@OneToOne

private Course cors;
private String sname;
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
public Course getCors() {
	return cors;
}
public void setCors(Course cors) {
	this.cors = cors;
}

}
