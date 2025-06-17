package in.aj.resources;
import in.aj.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.aj.beans.Student;

@Configuration
public class JavaConfig {
	@Bean(name="aashi")
	public Student student()
	{
		Student st = new Student();
	    st.setCity("Indore");
		st.setName("Aashi");
		st.setRoll(101);
		return st;
	}

}
