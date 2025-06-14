package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		String config_loc = "/in/sp/resources/applicationContext.xml";
		context = new ClassPathXmlApplicationContext(config_loc);
		Student std= (Student)context.getBean("stdId");
		std.display();
	}

}
