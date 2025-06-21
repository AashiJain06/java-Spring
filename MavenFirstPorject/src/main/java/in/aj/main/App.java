package in.aj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aj.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String config_loc = "/in/aj/resources/applicationContext.xml";
       ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
       Student stu = (Student)context.getBean("studId");
       stu.display();
       
    }
}
