package TP3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main3  extends Application {

	public void start(Stage mainStage) throws Exception {
		
		mainStage.setTitle("TP3 - Events");
		
		exo3_4 tab4 = new exo3_4();
		exo3_3 tab3 = new exo3_3();
		exo3_2 tab2 = new exo3_2();
		exo3_1 tab1 = new exo3_1();
		
		
		TabPane tp = new TabPane();
		tp.getTabs().addAll(tab1,tab2,tab3,tab4);
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		tp.setSide(Side.BOTTOM);		
		
				
		Scene scene = new Scene(tp, 400, 400);
		//
		mainStage.setScene(scene);
		//
		mainStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}


}