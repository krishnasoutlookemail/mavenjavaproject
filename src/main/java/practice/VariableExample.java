package practice;
/*
 Local variable-> created inside a method
 Instance variable
 static variable->
 */

public class VariableExample {
	int n=10;  //instance variable
	int b=5;
	static int v=6;
	void printNumbers() {
		int n=10;
		System.out.println(n);
		
	}
	void sumnumbers() {
		int n=20; // local variables
		int m=10;
		int p=n+m;
		System.out.println(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableExample v1=new VariableExample();
		v1.printNumbers();
		v1.sumnumbers();
		System.out.println(v1.n); // calling instance variable
		System.out.println(v1.b);
		System.out.println(VariableExample.v);
		System.out.println(StaticInstance.staticvar);
		//System.out.println(StaticInstance.instancevar);//cant access instance var using classname we need to creeate obj instead
		StaticInstance v3=new StaticInstance();
		System.out.println(v3.instancevar);

	}

}
