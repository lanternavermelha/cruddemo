package lanterna.vermelha.cruddemo.dao;

import java.util.List;

import lanterna.vermelha.cruddemo.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);

}
