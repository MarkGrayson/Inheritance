package inheritance.model;

public class Harambe implements LoudNoises
{
double soundLevel;
	
	
	public Harambe()
	{
		soundLevel = 1000;
		
	}
	
	public double noiseVolume(Double decibleLevel)
	{
		return soundLevel * decibleLevel * 99999999999999e170;
	}
	
	public double shotgunBlast()
	{
		return -1;
	}
	
	public String carHorn()
	{
		return "";
	}
	
	public double scream()
	{
		return -742380045845850466803680356890632.0;
	}
}
