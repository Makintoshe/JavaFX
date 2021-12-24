package TP2;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BoxTab extends Tab {
	
	ToggleButton onTGB, offTGB;
	RadioButton frRB, usRB, ukRB;
	CheckBox jCbB, pCB, cCB; 

	public BoxTab() {
		// TODO Auto-generated constructor stub
		
		super();
		setText("Boxes");
		myBoxTab();
	
	}
	
	public void myBoxTab() {
		
		VBox vb = new VBox(10);
		HBox hb1 = new HBox(5);
		HBox hb2 = new HBox(5);
		HBox hb3 = new HBox(5);
		
		//
		onTGB = new ToggleButton("On");
		onTGB.setSelected(true);
		offTGB = new ToggleButton("Off");
		
		ToggleGroup tg = new ToggleGroup();
		onTGB.setToggleGroup(tg);
		offTGB.setToggleGroup(tg);
		
		hb1.setAlignment(Pos.CENTER);
		hb1.getChildren().addAll(onTGB,offTGB);
	
		//
		frRB = new RadioButton("FR");
		frRB.setSelected(true);
		usRB = new RadioButton("US");
		ukRB = new RadioButton("UK");
		
		ToggleGroup rg = new ToggleGroup();
		frRB.setToggleGroup(rg);
		frRB.setSelected(true);
		usRB.setToggleGroup(rg);
		ukRB.setToggleGroup(rg);
		
		hb2.setAlignment(Pos.CENTER);
		hb2.getChildren().addAll(frRB,usRB,ukRB);
		
		//
		jCbB = new CheckBox("Java");
		jCbB.setIndeterminate(true);
		jCbB.setAllowIndeterminate(true);
		pCB = new CheckBox("Python");
		pCB.setIndeterminate(true);
		jCbB.setAllowIndeterminate(true);
		cCB = new CheckBox("C++");
		cCB.setIndeterminate(true);
		cCB.setAllowIndeterminate(true);
		
		hb3.setAlignment(Pos.CENTER);
		hb3.getChildren().addAll(jCbB,pCB,cCB);
		
		//		
		vb.setAlignment(Pos.CENTER);
		vb.getChildren().addAll(hb1,hb2,hb3);
		vb.setPadding(new Insets(50));
		
		setContent(vb);
		
		
	}	
	
	
}
