package project3.example.sheetal.onetomore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
@Id
private int childid;
private String childname;
@ManyToOne
//courses object
private Coureses cours;
public int getChildid() {
	return childid;
}
public void setChildid(int childid) {
	this.childid = childid;
}
public String getChildname() {
	return childname;
}
public void setChildname(String childname) {
	this.childname = childname;
}
public Coureses getCours() {
	return cours;
}
public void setCours(Coureses cours) {
	this.cours = cours;
}

	
}
