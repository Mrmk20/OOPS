class Customer{
	char gender;
	String city;
	int cID;
	long mobile;
	
	void setDetail(char g) {
		gender = g;
	}
	
	void setDetail(String c) {
		city = c;
	}
	
	void setDetail(int i) {
		cID = i;
	}
	
	void setDetail(long m) {
		mobile = m;
	}

}



class Calculator{
	
	float add(int a, int b) {
		System.out.println("1");
		return a+b;
	}
	double add(float a, double b) {
		System.out.println("2");
		return add(18,23);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		/*Customer c1 = new Customer();
		c1.gender = 'M';
		c1.city = "Banglore";
		c1.cID = 1234;
		c1.mobile = 9423412340l;
		
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cID);
		System.out.println(c1.mobile);
		
		
		c1.setDetail('F');
		c1.setDetail("Hyderabad");
		c1.setDetail(2223);
		c1.setDetail(9999999999l);
	
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cID);
		System.out.println(c1.mobile);*/
		
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main1(String[] args) {
	}
}
