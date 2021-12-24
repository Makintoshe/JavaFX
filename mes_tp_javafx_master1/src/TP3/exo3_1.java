package TP3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class exo3_1  extends Tab {

	public exo3_1() {
		
		setText("Exo. 1");
		
		BorderPane root = new BorderPane();
		
		TextArea ta = new TextArea();
		
		//MonTxtAreaEvent mtae = new MonTxtAreaEvent()
		//ta.setOnKeyPressed(MaClasseTA::MethodeDeMaClasse);
		ta.setOnKeyPressed(MonTxtAreaEvent::cliquer);
		ta.setOnKeyReleased(MonTxtAreaEvent::lacher);
		
		root.setCenter(ta);
		
		setContent(root);
		
		
	}


}