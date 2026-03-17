package project3.example.sheetal.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
@Id
private int cid;
private String cname;
@OneToOne(mappedBy = "cors")
private Student student;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}

}
