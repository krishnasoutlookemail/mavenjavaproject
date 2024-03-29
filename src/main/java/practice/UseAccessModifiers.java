package practice;

public class UseAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier ob=new AccessModifier();
		System.out.println(ob.publicField);
	//	System.out.println(ob.privateField);private fields are not accessible outside the class
		System.out.println(ob.protectedField);
		System.out.println(ob.fieldDefault);
		ob.publicMethod();
	//	ob.privateMethod(); private fields are not accessible outside the class
		ob.protectedMethod();
		ob.defaultMethod();
	}

}
