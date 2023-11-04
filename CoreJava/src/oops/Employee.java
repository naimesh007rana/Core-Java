package oops;

public class Employee {
	public String Name;
	public int EmpId;
	private int Salary;
	
	public void Display() {
		System.out.println("Name of Employee is: "+Name);
		System.out.println("Empid of Employee is: "+EmpId);
		System.out.println("Salary of Employee is: "+Salary);
	}
	
	public void SetSalary(int sal) {
		this.Salary=sal;
	}
	
	//Default Constructor
	
	public Employee() {
		System.out.println("Inside Default Constructor");
		
	}
	
	//Parameterized Constructor
	public Employee(String Name1,int Empid1,int Salary1) {
		
		System.out.println("Inside Parameterized constructor");
		this.Name=Name1;
		this.EmpId=Empid1;
		this.Salary=Salary1;
	}
	


}
