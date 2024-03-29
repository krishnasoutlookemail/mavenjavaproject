package practice;

public class Constructorexample {
	String brand;
	String model;
	int year;
	public Constructorexample() { //default constructor
		brand="Toyota";   //initialization part
		model="Corola";
		year=2006;
	}
	public Constructorexample(String brandname,String modelname,int y) {//parameterized constructor
		brand=brandname;   //initialization part
		model=modelname;
		year=y;
	}
	public void displayDetails() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample obj1=new Constructorexample();
		Constructorexample obj2=new Constructorexample("Kia","forte",2005);
		Constructorexample obj3=new Constructorexample("Honda","civic",2006);
		obj1.displayDetails();
		obj2.displayDetails();
		obj3.displayDetails();


	}
	

}
