package in.aj.main;

import java.util.List;
import in.aj.beans.Student;
import in.aj.mappers.StudentRowMappper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.aj.resources.JavaConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        String select_query = "select * from student";
        List<Student> std = template.query(select_query, new StudentRowMappper());
        for(Student stud : std)
        {
        	System.out.println("Name:"+stud.getName());
        	System.out.println("Roll :"+stud.getRoll());
        	System.out.println("City :"+stud.getCity());
        	System.out.println("----------------------");
        }
        String name = "Riya";
        String select_query2 = "select * from student where name=?";
      Student stu2 = template.queryForObject(select_query2, new StudentRowMappper(), name);
      System.out.println("Name:"+stu2.getName());
  	System.out.println("Roll :"+stu2.getRoll());
  	System.out.println("City :"+stu2.getCity());
    }
    
    
    
}
