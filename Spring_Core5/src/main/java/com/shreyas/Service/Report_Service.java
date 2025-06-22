package com.shreyas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shreyas.Repository.MySqlReport;
import com.shreyas.Repository.ReportDao;

@Service
public class Report_Service {
	
	
	

//	@Qualifier("ppp")
	ReportDao dao;
	
//	public Report_Service()
//	{
//		System.out.println("Report Service constuctor called...");
//	}
	
	
//	@Autowired   //Constructor injection with @primary annotation
//	public Report_Service(ReportDao dao) {
//		super();
//		this.dao = dao;
//	}
	
	@Autowired
	public void setDao(ReportDao dao) {
		this.dao = dao;
	}

	public void show_report()
	{
		dao.generate_Report();
		System.out.println("Report Generated..");
	}

	
}
