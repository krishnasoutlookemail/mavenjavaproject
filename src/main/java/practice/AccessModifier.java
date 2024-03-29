package practice;

public class AccessModifier {
	//accessible anywhere in the project
	public String publicField="This is a Public field";
	//accessible only in this class
	private String privateField="This is a Private field";
	//accessible within the class and within the same package plus subclasses
	protected String protectedField="This is a Protected field";
	//default access modifier and this will be accessible with the same package only
	String fieldDefault="This is a default";
	
	public void publicMethod() {
		System.out.println("This is a public method");
	}
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}
    void defaultMethod() {
		System.out.println("This is a default method");
	}
	
}
