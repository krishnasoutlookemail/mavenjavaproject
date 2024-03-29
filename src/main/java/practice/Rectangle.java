package practice;

public class Rectangle {
	int length;
	int width;
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public int calculateArea() {
		return length*width;
	}
	public String name() {
		return "krishna";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(5,6);
		Rectangle r2=new Rectangle(8,7);
		
		System.out.println(r1.calculateArea());
		System.out.println(r2.calculateArea());
		
		System.out.println(r1.name());
		
		
		
		
	}

}
