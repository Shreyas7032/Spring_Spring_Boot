package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.Repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpa2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2Application.class, args);
	}
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		List<Employee> employees = Arrays.asList(
//			    new Employee("Shreyas", "IT", 50000),
//			    new Employee("Kartikey", "HR", 45000),
//			    new Employee("Akash", "IT", 40000),
//			    new Employee("Rutuja", "HR", 34000),
//			    new Employee("Siddhi", "IT", 18000),
//			    new Employee("Komal", "Sales", 12000),
//			    new Employee("Aarav", "Finance", 30000),
//			    new Employee("Priya", "IT", 32000),
//			    new Employee("Raj", "Sales", 28000),
//			    new Employee("Sneha", "HR", 35000),
//			    new Employee("Yash", "IT", 41000),
//			    new Employee("Nikita", "HR", 33000),
//			    new Employee("Manish", "Sales", 26000),
//			    new Employee("Ankita", "Finance", 22000),
//			    new Employee("Rohit", "IT", 37000),
//			    new Employee("Mitali", "HR", 31000),
//			    new Employee("Kunal", "Sales", 39000),
//			    new Employee("Pooja", "IT", 25000),
//			    new Employee("Nilesh", "Finance", 29000),
//			    new Employee("Swati", "HR", 36000),
//			    new Employee("Ganesh", "IT", 42000),
//			    new Employee("Mayuri", "Sales", 27000),
//			    new Employee("Tejas", "Finance", 34000),
//			    new Employee("Bhavna", "HR", 30000),
//			    new Employee("Sagar", "IT", 23000),
//			    new Employee("Aditi", "Sales", 32000),
//			    new Employee("Deepak", "Finance", 26000),
//			    new Employee("Vidya", "IT", 31000),
//			    new Employee("Ramesh", "HR", 25000),
//			    new Employee("Vaishnavi", "Sales", 20000),
//			    new Employee("Tushar", "Finance", 38000),
//			    new Employee("Neha", "IT", 27000),
//			    new Employee("Omkar", "HR", 33000),
//			    new Employee("Harsh", "Sales", 39000),
//			    new Employee("Divya", "Finance", 18000),
//			    new Employee("Abhishek", "IT", 29000),
//			    new Employee("Snehal", "HR", 31000),
//			    new Employee("Ravi", "Sales", 24000),
//			    new Employee("Megha", "Finance", 28000),
//			    new Employee("Sanket", "IT", 36000),
//			    new Employee("Payal", "HR", 23000),
//			    new Employee("Amol", "Sales", 30000),
//			    new Employee("Kiran", "Finance", 21000),
//			    new Employee("Tanvi", "IT", 33000),
//			    new Employee("Vivek", "HR", 40000),
//			    new Employee("Anjali", "Sales", 37000),
//			    new Employee("Parth", "Finance", 25000),
//			    new Employee("Isha", "IT", 35000),
//			    new Employee("Akshay", "HR", 30000),
//			    new Employee("Shraddha", "Sales", 22000),
//			    new Employee("Sameer", "Finance", 24000),
//			    new Employee("Ashwini", "IT", 39000),
//			    new Employee("Saurabh", "HR", 27000),
//			    new Employee("Manasi", "Sales", 31000),
//			    new Employee("Chaitanya", "Finance", 36000),
//			    new Employee("Namrata", "IT", 34000),
//			    new Employee("Jay", "HR", 23000),
//			    new Employee("Seema", "Sales", 29000),
//			    new Employee("Nikhil", "Finance", 30000),
//			    new Employee("Prajwal", "IT", 28000),
//			    new Employee("Ashish", "HR", 26000),
//			    new Employee("Bhagyashri", "Sales", 35000),
//			    new Employee("Tanmay", "Finance", 27000),
//			    new Employee("Disha", "IT", 25000),
//			    new Employee("Rahul", "HR", 20000),
//			    new Employee("Rekha", "Sales", 18000),
//			    new Employee("Siddharth", "Finance", 31000),
//			    new Employee("Vaibhav", "IT", 40000),
//			    new Employee("Ritika", "HR", 37000),
//			    new Employee("Nisha", "Sales", 26000),
//			    new Employee("Aditya", "Finance", 39000),
//			    new Employee("Ketaki", "IT", 24000),
//			    new Employee("Dipak", "HR", 34000),
//			    new Employee("Bhavesh", "Sales", 30000),
//			    new Employee("Shruti", "Finance", 22000),
//			    new Employee("Sahil", "IT", 26000),
//			    new Employee("Madhuri", "HR", 36000),
//			    new Employee("Lalit", "Sales", 21000),
//			    new Employee("Aishwarya", "Finance", 29000),
//			    new Employee("Onkar", "IT", 33000),
//			    new Employee("Karishma", "HR", 27000),
//			    new Employee("Jatin", "Sales", 31000),
//			    new Employee("Vaidehi", "Finance", 32000),
//			    new Employee("Chinmay", "IT", 23000),
//			    new Employee("Kavita", "HR", 28000),
//			    new Employee("Pratik", "Sales", 25000),
//			    new Employee("Gauri", "Finance", 35000),
//			    new Employee("Suraj", "IT", 39000),
//			    new Employee("Apurva", "HR", 24000),
//			    new Employee("Om", "Sales", 36000),
//			    new Employee("Reshma", "Finance", 27000),
//			    new Employee("Harshal", "IT", 30000),
//			    new Employee("Mrunal", "HR", 32000),
//			    new Employee("Shubham", "Sales", 20000),
//			    new Employee("Kalyani", "Finance", 25000),
//			    new Employee("Shweta", "IT", 21000),
//			    new Employee("Ajay", "HR", 33000),
//			    new Employee("Aman", "Sales", 37000),
//			    new Employee("Ishwari", "Finance", 31000),
//			    new Employee("Rutu", "IT", 22000),
//			    new Employee("Soham", "HR", 18000),
//			    new Employee("Meera", "Sales", 29000),
//			    new Employee("Varun", "Finance", 26000)
//			);
//
//			repo.saveAll(employees);

//		
//		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		
		//for Sorting Data this is best methd..
		
//		Sort ascending = Sort.by("name").ascending();
//		List<Employee> all = repo.findAll(ascending);
//		all.forEach(System.out::println);
		
		
		//For starts with
//		List<Employee> all = repo.findAll();
//		for(Employee e:all)
//		{
//			if(e.getName().startsWith("S"))
//			{
//				System.err.println(e);
//			}
//		}
		
		
		//getSal Greater than
//		List<Employee> all = repo.findAll();
//		for(Employee a:all)
//		{
//			if(a.getSal()>20000)
//			{
//				System.err.println(a);
//			}
//		}
		
		
		//getSal less than 
//		List<Employee> all = repo.findAll();
//		for(Employee a:all)
//		{
//			if(a.getSal()<50000)
//			{
//				System.err.println(a);
//			}
//		}
		
		
		//equalsIgnoreCase
//		List<Employee> all = repo.findAll();
//		for(Employee a:all)
//		{
//			if(a.getDept().equalsIgnoreCase("hr"))
//			{
//				System.err.println(a);
//			}
//		}
		
//		List<Employee> all = repo.findAll();
//		for(Employee a:all)
//		{
//			if(a.getName().endsWith("s"))
//			{
//				System.err.println(a);
//			}
//		}
		
			
//			--------------------Pagination---------------------
		
//		PageRequest of = PageRequest.of(0, 15);
//		Page<Employee> all = repo.findAll(of);
//		List<Employee> content = all.getContent();
//		content.forEach(str->System.err.println(str));
		
//		-----------------------QueryBy Example-------------------------
		
		Employee e=new Employee();
		e.setId(1);
		Example<Employee> of = Example.of(e);
		List<Employee> all = repo.findAll(of);
		all.forEach(System.err::println);
	
		
	}

}
