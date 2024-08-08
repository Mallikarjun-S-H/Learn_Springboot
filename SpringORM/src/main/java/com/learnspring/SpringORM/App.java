package com.learnspring.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.StudentDao;
import Dto.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	StudentDao dao = context.getBean(StudentDao.class);
    	
    	Student student = new Student();
    	
//    	student.setName("Anand");
//    	student.setAddress("RNR");
//    	dao.insert(student);
    	//dao.updateDetails(student);
    	
//    	System.out.println(dao.getStudentById(2));
    	
//    	dao.delete(5);
    	List<Student> students = dao.getAllStudent();
    	
    	for( Student sts : students ) {
    		System.out.println(sts);
    	}
    	 
    }
}
