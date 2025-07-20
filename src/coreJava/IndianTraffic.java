package coreJava;

public class IndianTraffic implements CentralTraffic, ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic ct = new IndianTraffic();
		IndianTraffic it = new IndianTraffic();
		ContinentTraffic cct = new IndianTraffic();
		ct.GreenGo();
		it.walkinStreet();
		cct.TrainSymbol();

	}
	
	public void walkinStreet()
	{
		System.out.println("Please walk");
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("its Green, Go!!");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("its Red, Stop!!");
		
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("its Yellow, Wait a bit!!");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("See Train symbol!!");
	}

}
