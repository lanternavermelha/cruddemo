package lanterna.vermelha.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lanterna.vermelha.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//no code needed
}