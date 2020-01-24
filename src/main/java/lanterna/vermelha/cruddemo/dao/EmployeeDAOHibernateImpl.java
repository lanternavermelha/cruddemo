package lanterna.vermelha.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lanterna.vermelha.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDao {

	//define field for entitymanager
	
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create a query
		Query<Employee> theQuery =
				currentSession.createQuery("from EMployee",Employee.class);
		
		//execute query and get the result list
		List<Employee> employees = theQuery.getResultList();
		
		//return the results
		return employees;
	}

}
