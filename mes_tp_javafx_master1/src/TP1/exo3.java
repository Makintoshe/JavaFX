/**
 * 
 */
package TP1;


import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Ketsia
 *
 */
public class exo3 extends Application {
    

    @Override
    public void start(Stage mainStage) {
    	
    	//title of main window
    	mainStage.setTitle("Hello Stage");
    	
    	//main window maximized
    	mainStage.setMaximized(true);
    	mainStage.setHeight(Screen.getPrimary().getBounds().getMaxY());
    	mainStage.setWidth(Screen.getPrimary().getBounds().getMaxX());

    	//main window not resizable
    	mainStage.setResizable(false);
    	
    	//main window visible
    	mainStage.show();
    	
    	//seconde stage
    	Stage secondeStage = new Stage();
    	
    	//seconde stage title
    	secondeStage.setTitle("Hello Dialog");    	
    	
    	//Modality : Declare my second stage like a modal window
    	secondeStage.initModality(Modality.WINDOW_MODAL);
    	
    	//Owner : main Stage is owner of seconde stage
    	secondeStage.initOwner(mainStage);
    	
    	// print stage
    	mainStage.show();
    	secondeStage.show();
    	
    }

    public static void main(String[] args) {
        launch();
    }

}