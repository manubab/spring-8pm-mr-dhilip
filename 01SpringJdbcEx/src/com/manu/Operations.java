package com.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Operations
{
	@Autowired
	JdbcTemplate job;
	
	public int addDetails()
	{
		String query="insert into student1 values('Manu!23','Manohar',23)";
		
		return job.update(query);
	}
	
	public int updateDetails()
	{
		String query="update student1 set id='Manu123',name='Manu',age=22 where id='Manu!23'" ;
		
		return job.update(query);
	}

}
