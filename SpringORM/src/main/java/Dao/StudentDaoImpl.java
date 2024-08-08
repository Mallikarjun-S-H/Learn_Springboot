package Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Dto.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
    @PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	@Transactional
	public void insert(Student student) {
		entityManager.persist(student);
	}

	@Override
	@Transactional
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
		
	}
	
	@Override
	@Transactional
	public void updateDetails(Student student) {
		
		entityManager.merge(student);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityManager.remove(student);
        }
	}	

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		return entityManager.createQuery("select s from Student s", Student.class).getResultList();
		}

}
