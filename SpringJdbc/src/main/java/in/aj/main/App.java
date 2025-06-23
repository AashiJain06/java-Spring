package in.aj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.aj.resources.JavaConfig;
public class App 
{
    public static void main( String[] args )
    {
    	String name = "Riya";
    	int roll = 102;
    	String city = "Indore";
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        String insert_query = "Insert into student values (?,?,?)";
        int n = template.update(insert_query,name,roll,city);
        if(n>0)
        {
        	System.out.println("insertion Sucessful");
        }
        else
        {
        	System.out.println("Insertion Unsuccessful");
        }
    }
}
