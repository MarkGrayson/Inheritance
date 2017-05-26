package inheritance.view;

import javax.swing.JFrame;
import inheritance.controller.InheritanceController;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel inheritPanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		super();
		this.baseController = baseController;
		inheritPanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(inheritancePanel);
		this.setTitle("Advanced Inheritance");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);	
	}
}
