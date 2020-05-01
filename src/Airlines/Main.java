package Airlines;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args)
	{
		Airline airline = new Airline("Air Astana");
		Airplane[] airplanes = new Airplane[3];
		
		airplanes[0] = new CargoPlane("AN", 1000, 500);
		airplanes[1] = new CargoPlane("MIG", 800, 400);
		airplanes[2] = new PassengerPlane("BOEING", 400, 150);
		
		airplanes[0].setLoad(500);
		airplanes[1].setLoad(400);
		airplanes[2].setLoad(190);
		
		airline.setAirplanes(airplanes);
		ArrayList<Airplane> efficientAirplanes = airline.getEfficientAirplane(450);
		for (Airplane airplane : efficientAirplanes) {
			System.out.println(airplane.getName() + "'s fuel consumption is " + airplane.getFuelConsumption());
		}
		
		airline.getAirplanes()[0].takeOff();
		airline.getAirplanes()[0].fly();
		airline.getAirplanes()[0].land();
	}
}
