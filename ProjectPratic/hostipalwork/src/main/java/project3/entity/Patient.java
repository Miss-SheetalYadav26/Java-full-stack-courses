package project3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
@Id
private int pid;
private String pname;
private String pdoc;
private int age;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdoc() {
	return pdoc;
}
public void setPdoc(String pdoc) {
	this.pdoc = pdoc;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
