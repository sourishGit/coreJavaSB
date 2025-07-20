package coreJava;

public class ChildCar extends CarParent {
	
	String color = "Blue";
	
	public void color()
	{
		System.out.println(color);
	}
	
	public void color(String r)
	{
		System.out.println(4);
	}
	
	public void color(String r, int d)
	{
		System.out.println(5);
	}
	
	public void sound()
	{
		System.out.println("Sound in Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarParent pr = new ChildCar();
		ChildCar cr = new ChildCar();
		CarParent pr1 = new CarParent();
		pr.Steering();
		cr.color();
		cr.color("t", 0);
		System.out.println(pr.color);
		System.out.println(cr.color);
		cr.sound();
		pr.sound();
		pr1.sound();

	}

}
