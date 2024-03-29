package practice;

public class StaticInstance {
	//static variable
	static int staticvar=0;
	//instance variable
	int instancevar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initial value of static variable "+staticvar);
		StaticInstance v1=new StaticInstance();
		StaticInstance v2=new StaticInstance();
		v1.instancevar=10;
		v2.instancevar=20;
		System.out.println("value of v1's object" +v1.instancevar);
		System.out.println("value of v2's object" +v2.instancevar);
	    //instancevar=5;//instance variable cannot be called without an object
		staticvar=5;
		System.out.println("Updated value of static var "+staticvar);
		exampleStaticMethod();// calling static method directly
		v1.exampleInstanceMethod();//calling instance method using object
		//exampleInstanceMethod();//instance method cannot be called without an object
		
	}
	public static void exampleStaticMethod() {
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
		System.out.println(staticvar);//static var can be accessed in static method
		StaticInstance v1=new StaticInstance();//but we cannot access instance var in static method, we can but need to create an obj
		System.out.println(v1.instancevar);
	}
	public void exampleInstanceMethod() {
		int a=10;
		int b=15;
		int product=a*b;
		System.out.println(product);
		System.out.println(instancevar);//instance var can be accessed in static method
		System.out.println(staticvar);//but static are accessible in instance(non static)
	}

}
