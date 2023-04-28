					// Shadowing & Constructor
class Customerr
{
	private int cid;
	private String cname;
	private long cnumber;
	
	public Customerr() { // zero parameterized constructor
//		cid = 101  ;
//		cname = "arul";
//		cnumber = 343234;
	}
							// parameterized constructor
	public  Customerr(int x, String cname, long cnumber) {
		this();
		
		this.cid =x;
		this.cname = cname;
		this.cnumber = cnumber;
		System.out.println(x);
		
	}
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public long getCnumber() {
		return cnumber;
	}
}

public class EncapsulationSC {

	public static void main(String[] args) {
		
		Customerr c = new Customerr();
		System.out.println(c.getCid() +" "+ c.getCname() + " " +c.getCnumber());
	
		
		Customerr c1 = new Customerr(2,"megha",2256456);
		System.out.println(c1.getCid() +" "+ c1.getCname() + " " +c1.getCnumber());
	}

}
