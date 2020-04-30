package Airlines;

public abstract class Airplane implements AirplaneInterface {
	private String name;
	private boolean status;
	private int capacity;
	private double fuelConsumption;
	
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void takeOff()
	{
		System.out.println("The plane is flying");
	}
	public void land()
	{
		System.out.println("The plan is landing");
	}
	
	
}
