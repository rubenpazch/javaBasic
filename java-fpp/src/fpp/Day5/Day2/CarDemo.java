package interfacedemo;

class Suzuki implements MotorVehicle
{
    final int sm = 25;  
    public double getfuel(int m)
	{
		return (m/sm);
	}
}

class Toyoto implements MotorVehicle
{
    final int tm = 35;  
	public double getfuel(int m)
	{
		return (m/tm);
	}
}
public class CarDemo {
	public static void main(String[] args) 
	{
		Suzuki Sobj = new Suzuki();
		
		System.out.println("Fuel needed for Suzuki : " + Sobj.getfuel(100));
		Toyoto Tobj = new Toyoto();
		System.out.println("Fuel needed for Toyoto : " + Tobj.getfuel(105));
	}

}
