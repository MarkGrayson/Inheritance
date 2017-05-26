package inheritance.model;

import inheritance.model.LoudNoises;

public class Dodge implements LoudNoises
{
	public double noiseVolume(Double decibleLevel)
	{
		decibleLevel = 999.999;
		return decibleLevel;
	}
	public double shotgunBlast()
	{
		double power = 420.69;
		return power;
	}
	public String carHorn()
	{
		String hornSound = "Ice Cream Truck";
		return hornSound;
	}
	public double duncanClap()
	{
		double didEardrumsBreak = 1.0;
		return didEardrumsBreak;
	}
}
