/*import java.util.Scanner;

class Circle{
	private float r;
	static private float pi;
	private float area;
	
	static {
		pi = 3.141f;  
	}
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		r = scan.nextFloat();
		
	}

	public void area() {
		area = pi*r*r;
	}

	public void dispArea() {
		System.out.println(area);
	}
}

public class StaticCircle {
	
	public static void main(String[] args) {
		System.out.println("PYTHON");
		Circle c1 = new Circle();
		c1.acceptInput();
		c1.area();
		c1.dispArea();
		
		
		Circle c2 = new Circle();
		c2.acceptInput();
		c2.area();
		c2.dispArea();
	}
	static {
		System.out.println("JAVA");
	}
}*/
class Test1{
	
	
}
public class StaticCircle{
	static int a = 40;
	public static void main(String[] args) {
//		int x = 20;
//		System.out.println(x);
//	}
//	static {
//		int x = 10;
//		System.out.println(x);
		
		
		
//		short bat = 42;
//		if(bat < 50 & !x) 
//			bat++;
//		if(bat>50);
//		else if(bat>40) {
//			bat += 7;
//			bat++;
//		}
//		else 
//			--bat;
//		
//		System.out.println(bat);
		
		System.out.println(a + " ");
		add();
		System.out.println(a);
		
	}
	private static void add() {
		a = a + 40;
	}
	}	
	

