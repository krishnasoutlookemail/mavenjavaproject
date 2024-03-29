package practice;

public class Employees {
	
	private String employeeID;
	private String employeeName;
	private double salary;
	
	    //setter methods
		public void setemployeeID(String employeeID) {
			this.employeeID=employeeID;
			
		}
		public void setemployeeName(String employeeName) {
			this.employeeName=employeeName;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
	    //getter methods
		public String getemployeeID() {
			return employeeID;
		}
		public String getemployeeName() {
			return employeeName;
		}
		public double getsalary() {
			return salary;
		}
		//method to increment the salary
		public void deposit(double increment) {
			if(increment>0) {
				salary=salary+increment;
				System.out.println(increment + "$incremented successfully");
			}
			else {
				System.out.println("invalid increment value");
			}
		}
}
