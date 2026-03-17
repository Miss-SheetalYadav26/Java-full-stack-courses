package com.example.demo.controlar;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Department;
import com.example.demo.Entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
//import com.example.demo.EmployeeRepository;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class EmployeeDAO 
{
@Autowired
SessionFactory factory;
EmployeeDAO dao;
	
// get data of all employee
	public List<Employee> getEmployees() 
{
	Session session= factory.openSession();
	HibernateCriteriaBuilder cb=session.getCriteriaBuilder();
	CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
	Root<Employee> root=cq.from(Employee.class);
	cq.select(root);
	List<Employee> list=session.createQuery(cq).getResultList();
	return list;
}

// get data of all department
	public List<Department> getDepartment() 
{
	Session session= factory.openSession();
	HibernateCriteriaBuilder cb=session.getCriteriaBuilder();
	CriteriaQuery<Department> cq=cb.createQuery(Department.class);
	Root<Department> root=cq.from(Department.class);
	cq.select(root);
	List<Department> list=session.createQuery(cq).getResultList();
	return list;
}
	
	// get employee by id
	public Employee  getEmployeesById(int id) 
{
	 System.out.println("METHOD CALLED");
	 Session session = factory.openSession();
	 Employee employee = session.get(Employee.class, id);
	 if (employee == null) 
{
	 throw new RuntimeException("employee not found with id " + id);
}
	 session.close();
	 return employee;
}
	
	// get Department by id
	public Department  getDepartmentById(int id) 
{
	System.out.println("METHOD CALLED");
	Session session = factory.openSession();
	Department department = session.get(Department.class, id);
	if (department == null) 
{
	throw new RuntimeException("Department not found with id " + id);
}
	session.close();
	    return department;
} 
	
	// get  all employee name
	public List<String> getallEmployeesname() 
{
	Session session=factory.openSession();
	CriteriaBuilder cb=session.getCriteriaBuilder();
	CriteriaQuery<String> cq=cb.createQuery(String.class);
	Root<Employee> root=cq.from(Employee.class);
	cq.select(root.get("empName"));
	List<String> names=session.createQuery(cq).getResultList();
	session.close();
	return names ;
}
	
	
	// get all Department name
	public List<String> getallDepartmentname() 
{
	Session session=factory.openSession();
	CriteriaBuilder cb=session.getCriteriaBuilder();
	CriteriaQuery<String> cq=cb.createQuery(String.class);
	Root<Department> root=cq.from(Department.class);
	cq.select(root.get("deptName"));
	List<String> names=session.createQuery(cq).getResultList();
	session.close();
	return names ;
}

	// get particular employee by name
	public Employee getpatiEmployeename(String name) 
{
	System.out.println("METHOD CALLED");
	Session session = factory.openSession();
	Employee employee = session.createQuery(
	           "FROM Employee e WHERE e.empName = :name", Employee.class)
	            .setParameter("name", name)
	            .uniqueResult();
	session.close();
	if (employee == null) 
{
	throw new RuntimeException("Employee not found with name: " + name);
	        
}
	return employee;
}
	
	// get particular Department by name
	public Department getpatiDepartmentname(String name) 
{
	System.out.println("METHOD CALLED");
	Session session = factory.openSession();
	Department department = session.createQuery(
	            "FROM Department e WHERE e.deptName = :name", Department.class)
	            .setParameter("name", name)
	            .uniqueResult();
	session.close();
	if (department == null)
{
	throw new RuntimeException("Department not found with name: " + name);
}
	    return department;	
}
	
	// get employee by salary
	public Employee getEmployeesBysalary(double salary) 
{

	System.out.println("METHOD CALLED");
	Session session = factory.openSession();

	String hql = "FROM Employee e WHERE e.salary = :salary";
	Employee employee = session.createQuery(hql, Employee.class)
	                               .setParameter("salary", salary)
	                               .uniqueResult();
	if (employee == null) 
{
	throw new RuntimeException("employee not found with salary " + salary);
}
	session.close();
	return employee;
}

	
	// post  add record in Employee
	public void postaddEmployee(Employee employee) 
{
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.persist(employee);
	tx.commit();
	session.close();
		
}
	
	
	// post add to  Department 
	public void postaddDepartment(Department department) {
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.persist(department);
	tx.commit();
	session.close();
	}
	 
	 // put update record in Employee
	 
	public Employee updatetoEmployee( int id,Employee employee) 
{
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Employee existingEmployee=session.get(Employee.class,id);
	if (existingEmployee==null) 
{
	throw new RuntimeException("value is not there"+id);
}
	existingEmployee.setEmpName(employee.getEmpName());
	existingEmployee.setSalary(employee.getSalary());
	//existingEmployee.setDepartment(employee.getDepartment());
	session.persist(existingEmployee);
	tx.commit();
			 
	return existingEmployee;
				
}
	
		// put update record in Department
		 
	public Department updatetoDepartment( int id,Department department) 
{
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Department existingDepartment=session.get(Department.class,id);
	if (existingDepartment==null) 
{
	throw new RuntimeException("value is not there"+id);
}
	existingDepartment.setDeptName(department.getDeptName());
	//existingEmployee.setDepartment(employee.getDepartment());
	session.persist(existingDepartment);
	tx.commit();
	return existingDepartment;
				
}
		 
		// Delete record in Employee 
	 
	public void deleteEmployee(int id) 
{
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Employee existingEmployee=session.get(Employee.class,id);
	if (existingEmployee==null) 
{
	throw new RuntimeException("value is not there"+id);
} 
	session.remove(existingEmployee);
	tx.commit();
			} 
	 
	// Delete record in Department 
		 
	public void deleteDepartment(int id) 
{
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Department existingDepartment=session.get(Department.class,id);
	if (existingDepartment==null) 
{
	throw new RuntimeException("value is not there"+id);
} 
	session.remove(existingDepartment);
	tx.commit();
}  
		
}



