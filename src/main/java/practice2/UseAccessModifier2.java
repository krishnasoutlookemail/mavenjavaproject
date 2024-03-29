package practice2;

import practice.AccessModifier;

public class UseAccessModifier2 extends AccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier ob=new AccessModifier();
		UseAccessModifier2 ob1=new UseAccessModifier2();
		System.out.println(ob.publicField);
	//	System.out.println(ob.privateField);private fields are not accessible outside the class
	//	System.out.println(ob.protectedField);protected field not accessible in different package class
		System.out.println(ob1.protectedField);
	//	System.out.println(ob.fieldDefault); protected field not accessible in different package class
		ob.publicMethod();
	//	ob.privateMethod(); private fields are not accessible outside the class
	//	ob.protectedMethod(); protected method not accessible in different package class
	//	ob.defaultMethod(); default method not accessible in different package class

	}

}
