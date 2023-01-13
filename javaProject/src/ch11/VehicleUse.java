package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.speedUP();
		v.sppedDown();
		v.handle();
		
		v = new Plane();
		v.speedUP();
		v.sppedDown();
		v.handle();
		
		v = new Boat();
		v.speedUP();
		v.sppedDown();
		v.handle();
	}
}

class Car implements Vehicle {

	@Override
	public void speedUP() {
		System.out.println("Car SpeedUp");
	}

	@Override
	public void sppedDown() {
		System.out.println("Car SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Car Handling");
	}
}

class Plane implements Vehicle {

	@Override
	public void speedUP() {
		System.out.println("Plane SpeedUp");
	}

	@Override
	public void sppedDown() {
		System.out.println("Plane SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}
}

class Boat implements Vehicle {

	@Override
	public void speedUP() {
		System.out.println("Boat SpeedUp");
	}

	@Override
	public void sppedDown() {
		System.out.println("Boat SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Boat Handling");
	}
}
