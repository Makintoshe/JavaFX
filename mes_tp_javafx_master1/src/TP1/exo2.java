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
public class exo2 extends Application {
    
    @Override
    public void init() {
        System.out.println("Initialization (init())");
    }

    @Override
    public void start(Stage mainStage) {
        System.out.println("Running (start(Stage))");

        // Title of the window
        mainStage.setTitle("My First JavaFX App");

        // Start by building the "Hello JavaFX" button
        Button btnHello = new Button("Hello JavaFX");

        // It can be resized, and we can add a background and a border (inherit from Region)
        btnHello.setPrefSize(160,50);
        btnHello.setBorder(new Border(new BorderStroke(Color.DARKRED, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
        btnHello.setPadding(new Insets(20));

        // Define the main container (e.g. any layout-pane) and add the button
        BorderPane root = new BorderPane();
        root.setCenter(btnHello);

        // Build the Scene by giving the root pane
        Scene scene = new Scene(root, 300, 100);

        // Finally, set the Scene in the Stage and show the window
        mainStage.setScene(scene);
        mainStage.show();
    }

    @Override
    public void stop() {
        System.out.println("Closing (stop())");
    }

    public static void main(String[] args) {
        launch();
    }

}