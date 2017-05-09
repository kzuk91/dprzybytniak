package wat.edu.pl.pz.gui.back.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import wat.edu.pl.pz.gui.back.entity.Role;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

public class RoleDAO {

	EntityManager entityManager = EntityManagerService.getEntityManager();
	
	public Role findByName(String name) {
		Query q = entityManager.createQuery(
				"select r from Role r where r.name=:nam", Role.class);
		q.setParameter("nam", name);
		Role user = (Role) q.getSingleResult();
		return user;
	}
}
