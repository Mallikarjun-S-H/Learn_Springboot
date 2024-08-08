package com.learnspring.SpringJdbcCRUD;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Dao.StudentDao;
import Dto.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	StudentDao stDao = context.getBean(StudentDao.class);
    	
    	Student student = new Student();
    	
//    	student.setId(5);
//    	student.setName("Roshni");
//    	student.setAddress("Mumbai");
//    	stDao.insert(student);
    	
    	
    	//System.out.println(stDao.getStudentById(2));
    	
    
//    	student.setName("Aman up");
//    	student.setAddress("Goa up");
//    	student.setId(2);
//    	stDao.updateDetails(student);
//    	
    	
    	List<Student> students = stDao.getAllStudent();
    	for(Student st : students) {
    		System.out.println(st);
    	}	
    	
    }
}
