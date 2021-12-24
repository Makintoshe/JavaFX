package TP3;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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

public class exo3_3 extends Tab {

	public exo3_3() {
		
		setText("Exo. 3");
		
		BorderPane root = new BorderPane();
		
		TextArea ta = new TextArea();
		ta.setMaxHeight(0);
		
		final Canvas canvas = new Canvas(500,500);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		EventHandler<MouseEvent> actionCanvas = new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("*****A focus*****");
				double X = arg0.getX();
				System.out.println("X = "+X);
				double Y = arg0.getY();
				System.out.println("Y = "+Y);
				//dimension
				int dim = Integer.parseInt(ta.getText().toString());
				//
				System.out.println(dim);
				//
				gc.fillOval(X, Y, dim, dim);
			}
		};
		
		canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, actionCanvas);
		
		
		gc.setFill(Color.BLACK);
		
		root.setTop(ta);
		root.setCenter(canvas);
		root.setMargin(ta, new Insets(0, 0, -10, 0));
		
					
		setContent(root);
		
	}


}
