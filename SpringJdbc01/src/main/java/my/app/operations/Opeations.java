package my.app.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Opeations
{
	@Autowired(required = true)
	JdbcTemplate job;
	
	public int addDetails()
	{
		String query="insert into Student1 values('manu123','Manohar'21)";
	
		return job.update(query);
	}

}
