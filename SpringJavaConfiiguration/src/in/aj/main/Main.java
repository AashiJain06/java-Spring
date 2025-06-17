package in.aj.main;
import in.aj.resources.JavaConfig;
import org.springframework.context.ApplicationContext;
import in.aj.beans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main (String[] args)
	{
	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
	Student std = (Student)context.getBean(Student.class);
	std.display1();
	}

}
