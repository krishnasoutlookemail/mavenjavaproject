package practice;

public class Encapsulation_employees {

	public static void main(String[] args) {
		Employees b1=new Employees();
		b1.setemployeeID("123abc");
		b1.setemployeeName("Krishna");
		b1.setSalary(5000);
		System.out.println("EmployeeID is "+b1.getemployeeID());
		System.out.println("Employee name is "+b1.getemployeeName());
		System.out.println("Employee salary is "+b1.getsalary());
		b1.deposit(10.00);
		System.out.println("Updated salary of "+b1.getemployeeName()+ " is "+b1.getsalary());

	}

}
