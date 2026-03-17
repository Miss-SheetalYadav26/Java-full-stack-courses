package com.example.demo.controlar;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Department;
import com.example.demo.Entity.Employee;


@RestController
@RequestMapping
	public class EmployeeController 
{
    @Autowired
   EmployeeService employeeService;
    // get data of employee
   @GetMapping("getEmployee")
   public List<Employee> getEmployees()
{
	return employeeService.getEmployees();
}
    
   // get data of department
    
    @GetMapping("getDepartment")
    public List<Department> getDepartment()
{
   	return employeeService.getDepartment();
}
    
    // get employee by id
    
    @GetMapping("getEmployeesById/{id}")
    public Employee getEmployeesById(@PathVariable int id)
{
    	Employee	e=employeeService.getEmployeesById(id);
	return e;
		
}
    
    // get Department by id  
   
    @GetMapping("getDepartmentById/{id}")
    public Department getDepartmentById(@PathVariable int id)
{
    Department	d=employeeService.getDepartmentById(id);
	return d;
}
    	
 // get all Department name
    @GetMapping("getallEmployeesname")
    public List<String> getallEmployeesname()
{
	return employeeService.getallEmployeesname();
}
    
 // get all employee name
    @GetMapping("getallDepartmentname")
    public List<String> getallDepartmentname()
{
	return employeeService.getallDepartmentname();
}
    
 // get particular employee by name
    @GetMapping("getpatiEmployeename/{name}")
    public Employee getpatiEmployeename(@PathVariable String name)
{
    	Employee	e=employeeService.getpatiEmployeename(name);
	return e;
		
}
   
 // get particular Department by name
    @GetMapping("getpaticuDepartmentname/{name}")
    public Department getpatiDepartmentname(@PathVariable String name) 
{
    	Department	d=employeeService.getpatiDepartmentname(name);
    	return d;
    	
}
// get employee by salary
    
    @GetMapping("getEmployeesBysalary/{salary}")
    public Employee getEmployeesBysalary(@PathVariable double salary)
{
    	Employee	e=employeeService.getEmployeesBysalary(salary);
	return e;
		
}
    
    
    
    
// post record in Employee
	
    @PostMapping("postaddEmployee")
    public Employee postaddEmployee(@RequestBody Employee employee) 
{
    	employeeService.postaddEmployee(employee);
    	return employee;

}
    
    
 // post record in Department
	
    @PostMapping("postaddDepartment")
    public Department postaddDepartment(@RequestBody Department department) 
{
    	employeeService.postaddDepartment(department);
    	return department;

}
 // put update record in Employee
    @PutMapping("updatetoEmployee/{id}")
    public Employee updatetoEmployee(@PathVariable int id, @RequestBody Employee employee )
{
    	employeeService.updatetoEmployee(id,employee);
    	return employee;
    	
}
    
 // put update record in Department
    @PutMapping("updatetoDepartment/{id}")
    public void updatetoDepartment(@PathVariable int id,@RequestBody Department department) 
{
    	employeeService.updatetoDepartment(id, department);
}   
 
    // Delete record in Employee 
    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id )
{
    	employeeService.deleteEmployee(id);
    	return "Employee deletd succceefull";
    	
}
    
 // Delete record in Department 
    @DeleteMapping("deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable int id )
{
    	employeeService.deleteDepartment(id);
    	return "Department deletd succceefull";
    	
}

    
}
