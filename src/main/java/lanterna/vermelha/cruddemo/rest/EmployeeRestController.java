package lanterna.vermelha.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lanterna.vermelha.cruddemo.dao.EmployeeDao;
import lanterna.vermelha.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeDao employeeDao;
	
	//temp shortcut: inject employee dao (service injection later)
	@Autowired
	public EmployeeRestController(EmployeeDao theEmployeeDao) {
		employeeDao = theEmployeeDao;
	}
	
	//expose "/employees" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDao.findAll();
	}
}
