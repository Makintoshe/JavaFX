package TP1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class exo5_5 extends Application {

	@Override
	public void start(Stage mainStage) {

		mainStage.setTitle("Hello Layouts");

		GridPane root = new GridPane();

		root.setHgap(5);
		root.setVgap(5);
//
		root.setPadding(new Insets(15, 15, 15, 15));
//root.setMargin(, new Insets(5)); 

//		ColumnConstraints col = new ColumnConstraints(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);// (min,pref,max)
//		RowConstraints row = new RowConstraints(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
////		for (int i = 0; i <= 5; i++) {
////			for (int j = 0; j < 5; j++) {
////				col.setHgrow(Priority.ALWAYS);
////				col.setPercentWidth(20);
////				row.setPercentHeight(20);
////				row.setVgrow(Priority.ALWAYS);
////				root.getColumnConstraints().add(col);
////				root.getRowConstraints().add(row);
////			}
////		}

		for (int i = 0; i < 5; i++) {
			ColumnConstraints col = new ColumnConstraints(Double.MAX_VALUE);
			col.setHgrow(Priority.ALWAYS);
			col.setPercentWidth(20);
			root.getColumnConstraints().addAll(col);
		}

		for (int i = 0; i <= 5; i++) {
			RowConstraints row = new RowConstraints(Double.MAX_VALUE);
			row.setVgrow(Priority.ALWAYS);
			row.setPercentHeight(20);
			root.getRowConstraints().addAll(row);
		}

		//ligne 0
		Button btn1 = new Button("Button 0");
		// btn1.setMaxSize(100, 100); // Double.MAX_VALUE
		btn1.setPrefSize(800, 200);
		root.add(btn1, 0, 0 , 2, 5);

		Button btn2 = new Button("Button 1");
		// btn2.setMaxSize(100, 100); // Double.MAX_VALUE
		btn2.setPrefSize(800, 200);
		root.add(btn2, 1, 0 , 0, 0);

		root.add(new Button("Button 1"), 1, 0 , 0, 0);
		root.add(new Button("Button 2"), 2, 0 , 0, 0);
		root.add(new Button("Button 3"), 3, 0 , 0, 0);
		root.add(new Button("Button 4"), 4, 0 , 0, 0);
		//ligne 1
		root.add(new Button("Button 5"), 1, 1 , 4, 0);
		//ligne 2 & 3
		root.add(new Button("Button 6"), 1, 2 , 2, 1);
		//ligne 2
		root.add(new Button("Button 7"), 3, 2 , 4, 0);
		//ligne 3
		root.add(new Button("Button 8"), 3, 3 , 4, 0);
		//ligne 4
		root.add(new Button("Button 9"), 0, 4 , 1, 0);
		root.add(new Button("Button 10"), 2, 4 , 4, 0);
		//ligne 5
		root.add(new Button("Button 9"), 0, 5 , 4, 0);

		Scene scene = new Scene(root, 800, 400);

		mainStage.setScene(scene);
		mainStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
