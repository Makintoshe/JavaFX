package TP2;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

public class CtxtMenu extends ContextMenu {

	public CtxtMenu() {
		// TODO Auto-generated constructor stub
	
		super();
		myCtxtMenu();
		
	}
	
	public void myCtxtMenu() {
		
		final ContextMenu cm = new ContextMenu();
		MenuItem miCopy, miPaste, miCut;
		miCopy = new MenuItem("Copy");
		miPaste = new MenuItem("Paste");
		miCut = new MenuItem("Cut");
		
		getItems().addAll(miCopy,miPaste,miCut);		
		
	}
	
	
}
