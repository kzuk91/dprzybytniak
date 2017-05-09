package wat.edu.pl.pz.gui.back.dao;

import wat.edu.pl.pz.gui.back.entity.Provider;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ProviderDAO {

	EntityManager entityManager = EntityManagerService.getEntityManager();

	public Provider findByProviderId(Long id) {
		Query q = entityManager.createQuery("select i from Provider i where i.providerIdentificationNumber=:coid",
				Provider.class);
		q.setParameter("coid", id);
		Provider provider = (Provider) q.getSingleResult();
		return provider;
	}

	public List<Provider> findAllProvider() {
		Query q = entityManager.createQuery("select i from Provider i", Provider.class);
		List<Provider> providerList = (ArrayList<Provider>) q.getResultList();
		return providerList;
	}

	@SuppressWarnings("JpaQlInspection")
	public List<Provider> findLikeProviderId(Long id) {
		Query q = entityManager.createQuery("select i from Provider i where i.providerIdentificationNumber LIKE :coid",
				Provider.class);
		q.setParameter("coid", "%" + id + "%");
		List<Provider> providerList = (ArrayList<Provider>) q.getResultList();
		return providerList;
	}

	public Provider save(Provider provider) {
		Provider providerToSave = new Provider();
		providerToSave.setName(provider.getName());
		entityManager.getTransaction().begin();
		entityManager.persist(providerToSave);
		entityManager.getTransaction().commit();
		return providerToSave;
	}
}
