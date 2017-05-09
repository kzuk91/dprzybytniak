package wat.edu.pl.pz.gui.back.dao;

import javax.persistence.EntityManager;

import wat.edu.pl.pz.gui.back.entity.Password;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

public class PasswordDAO {
	
	EntityManager entityManager = EntityManagerService.getEntityManager();

	public Password save(String pass) {
		Password passwordToSave = new Password();
		
		passwordToSave.setHashedPassword(pass);
		entityManager.getTransaction().begin();
		entityManager.persist(passwordToSave);
		entityManager.getTransaction().commit();
		return passwordToSave;
	}
	
	public void update(Password pass) {
		entityManager.getTransaction().begin();
		entityManager.merge(pass);
		entityManager.getTransaction().commit();
	}
}
