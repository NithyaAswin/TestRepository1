package Encapsulation;

public class EncapSample1 {
	private String carname;
	private int regno;
	
	public void setter(String carname,int regno)
	{
		this.carname=carname;
		this.regno=regno;
	}
	public void getter()
	{
	System.out.println(carname);	
	regno=regno*100;
	System.out.println(regno);
	}
	

}
