package Dao;

import java.util.List;

import Dto.Student;


public interface StudentDao {
	public void insert(Student student);
	
	public void updateDetails(Student student);
	
	public void delete(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudent();
}
