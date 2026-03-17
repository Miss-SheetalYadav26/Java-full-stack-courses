package project3.example.company.onetomore.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
private int Did;
private String Dname;
 @OneToMany(mappedBy="depatment")
private List<Employee> employee;
 public int getDid() {
	return Did;
 }
 public void setDid(int did) {
	Did = did;
 }
 public String getDname() {
	return Dname;
 }
 public void setDname(String dname) {
	Dname = dname;
 }
 public List<Employee> getEmployee() {
	return employee;
 }
 public void setEmployee(List<Employee> employee) {
	this.employee = employee;
 }
 
}
