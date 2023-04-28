
class Plane{
	int a = 20;
	void takeOff() {
		System.out.println("Plane is " + "Taking Off");
	}
	void fly() {
		System.out.println("Plane is" + " Flying");
	}
	void land() {
		System.out.println("Plane is" + " Landing");
	}
}

class CargoPlane extends Plane{
	int a = 30;
	
	CargoPlane() {
//		System.out.println(a);
//		System.out.println(super.a);
	}
	void fly() {
		System.out.println("i cp");
		System.out.println("Cargo Plane is" + " flying at low heights");
	}
	void carryCargo() {
		System.out.println("Cargo Plane is" + " carrying Cargo");
	}
}
class Car extends CargoPlane{
	public void fly() {
		super.fly();
		System.out.println("b");
	}
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("Passenger Plane is" + " flying at medium heights");
	}
	void carryPassengers() {
		System.out.println("Passenger Plane is" + " carrying passengers");
	}
}


class FighterPlane extends Plane{
	void fly() {
		System.out.println("Fighter Plane is" + " flying at great heights");
	}
	void carryWeapons() {
		System.out.println("Cargo Plane is" + " carrying weapons");
	}
}


public class InhPlane {

	public static void main(String[] args) {
		
		Plane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
//		cp.takeOff();
		cp.fly();
//		cp.land();
//		cp.carryCargo();
//		System.out.println();
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		pp.carryPassengers();
//		System.out.println();
//		fp.takeOff();
//		fp.fly();
//		fp.land();
//		fp.carryWeapons();
		
//		Plane ref;
//		ref = cp;
//		ref.fly();
//		((CargoPlane)(ref)).carryCargo();
//	
//		ref = pp;
//		ref.fly();
//		((PassengerPlane)(ref)).carryPassengers();
//	
//		ref = fp;
//		ref.fly();
//		((FighterPlane)(ref)).carryWeapons();
		
//		Car c = new Car();
//	  c.fly();
	
	
	
	
	
	}

}
