package de.tobi.basicGUI.tools;

import javax.swing.JPanel;

import de.tobi.basicGUI.UIs.SubToolUI;

/**
 * This is an abstract Class wich will be used to generalize Subtools
 * 
 * Subtools are used to manage Sub sections of the Main Window
 * 
 * @author Tobias
 *
 */
public abstract class SubTool {
	// Each SubTool has to have a personal UI class attached to it
	private SubToolUI _ui;
	
	//TODO Decide if this is necessary or not
	//And a Identifier so that the main Tool always knows wich tool has a update for it
	//private final SubToolIdentifier _subToolID;

	/**
	 * When a SubTool is initialized it should generate the appropriate UI
	 */
	public SubTool() {

	}
	
	public JPanel getContainerForSubTool(){
		return _ui.getPanel();
	}

}
