package de.tobi.basicGUI.UIs;

import javax.swing.JPanel;

public abstract class SubToolUI {
	private JPanel _container;

	public SubToolUI() {
		_container = new JPanel();
	}

	public JPanel getPanel() {
		return _container;
	}

}
