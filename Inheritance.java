
class Object{
	
}

class Demo1{
	 int x = 6;
	 static int y = 10;
	
	public Demo1() {
		//super();
		System.out.println("demo1 cons");

//		x = 100;
	}
}
class Demo2 extends Demo1{
		int y;
	
	public Demo2() {
		super();
//		y = 200;
		System.out.println("demo2 cons");
	}
}

class Customr{
	private int cid;
	private String name;
	private int num;
	private String addr;
	public Customr(int cid,String name,int num,String addr) {
		cid = cid;
		 this.name = name;
		 this.num = num;
		 this.addr = addr;
	}
}

class RegularCustomer extends Customr {
	private float discount;
	
	public RegularCustomer(int cid,String name,int num,String addr,float discount) {
	 super(num, addr, num, addr);
	 this.discount = discount;
	}
}

public class Inheritance {

	public static void main(String[] args) {

		
//			RegularCustomer c1 = new RegularCustomer(1, "Mohan", 9248323, "Blore",56);
//		System.out.println(c1);
		
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		d1.x = 15;
		d1.y = 17;
		d2.x = 22;
		d2.y = 28;
		System.out.println(d1.x +" " + d1.y +" " + d2.x +" " + d2.y);
	}

}







