package inheritance.model;

public class Sound implements LoudNoises
{
	public double noiseVolume(Double decibleLevel)
	{
		decibleLevel = (((((decibleLevel * 2) /2) + 4) -4));
		return decibleLevel;
	}
	
	public double shotgunBlast()
	{
		return 169.99;
	}
	
	public String carHorn()
	{
		return "Honk Honk";
	}
	
	public double scream()
	{
		double decibleLevel = -999999.99999;
		return decibleLevel;
	}
}
