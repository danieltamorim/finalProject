package service;
import entity.Department;
import java.util.List;

public interface departmentService {

	
	//Save
	Department saveDepartment(Department department);
	
	//Read
	List<Department> fetchDepartmentList();
	
	//update
	
	Department updateDepartment(Department department, Long departmentId);
	
	// Delete
	
	void deleteDepartmentById(Long departmentId);
}
