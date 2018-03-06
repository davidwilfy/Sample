package demo.spring.boot.rest.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import demo.spring.boot.rest.jpa.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}