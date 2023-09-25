package my.app.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.app.entity.Employee;
import my.app.repo.EmployeeRepo;

@Component
public class Operations {

	@Autowired
	EmployeeRepo repo;

	public void addEmployee(Employee e) {
		repo.save(e);

	}

	public void addMultiEmployees(List<Employee> list) {
		repo.saveAll(list);
	}

	public void updateEmployee(Employee e) {
		repo.save(e);
	}
	
	public void deleteEmployee(String i)
	{
		repo.deleteById(i);
	}
	
	public void deleteAllEmployees()
	{
		repo.deleteAll();
	}

}
