package company.mirko.demoTodoList.repository;

import company.mirko.demoTodoList.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {



}
