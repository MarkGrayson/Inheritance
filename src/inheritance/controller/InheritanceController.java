package inheritance.controller;

import java.util.ArrayList;
import inheritance.model.*;
import inheritance.view.*;

public class InheritanceController 
{
	private NoisesThatAreLoud loudNoises;
	private Dodge dodge;
	private Hearing hearing;
	private Sound sound;
	private Harambe harambe;
	private ArrayList<LoudNoises> noises;
	private InheritanceFrame baseFrame;
	
	public InheritanceController()
	{
		loudNoises = new NoisesThatAreLoud();
		noises = new ArrayList<LoudNoises>();
		hearing = new Hearing();
		dodge = new Dodge();
		sound = new Sound();
		harambe = new Harambe();
		baseFrame = new InheritanceFrame(this);
	}
	public void start()
	{

	}
	
	public String inheritanceTest()
	{
		String testOutput = "";
		if(new Dodge() instanceof LoudNoises)
		{
			testOutput += "The volume of the meme is " + dodge.meme() + " (Dodge)\n";
		}
		
		if(new Hearing() instanceof LoudNoises)
		{
			testOutput += "The volume of Duncan's clap is " + hearing.scream() + " (Duncan Nguyen)\n";
		}
		
		if(new NoisesThatAreLoud() instanceof LoudNoises)
		{
			testOutput += "The sound a car makes is " + loudNoises.carHorn() + " (Isaac Hill)\n";
		}
		
		if(new Sound() instanceof LoudNoises)
		{
			testOutput += "The volume of a 2.0 decible sound is " + sound.noiseVolume(2.0) + " (Matt Hachtel)\n";	
		}
		
		if(new Slurp() instanceof LoudNoises)
		{
			testOutput += "The sound of shotgun blast is " + slurp.shotgunBlast() + " (Patrick Brashear)";
		}
		
		return testOutput;
	}
}

}
