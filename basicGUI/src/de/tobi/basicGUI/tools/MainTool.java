package de.tobi.basicGUI.tools;

import de.tobi.basicGUI.UIs.MainUI;

/**
 * This Tool is used to Generate and control the main Window of the Application
 * 
 * @author Tobias
 *
 */
public class MainTool {
	//Saves the UI in a variable for generation and later Reference
	private MainUI _ui;
	
	/**
	 * Generates a MainUI and if necessary adds Action Listeners
	 */
	public MainTool() {
		_ui = new MainUI();
	}

}
