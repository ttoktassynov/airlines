package Airlines;

public class CargoPlane extends Airplane {
	
	CargoPlane(String name, double fuelConsumption, double maxLoadCapacity)
	{
		super(name, fuelConsumption, maxLoadCapacity);
	}
	public void fly()
	{
		System.out.println(this.getName() + " is flying!");
	}
	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is taking off!");
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is landing!");
	}
}
