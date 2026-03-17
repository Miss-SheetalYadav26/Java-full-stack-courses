package com.example.demo.controlar;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.Department;
//import com.example.demo.DAO.EmployeeDAO;
import com.example.demo.Entity.Employee;

@Service
	public class EmployeeService 
{

   @Autowired
   private EmployeeDAO dao;
   // get data of employee
   public List<Employee> getEmployees()
{
	return dao.getEmployees();
}
   // get data of department
	public List<Department> getDepartment() 
{
	return dao.getDepartment();
}
   
// get employee by id
    public Employee getEmployeesById(int id) 
{
	return dao.getEmployeesById(id);
}
   
// get Department by id   
   public Department getDepartmentById(int id) 
{
	return dao.getDepartmentById(id);
}
 
 // get all employee name
	public List<String> getallEmployeesname()
{
	return dao.getallEmployeesname();
}  
   
 // get all Department name
	public List<String> getallDepartmentname()
{
	return dao.getallDepartmentname();
}   
   
// get particular employee by name
  public Employee getpatiEmployeename(String name) 
{
	return dao.getpatiEmployeename(name);
}
   
 // get particular Department by name
  public Department getpatiDepartmentname(String name) 
{
	return dao.getpatiDepartmentname(name);
}
 
	// get employee by salary
  public Employee getEmployeesBysalary(double salary) 
{
	return dao.getEmployeesBysalary(salary);
}
  
  
  // post record in Employee
	public void postaddEmployee(Employee employee) 
{
	dao.postaddEmployee(employee);
		
}
      
 // post to  Department 
	public void postaddDepartment(Department department) 
{
	dao.postaddDepartment(department);
}
   
   // put update record in Employee
	public void updatetoEmployee(int id, Employee employee) 
{
	dao.updatetoEmployee(id, employee);
}
   
   
   // put update record in Department
	public void updatetoDepartment(int id, Department department) 
{
	dao.updatetoDepartment(id, department);
}
   
// Delete record in Employee 
	public void deleteEmployee(int id) 
{
   	dao.deleteEmployee(id);	
}

// Delete record in Department 
	public void deleteDepartment(int id)
{
   	dao.deleteDepartment(id);	
}

}
