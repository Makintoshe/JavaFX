/**
 * 
 */
package TP1;


import java.awt.FlowLayout;


import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Ketsia
 *
 */
public class exo5_3 extends Application {
    

    @Override
    public void start(Stage mainStage) {
    	
    	mainStage.setTitle("Hello FlowPane");
    	
    	//VBox root = new VBox(); 	
    	
    	HBox root = new HBox();
    	
    	Label lbl = new Label("Label");
    	root.getChildren().add(lbl);
    	
    	for (int i = 0; i<= 9; i++) {
			root.getChildren().add(new Button("Button"+(i+1)));
		}
    	
    	root.setMargin(lbl, new Insets(10, 10, 10, 10));
    	
    	Scene scene = new Scene(root, 800, 400);
    	
    	mainStage.setScene(scene);
    	mainStage.show();
    	
    }

    public static void main(String[] args) {
        launch();
    }

}