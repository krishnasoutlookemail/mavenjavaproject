package practice;

public class StudentConstructor {

		String studentId;
		String name;
		int age;
		double marks;
		
		public StudentConstructor() {
			studentId="unknown";
			name="unknown";
			age=0;
			marks=0.0;
		}
		//parameterized constructor with 4 parameters
		public StudentConstructor(String studentId,String name,int age,double marks)
		{
			this.studentId=studentId;
			this.name=name;
			this.age=age;
			this.marks=marks;
			
		}
		//parameterized constructor with 3 parameters
		public StudentConstructor(String studentId,String name,int age)
		{
			this.studentId=studentId;
			this.name=name;
			this.age=age;
		}
		//copy constructor
		public StudentConstructor(StudentConstructor otherstudent) {
			studentId=otherstudent.studentId;
			name=otherstudent.name;
			age=otherstudent.age;
			marks=otherstudent.marks;
		}
		//method to display details
		public void displayDetails() {
			System.out.println("Student ID is " +studentId);
			System.out.println("Student name is " +name);
			System.out.println("Student age is " +age);
			System.out.println("Student mark is " +marks);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentConstructor c1=new StudentConstructor();
			StudentConstructor c2=new StudentConstructor("123A","Krishna",28,75.54);
			StudentConstructor c3=new StudentConstructor("123B","Sreerag",29);
			StudentConstructor c4=new StudentConstructor("123C","Blesson",30,80);
			//copy constructor
			StudentConstructor c5=new StudentConstructor(c4);
			System.out.println("displaying Student1 data");
			c1.displayDetails();
			System.out.println("\n");
			System.out.println("displaying Student2 data");
			c2.displayDetails();
			System.out.println("\n");
			System.out.println("displaying Student3 data");
			c3.displayDetails(); //here for price it takes default value
			System.out.println("\n");
			System.out.println("displaying Student4 data");
			c4.displayDetails();
			System.out.println("\n");
			System.out.println("displaying Student5 data");
			c5.displayDetails();
			
		}

	}


	


