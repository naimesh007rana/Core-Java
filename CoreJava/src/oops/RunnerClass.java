package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1=new Employee();
emp1.Name="Naimesh";
emp1.EmpId=100;
emp1.SetSalary(60000);

Employee emp2=new Employee();
emp2.Name="Unnati";
emp2.EmpId=101;
emp2.SetSalary(50000);

Employee emp3=new Employee("Jayesh",103,40000);


emp1.Display();
emp2.Display();
emp3.Display();

ICICIBank obj1=new ICICIBank();
obj1.AccNo=12345;
obj1.BankId=100;

HDFCBank obj2=new HDFCBank();
obj2.Account=123545;

	}

}
