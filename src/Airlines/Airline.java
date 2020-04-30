package Airlines;

public class Airline implements AirlinesInterface{
	private String name;
	private Airplane[] airplanes;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Airplane[] getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(Airplane[] airplanes) {
		this.airplanes = airplanes;
	}

	Airline(String name, Airplane [] airplanes)
	{
		this.setAirplanes(airplanes);
		this.setName(name);
	}
	public double calculateFuelExpense()
	{
		return 0;
	}
	public boolean canTransportCargo()
	{
		return false;
	}
	public Airplane[] getAirplanesByFuelConsumption(double fuelConsumption)
	{
		for (Airplane airplane : airplanes)
		{
			if (airplane.getFuelConsumption() <= fuelConsumption)
			{
			
			}
		}
		return airplanes;
	}
 }
