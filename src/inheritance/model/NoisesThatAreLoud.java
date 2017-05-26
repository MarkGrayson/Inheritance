package inheritance.model;

public class NoisesThatAreLoud implements LoudNoises
{
	public double noiseVolume(Double decibleLevel)
	{
		decibleLevel = (((((decibleLevel * 2)/ 2) + 9) - 9) / 3) * 3;
		return decibleLevel;
	}
	
	public double shotgunBlast()
	{
		return 189.99;
	}
	
	public String carHorn()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 5);
		
		switch(random)
		{
			case 0:
				randomTopic = "Banana";
				break;
			case 1:
				randomTopic = "Cheese";
				break;
			case 2:
				randomTopic = "Bread";
				break;
			case 3:
				randomTopic = "Daniel";
				break;
			case 4:
				randomTopic = "jack";
				break;
			default:
				randomTopic = "Harambe";
				break;
		}	
		return randomTopic;
	}
	
	public double scream()
	{
		double decibleLevel = 999999999.9999;
		return decibleLevel;
	}
}
