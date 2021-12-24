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
public class exo4 extends Application {
    

    @Override
    public void start(Stage mainStage) {
    	
    	mainStage.setTitle("Hello World!");
    	
    	//
    	BorderPane root =  new BorderPane();
    	Text txt = new Text("Hello World");
    	txt.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
    	txt.setFill(Color.BLUE);
    	//txt.setY(100);
    	//txt.setX(100);
    	
    	Screen screen = Screen.getPrimary();
    	mainStage.setX(570);
    	mainStage.setY(0);
    	    	
    	//Scene scene = new Scene(new Pane(txt),400,200);
    	Scene scene = new Scene(new BorderPane(txt),400,200);
    	
    	mainStage.setScene(scene);    	
    	mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}