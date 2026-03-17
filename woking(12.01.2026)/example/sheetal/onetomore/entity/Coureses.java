package project3.example.sheetal.onetomore.entity ;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Coureses {
@Id
private int couid;
private String couname;
@OneToMany(mappedBy = "cours")
private List<Students> student;

public int getCouid() {
	return couid;
}

public void setCouid(int couid) {
	this.couid = couid;
}

public String getCouname() {
	return couname;
}

public void setCouname(String couname) {
	this.couname = couname;
}

public List<Students> getStudent() {
	return student;
}

public void setStudent(List<Students> student) {
	this.student = student;
}

// getter setter
}
