package wat.edu.pl.pz.gui.back.dao;

import javax.persistence.EntityManager;

import wat.edu.pl.pz.gui.back.entity.Employee;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

public class EmployeeDAO {
	
	EntityManager entityManager = EntityManagerService.getEntityManager();
	
	public Employee save(Employee employee) {
		Employee employeeToSave = new Employee();
		employeeToSave.setIdentificationNumber(employee.getIdentificationNumber());
		employeeToSave.setName(employee.getName());
		employeeToSave.setSurname(employee.getSurname());
		employeeToSave.setAddress(employee.getAddress());
		entityManager.getTransaction().begin();
		entityManager.persist(employeeToSave);
		entityManager.getTransaction().commit();
		return employeeToSave;
	}

}
