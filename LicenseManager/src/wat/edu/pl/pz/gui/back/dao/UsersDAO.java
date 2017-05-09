package wat.edu.pl.pz.gui.back.dao;

import wat.edu.pl.pz.gui.back.entity.Users;
import wat.edu.pl.pz.gui.back.services.EntityManagerService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

	EntityManager entityManager = EntityManagerService.getEntityManager();

	public Users findByLogin(String login) {
		Query q = entityManager.createQuery(
				"select u from Users u where u.login=:log", Users.class);
		q.setParameter("log", login);
		Users user = (Users) q.getSingleResult();
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<Users> findByEmail(String email) {
		Query q = entityManager.createQuery(
				"select u from Users u where u.email=:ema", Users.class);
		q.setParameter("ema", email);
		// TODO: poprawi? to jak b?dzie czas (i ch?ci...)
		List<Users> userList = (ArrayList<Users>) q.getResultList();
		return userList;
	}

	public Users save(Users user) {
		Users userToSave = new Users();
		userToSave.setEmail(user.getEmail());
		userToSave.setEmployee(user.getEmployee());
		userToSave.setLogin(user.getLogin());
		userToSave.setPassword(user.getPassword());
		userToSave.setRole(user.getRole());
		entityManager.getTransaction().begin();
		entityManager.persist(userToSave);
		entityManager.getTransaction().commit();
		return userToSave;
	}
}
