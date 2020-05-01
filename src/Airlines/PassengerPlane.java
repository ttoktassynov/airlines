package Airlines;

public class PassengerPlane extends Airplane{
	PassengerPlane(String name, double fuelConsumption, int maxCustCapacity)
	{
		super(name, fuelConsumption, maxCustCapacity);
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
