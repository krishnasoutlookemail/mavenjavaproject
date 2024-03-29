package practice;

public class CarConstructor {

	String brand;
	String model;
	int year;
	double price;
	//default constructor
	public CarConstructor() {
		brand="unknown";
		model="unknown";
		year=0;
		price=0.0;
	}
	//parameterized constructor with 4 parameters
	public CarConstructor(String brand,String model,int year,int price)
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.price=price;
		
	}
	//parameterized constructor with 3 parameters
	public CarConstructor(String brand,String model,int year)
	{
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public CarConstructor(CarConstructor othercar) {
		brand=othercar.brand;
		model=othercar.model;
		year=othercar.year;
		price=othercar.price;
	}
	//method to display details
	public void displayDetails() {
		System.out.println("brand is " +brand);
		System.out.println("model is " +model);
		System.out.println("year is " +year);
		System.out.println("price is " +price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarConstructor c1=new CarConstructor();
		CarConstructor c2=new CarConstructor("honda","civic",2020,25000);
		CarConstructor c3=new CarConstructor("toyota","rav4",2021);
		CarConstructor c4=new CarConstructor("kia","abc",2024,15000);
	//will show error as there is no constructor with 2 parameters
    //CarConstructor c5=new CarConstructor("kia","abc");
		//copy constructor 
		CarConstructor c6=new CarConstructor(c4);
		System.out.println("displaying c1 data");
		c1.displayDetails();
		System.out.println("displaying c2 data");
		c2.displayDetails();
		System.out.println("displaying c3 data");
		c3.displayDetails(); //here for price it takes default value
		System.out.println("displaying c4 data");
		c4.displayDetails();
		System.out.println("displaying c6 data");
		c6.displayDetails();
		
	}

}
