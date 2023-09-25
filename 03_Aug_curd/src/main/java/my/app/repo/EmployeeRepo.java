package my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import my.app.entity.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, String>
{
	

}
