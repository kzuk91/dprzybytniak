package wat.edu.pl.pz.gui.back.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import wat.edu.pl.pz.gui.back.entity.PostalCode;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

public class PostalCodeDAO {
	
	EntityManager entityManager = EntityManagerService.getEntityManager();
	
	public PostalCode findByCode(String code){
		Query q = entityManager.createQuery("select p from PostalCode p where p.code=:cod", PostalCode.class);
		q.setParameter("cod", code);
		PostalCode postalCode = (PostalCode) q.getSingleResult();
		return postalCode;
	}
}
