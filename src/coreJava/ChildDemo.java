package coreJava;

public class ChildDemo extends ParentDemo{
	
	String name = "SourishAutomation";
	
	public ChildDemo()
	{
		//super();
		System.out.println("Child Class constructor");
	}
	
	
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("In Child getData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
