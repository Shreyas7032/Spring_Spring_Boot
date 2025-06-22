package com.shreyas.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("ppp")// Using Qualifier Annotation
@Repository()
public class MySqlReport implements ReportDao {

	@Override
	public void generate_Report() {
		// TODO Auto-generated method stub
		System.out.println("MySqlReport...");
		
	}

}
