package wat.edu.pl.pz.gui.back.dao;

import wat.edu.pl.pz.gui.back.entity.Address;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

import javax.persistence.EntityManager;

public class AddressDAO {

	EntityManager entityManager = EntityManagerService.getEntityManager();
	
	public Address save(Address address) {
		Address addressToSave = new Address();
		addressToSave.setCity(address.getCity());
		addressToSave.setHouseNumber(address.getHouseNumber());
		addressToSave.setLocalNumber(address.getLocalNumber());
		addressToSave.setStreet(address.getStreet());
		addressToSave.setPostCode(address.getPostCode());
		entityManager.getTransaction().begin();
		entityManager.persist(addressToSave);
		entityManager.getTransaction().commit();
		return addressToSave;
	}
}
