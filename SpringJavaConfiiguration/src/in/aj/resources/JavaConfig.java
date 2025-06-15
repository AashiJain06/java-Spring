package in.aj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.aj.beans.Student;

@Configuration
public class JavaConfig {
	@Bean("studId")
	public Student obj1()
	{
		Student st = new Student();
		st.setCity("Indore");
		st.setName("Aashi");
		st.setRoll(101);
		return st;
	}

}
