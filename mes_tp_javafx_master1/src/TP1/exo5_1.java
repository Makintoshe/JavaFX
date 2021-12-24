/**
 * 
 */
package TP1;


import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
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
public class exo5_1 extends Application {
    

    @Override
    public void start(Stage mainStage) {

    	mainStage.setTitle("Hello Layouts");
    	
    	BorderPane root = new BorderPane();
    	Button btn1, btn2, btn3, btn4, btn5;
    	
    	//
    	btn1 = new Button("Top");
    	btn2 = new Button("Left");
    	btn3 = new Button("Rigth");
    	btn4 = new Button("Center");
    	btn5 = new Button("Bottom");
    	
    	//Add Buttons on borderPan
    	root.setTop(btn1);
    	root.setLeft(btn2);
    	root.setRight(btn3);
    	root.setCenter(btn4);
    	root.setBottom(btn5);
    	
    	//Margin Manage
    	btn1.setMaxSize(800,btn1.USE_PREF_SIZE);//btn1.USE_PREF_SIZE);
    	btn2.setMaxSize(btn2.USE_PREF_SIZE, 400);
    	btn4.setMaxSize(800, 400);
    	btn3.setMaxSize(btn3.USE_PREF_SIZE, 400);
    	btn5.setMaxSize(800, btn5.USE_PREF_SIZE);
    	
    	//Alignement of Buttons
    	root.setAlignment(btn1, Pos.TOP_CENTER);
    	root.setAlignment(btn2, Pos.CENTER_LEFT);
    	root.setAlignment(btn3, Pos.CENTER_RIGHT);
    	root.setAlignment(btn4, Pos.CENTER);
    	root.setAlignment(btn5, Pos.BOTTOM_CENTER);
    	
    	
    	Scene scene = new Scene(root, 800, 400);
    	
    	mainStage.setScene(scene);
    	mainStage.setY(200);
    	mainStage.setX(360);
    	
    	
    	mainStage.show();    	

    }

    public static void main(String[] args) {
        launch();
    }

}