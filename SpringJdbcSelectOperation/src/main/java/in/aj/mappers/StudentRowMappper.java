package in.aj.mappers;
import in.aj.beans.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMappper implements RowMapper<Student>
{
   @Override
public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student stu = new Student();
	stu.setName(rs.getString("name"));
	stu.setRoll(rs.getInt("roll"));
	stu.setCity(rs.getString("city"));
	return stu;
}

}
