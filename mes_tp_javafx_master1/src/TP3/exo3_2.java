package TP3;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class exo3_2 extends Tab {

	public exo3_2() {
		
		setText("Exo. 2");
		
		BorderPane root = new BorderPane();
		
		TextArea ta = new TextArea();
		
		ta.setPrefHeight(300);
		
		HBox hb_top = new HBox(10);
		HBox hb_foot = new HBox(10);
		
		VBox vb = new VBox(10);
		
		ta.setOnKeyPressed(MonTxtAreaEvent::cliquer);
		ta.setOnKeyReleased(MonTxtAreaEvent::lacher);
		
		Label lbl = new Label("Hello Event");
		lbl.setFont(Font.font("SansSerif", FontWeight.BOLD, 20));
		lbl.setTextFill(Color.BLUE);	
		
		hb_top.getChildren().add(lbl);
		HBox.setMargin(lbl, new Insets(15,15,15,15));
		hb_top.setAlignment(Pos.CENTER);
		
		Button btnInsert = new Button("Insert");
		Button btnDelete = new Button("Delete");
		Button btnQuit = new Button("Quit");
		
		btnInsert.addEventHandler(MouseEvent.MOUSE_CLICKED,FilterHandler.actionInsert_handler());
		btnInsert.addEventFilter(MouseEvent.MOUSE_CLICKED, FilterHandler.actionInsert_filter());
		//
		btnDelete.addEventFilter(MouseEvent.MOUSE_CLICKED, FilterHandler.actionDelete_filter());
		btnDelete.addEventHandler(MouseEvent.MOUSE_CLICKED, FilterHandler.actionDelete_handler());
		//
		btnQuit.addEventFilter(MouseEvent.MOUSE_CLICKED, FilterHandler.actionQuit_filter());
		btnQuit.addEventHandler(MouseEvent.MOUSE_CLICKED, FilterHandler.actionQuit_handler());
		//
		ta.addEventFilter(MouseEvent.MOUSE_CLICKED, FilterHandler.actionTxtArea_filter());
		ta.addEventHandler(MouseEvent.MOUSE_CLICKED, FilterHandler.actionTxtArea_handler());
		
		hb_foot.getChildren().addAll(btnInsert,btnDelete,btnQuit);
		hb_foot.setAlignment(Pos.CENTER_RIGHT);
		
		vb.getChildren().addAll(ta, hb_foot);
		
		root.setTop(hb_top);
		root.setCenter(vb);
		root.setAlignment(lbl, Pos.CENTER);
		root.setMargin(vb, new Insets(0, 15, 0, 15));
		root.setMargin(ta, new Insets(0,25,80,25));	
		
				
		setContent(root);
		
		
	}


}
