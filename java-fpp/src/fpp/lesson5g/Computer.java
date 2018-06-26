package lesson5g;

public class Computer {
	private String manufacturer;
	private String procesor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer (String Manufacturer,String Processor,int RamSize,double ProcessorSpeed)
	{
		this.manufacturer=Manufacturer;
		this.procesor=Processor;
		this.ramSize=RamSize;
		this.processorSpeed=ProcessorSpeed;
	}
	
	public int getRamSize()
	{
		return this.ramSize;
	}
	public double getProcessorSpeed()
	{
		return this.processorSpeed;
	}
	public double computePower()
	{
		return this.ramSize*this.processorSpeed;
	}
	@Override
	public String toString()
	{
		return "Manufacturer : "+manufacturer+ "Processor : "+procesor + " Ram : "+ getRamSize() + " Processor Speed : "+ getProcessorSpeed() + " Computer Power : "+ computePower();
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) 
			return false;
		if(this.getClass() != ob.getClass())
			return false;
		Computer p = (Computer)ob;
		boolean isEqual= this.manufacturer.equals(p.manufacturer) && this.procesor == p.procesor && this.ramSize==p.ramSize && this.processorSpeed==processorSpeed;
		return isEqual;
	}
	@Override
	public int hashCode() {
		int hash =37;
		int code=0;
		
		//Manufacturer
		code = (manufacturer==null?0:manufacturer.hashCode());
		hash=hash*59+code;

		//processor
		code = (procesor==null?0:procesor.hashCode());
		hash=hash*59+code;
		
		//ramSize
		code = (ramSize<0?0:procesor.hashCode());
		hash=hash*59+code;
		
		//processorSpeed
		long SpeedProcessor=Double.doubleToLongBits(processorSpeed);
		code=(int)(SpeedProcessor^(SpeedProcessor >>>32));
		hash=hash*59+code;
		return hash;
	}
}
