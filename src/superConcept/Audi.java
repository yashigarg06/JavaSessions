package superConcept;

public class Audi extends Car {
	int speed=200;
	public Audi() {
		//super();
		super(10);
		System.out.println("Audi class constructor");
	}
	@Override
	public void speed() {
		System.out.println("audi speed is "+speed);
		System.out.println("Car speed is: "+super.speed);
		super.refuel();
		
	}
}
