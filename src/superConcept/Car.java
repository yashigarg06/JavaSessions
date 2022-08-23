package superConcept;

public class Car {
	int speed=100;
	public Car() {
		System.out.println("Car class constructor");
	}
	public Car(int a) {
		System.out.println("Car constructor "+a);
	}
	public void speed()
	{
		System.out.println("car speed is :"+speed);
	}
	public static void refuel() {
		System.out.println("car refuel");
	}

}
