package controller;
import entity.Department;
import service.departmentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


//Annotation
@RestController

public class departmentController {

	@Autowired private departmentService departmentService;
	
	//save operation
	
	@PostMapping("/departments")
	public Department saveDepartment(
			@Validated @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}
	
	//Read operation
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList()
			
	{
		return departmentService.fetchDepartmentList();
	}
	
	// Update
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId)
			
	{
		return departmentService.updateDepartment(department, departmentId);
	}
	
	// Delete
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id")
	Long departmentId)
	{
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Sucessfully";
	}
}
