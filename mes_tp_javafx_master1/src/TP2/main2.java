/**
 * 
 */
package TP2;

import java.awt.FlowLayout;
import java.util.Iterator;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Ketsia
 *
 */
public class main2 extends Application {

	@Override
	public void start(Stage mainStage) throws Exception {

		mainStage.setTitle("Controls demo");

		MonMenu menuBar = new MonMenu();

		LabelTab lbltab = new LabelTab();
		ButtonTab tabBtn = new ButtonTab();
		BoxTab tabBx = new BoxTab();
		InputTab tabInp = new InputTab();

		TabPane tp = new TabPane();
		tp.getTabs().addAll(lbltab, tabBtn, tabBx, tabInp);// tabLbl
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		tp.setSide(Side.BOTTOM);

		CtxtMenu cm = new CtxtMenu();
		tp.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				cm.show(tp, e.getScreenX(), e.getScreenY());
			}
		});

		VBox root = new VBox();
		root.getChildren().addAll(menuBar, tp);
		//

		Scene scene = new Scene(root, 400, 287);
		//
		mainStage.setScene(scene);
		//
		mainStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}