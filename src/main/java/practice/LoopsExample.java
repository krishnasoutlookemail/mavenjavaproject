package practice;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
			
		}
		for(int i=100;i>10;i--) {
			System.out.println(i);
			
		}
		System.out.println("while loop is executing");
		int i=2;
		while(i<=20) {
		System.out.println(i);
		i++;
		}
		System.out.println("do while loop is executing");
		int j=5;
		do {
			System.out.println(j);
			j++;
		}while(j<50);


	}

}
