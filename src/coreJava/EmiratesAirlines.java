package coreJava;

public class EmiratesAirlines extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmiratesAirlines ea = new EmiratesAirlines();
		ea.engine();
		ea.lights();

	}

	@Override
	public void lights() {
		// TODO Auto-generated method stub
		System.out.println("Lights");
	}

}
