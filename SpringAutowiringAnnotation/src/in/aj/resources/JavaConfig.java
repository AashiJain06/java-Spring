package in.aj.resources;
import in.aj.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.aj.beans.Address;
@Configuration
public class JavaConfig {
	@Bean
	public Student student()
	{
		Student st = new Student();
		st.setName("Aashi");
		st.setRoll(101);
		//st.setaddress(address());
		return st;
	}
	@Bean
	public Address address()
	{
		Address add = new Address();
		add.setCity("Indore");
		add.setHouse(64);
		add.setPin(452003);
		return add;
	}
	@Bean
	public Address address1()
	{
		Address add = new Address();
		add.setCity("Chennai");
		add.setHouse(63);
		add.setPin(452003);
		return add;
	}
	

}
