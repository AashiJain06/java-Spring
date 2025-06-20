package in.aj.mains;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.aj.beans.Student;

	public class Main {
		private static ApplicationContext context;

		public static void main(String[] args)
		{
		String config_loc = "/in/sp/resources/applicationContext.xml/";
		context = new ClassPathXmlApplicationContext(config_loc);
		Student stu = (Student)context.getBean("studId");
		stu.display();
		}
	}


