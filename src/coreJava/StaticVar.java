package coreJava;

public class StaticVar {
	
	String name;
	String address;
	static int i;
	static String city;
	
	static
	{
		city = "Kolkata";
		i=0;
	}
	
	StaticVar(String name, String address)
	{
		this.name=name;
		this.address=address;
		
				
	}
	
	public void getAddress()
	{
		
		System.out.println(address+" "+city);
		this.city = "fff";
		
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar st = new StaticVar("Ram","Honolulu");
		StaticVar st1 = new StaticVar("Tum","surat");
		st.getAddress();
		st1.getAddress();
		StaticVar.getCity();
		st1.address="Dara";
		st1.getAddress();

	}

}
