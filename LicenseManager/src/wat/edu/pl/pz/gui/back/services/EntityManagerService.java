package wat.edu.pl.pz.gui.back.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerService {
	public static EntityManagerFactory entityManagerFactory;
	public static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		if (entityManagerFactory == null) entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		return entityManager = entityManagerFactory.createEntityManager();
	}

}
