package practice;

public class Car {
	static int year=2000;
	static String model="Honda";
	void start() {
		System.out.println("The car is starting");
	}
	void drive() {
		System.out.println("The car is in motion");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.start();
		c1.drive();
	
		
		

	}

}
