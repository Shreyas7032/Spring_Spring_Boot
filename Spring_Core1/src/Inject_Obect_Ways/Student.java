package Inject_Obect_Ways;

public class Student {

	Iresource res;
	
//	public Student(Iresource res)
//	{
//		this.res=res;
//	}
	
	public void setResource(Iresource res)
	{
		this.res=res;
	}
	
	
	public void study()
	{
		res.start();
		System.out.println("Study Started...");
	}
	
	public static void main(String[] args) {
		//1st way to inject dependancy 
//		Student student=new Student();
//		student.res=new Laptop();
//		student.res=new IPhone();
//		student.study();
		
		
		//2nd way Constructor Injection
//		Student s=new Student(new IPhone());
//		Student s1=new Student(new Laptop());
//		s1.study();
		
		//3rd way setter Injection
//		Student s=new Student();
//		s.setResource(new Laptop());
//		s.setResource(new IPhone());
//		s.study();
		
		
		
		
		
		
		
	}

}
