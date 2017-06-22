package de.tobi.basicGUI.UIs;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * This class is used to Generate a main Window 
 * 
 * @author Tobias
 *
 */
public class MainUI {
	//this is the basic Window 
	private JFrame _mainFrame; 

	/**
	 * The Constructor of this class generates a Window and makes it visible
	 */
	public MainUI() {
		//TODO  Give your Window a Title 
		_mainFrame = new JFrame("Insert your Title here");
		
		//Sets the size of the Window to the Parameters
		//if you want it to fit the size of its components use 
		//_mainFrame.pack();
		_mainFrame.setSize(500, 500);
		
		//Centers the Location of the main Window to your Screen
		_mainFrame.setLocationRelativeTo(null);
		//In case you want a more percise Placement use
		//_mainFrame.setLocation(x, y);
		
		//Defines what happens when you press the Close Button 
		_mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//Makes the Window visible 
		_mainFrame.setVisible(true);
	}
	
	/**
	 * Gets rid of this Window and should be used to exit the Program
	 */
	public void dispose(){
		_mainFrame.dispose();
	}

}
