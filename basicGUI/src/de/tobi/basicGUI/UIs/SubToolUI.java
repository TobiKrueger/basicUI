package de.tobi.basicGUI.UIs;

import javax.swing.JPanel;

/**
 * The SubToolUI Abstract class is used to generate a JPanel and use it as a
 * container for every Component you want to have in the section this Panel will
 * represent
 * 
 * Functionality for its Components will be implemented in the matching SubTool
 * 
 * @author Tobias
 *
 */
public abstract class SubToolUI {
	// This is The Panel for all the SubTools components
	private JPanel _container;

	/**
	 * When the SubToolUI is created all the used components should be added to
	 * the Panel
	 */
	public SubToolUI() {
		_container = new JPanel();
	}

	/**
	 * This Method will return the Panel so that it may be used as a
	 * Subcomponent of the mainFrame or even another Panel
	 * 
	 * @return this UI's Panel/Container
	 */
	public JPanel getPanel() {
		return _container;
	}

}
