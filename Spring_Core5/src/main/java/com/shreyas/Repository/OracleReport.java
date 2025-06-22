package com.shreyas.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("dao")  //it is used with @autowired annotation

@Repository
@Primary
public class OracleReport implements ReportDao{

	@Override
	public void generate_Report() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Report....");
		
	}
	
	

}
