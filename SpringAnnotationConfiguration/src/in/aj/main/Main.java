package in.aj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.resources.JavaConfig;
import in.aj.beans.Student;

public class Main {
	public static void main(String[] args) {
		

	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	Student stu = (Student)context.getBean("student");
	stu.display();
	
	}

}
