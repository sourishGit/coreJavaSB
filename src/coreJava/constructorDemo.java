package coreJava;

public class constructorDemo {
	
	public constructorDemo()
	{
		System.out.println("Inside constructor");
	}
	
	public constructorDemo(int a, int b)
	{
		int c = a+b;
		System.out.println("Inside constructor int 2 parameters : "+c);
	}
	
	public constructorDemo(String d)
	{
		System.out.println("Inside constructor String parameter : "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo cd = new constructorDemo();
		constructorDemo cd1 = new constructorDemo(5,4);
		constructorDemo cd2 = new constructorDemo("Hello");

	}

}
