package in.aj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.aj.beans.Student;

public class Main {
	public static void main (String[] args)
	{
	ApplicationContext context =new AnnotationConfigApplicationContext("JavaConfig.class");
	Student std = (Student)context.getBean("studId");
	std.display1();
	}

}
