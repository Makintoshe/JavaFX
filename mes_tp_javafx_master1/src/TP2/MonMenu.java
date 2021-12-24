package TP2;


import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MonMenu extends MenuBar{

	
	public MonMenu() {
		// TODO Auto-generated constructor stub
	
		super();
		myMenu();
		
	}
	
	public void myMenu() {
		
		Menu menuFile, menuEdit, menuView;
		
		menuFile = new Menu("File");
		menuEdit = new Menu("Edit");
		menuView = new Menu("View");
		
		//File
		MenuItem miNew, miOpen, miSave; 
		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open");
		miSave = new MenuItem("Save");		
		menuFile.getItems().addAll(miNew, miOpen, miSave);
    	
		getMenus().addAll(menuFile, menuEdit, menuView);
		
	}
	
}
