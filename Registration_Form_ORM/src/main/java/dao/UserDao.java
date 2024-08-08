package dao;

import org.springframework.stereotype.Repository;
import Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
public class UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Transactional
	public void saveUser(User user) {
		
		entityManager.persist(user);
	}
	
}
