package TP2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InputTab extends Tab{
	
	public InputTab() {
		// TODO Auto-generated constructor stub
	
		super();
		setText("Input");
		myInputTab();
	
	}
	
	public void myInputTab() {
		
		HBox hb1 = new HBox(5);
		HBox hb2 = new HBox(5);
		HBox hb3 = new HBox(5);
		
		//
		Label lblName = new Label("Name");
		Label lblMobile = new Label("Mobile");
		TextField tfName = new TextField();
		tfName.setPromptText("firstname/lastname");
		TextField tfMobile = new TextField();
		tfMobile.setPromptText("Mobile n°");
		tfName.setPrefColumnCount(12);
		tfMobile.setPrefColumnCount(8);
		HBox.setMargin(lblMobile, new Insets(0, 0, 0, 10));
		hb1.setAlignment(Pos.CENTER);
		hb1.setPadding(new Insets(10));
		hb1.getChildren().addAll(lblName,tfName,lblMobile,tfMobile);
		
		//
		Label lblPassW = new Label("Password");
		PasswordField pfPwd = new PasswordField();
		pfPwd.setPrefColumnCount(20);
		hb2.setAlignment(Pos.CENTER);
		hb2.setPadding(new Insets(10));
		hb2.getChildren().addAll(lblPassW,pfPwd);
		
		//
		Label lblMl = new Label("Text multi-lignes");
		TextArea ta = new TextArea();
		ta.setPrefRowCount(8);
		ta.setPrefColumnCount(14);
		ta.setWrapText(true);
		hb3.setAlignment(Pos.CENTER);
		hb3.setPadding(new Insets(10));
		hb3.getChildren().addAll(lblMl,ta);
		
		
		VBox vb = new VBox();
		vb.getChildren().addAll(hb1,hb2,hb3);
		
		setContent(vb);
		
	}
	
}
