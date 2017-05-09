package wat.edu.pl.pz.gui.back.dao;

import wat.edu.pl.pz.gui.back.entity.License;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class LicenseDAO {

	EntityManager entityManager = EntityManagerService.getEntityManager();
	
	public License findByNumber(String number){
		Query q = entityManager.createQuery("select n from License n where n.licenseNumber=:num", License.class);
		q.setParameter("num", number);
		License license = (License) q.getSingleResult();
		return license;
	}
	public License findByProviderName(String companyName){
		Query q = entityManager.createQuery("select n from License n where n.provider.name=:cn", License.class);
		q.setParameter("cn", companyName);
		License license = (License) q.getSingleResult();
		return license;
	}
	public License findByProviderId(String companyId){
		Query q = entityManager.createQuery("select n from License n where n.provider.providerIdentificationNumber=:cid", License.class);
		q.setParameter("cid", companyId);
		License license = (License) q.getSingleResult();
		return license;
	}

	public License save(License license) {
		License licenseToSave = new License();
		licenseToSave.setVersion(license.getVersion());
		licenseToSave.setValidTo(license.getValidTo());
		licenseToSave.setRestartRequired(license.isRestartRequired());
		licenseToSave.setInstalationTime(license.getInstalationTime());
		licenseToSave.setLicenseDescription(license.getLicenseDescription());
		licenseToSave.setValidFrom(license.getValidFrom());
		licenseToSave.setProvider(license.getProvider());
		entityManager.getTransaction().begin();
		entityManager.persist(licenseToSave);
		entityManager.getTransaction().commit();
		return licenseToSave;
	}
	
	public void update(License license) {
		entityManager.getTransaction().begin();
		entityManager.merge(license);
		entityManager.getTransaction().commit();
	}
}
