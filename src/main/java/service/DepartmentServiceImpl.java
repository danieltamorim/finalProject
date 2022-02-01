package service;
import entity.Department;
import repository.DepartmentRepository;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Annotation
@Service

public class DepartmentServiceImpl implements departmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	//save
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	//read
	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<Department>)departmentRepository.findAll();
	}
	//update
	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		Department depDB = departmentRepository.findById(departmentId).get();
		
		if (Objects.nonNull(
				department.getDepartmentName())
				&& !"".equalsIgnoreCase(
						department.getDepartmentName())) {
			depDB.setDepartmentName(
					department.getDepartmentName());
		}
		
		if (Objects.nonNull(
				department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(
						department.getDepartmentAddress())) {
			depDB.setDepartmentName(
					department.getDepartmentAddress());
		}
		

		if (Objects.nonNull(
				department.getDepartmentCode())
				&& !"".equalsIgnoreCase(
						department.getDepartmentCode())) {
			depDB.setDepartmentName(
					department.getDepartmentCode());
		}
		return departmentRepository.save(depDB);
	}
	//delete
	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
		
	}

}
