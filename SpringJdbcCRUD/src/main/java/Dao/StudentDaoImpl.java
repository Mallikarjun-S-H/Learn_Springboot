package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Dto.Student;

@Component
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jt;

	/*
	 * public JdbcTemplate getJt() { return jt; }
	 * 
	 * public void setJt(JdbcTemplate jt) { this.jt = jt; }
	 */

	public int insert(Student student) {

		String sql = "insert into student(id, name, address) values(?, ?, ?)";
        return jt.update(sql, student.getId(), student.getName(), student.getAddress());
	}

	public int updateDetails(Student student) {
		String sql = "update student set name=?, address=? where id=?";

		int i = jt.update(sql, student.getName(), student.getAddress(), student.getId());
		return i;
	}

	public int delete(int id) {
		String sql = "Delete from student where id=?";
		int i = jt.update(sql, id);
		return i;
	}

	public Student getStudentById(int id) {
		String sql = " select * from student where id=?";
		RowMapper<Student> rm = new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
                return student;	
			}
		};
		Student student = jt.queryForObject(sql, rm, id);
		
		return student;
	}

	public List<Student> getAllStudent() {
		String sql = " select * from student";
		RowMapper<Student> rm = new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
                return student;	
			}
		};
		List<Student> list = jt.query(sql, rm);
		
		return list;
	}

}
