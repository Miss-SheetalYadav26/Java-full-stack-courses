package project3.example.company.onetomore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
@Id
private int eid;
private String eanme;
@ManyToOne
private Department depatment;

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEanme() {
	return eanme;
}
public void setEanme(String eanme) {
	this.eanme = eanme;
}
public Department getDepatment() {
	return depatment;
}
public void setDepatment(Department depatment) {
	this.depatment = depatment;
}

}
