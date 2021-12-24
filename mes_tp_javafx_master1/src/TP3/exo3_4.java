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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class exo3_4 extends Tab {
	
	double DragX, DragY, DropX, DropY, DragZ, DropZ;

	public exo3_4() {

		super();
		setText("Exo. 4");

		final Canvas canvas = new Canvas(500, 500);
//
		GraphicsContext gc = canvas.getGraphicsContext2D();

		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
			// dd.handle(event);
			DragX = event.getX();
			DragY = event.getY();
			addCircle(DragX, DragY, gc);
		});

		canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
			// dd.handle(event);
			DropX = event.getX();
			DropY = event.getY();
			addCircle(DropX, DropY, gc);
			addLine(DragX, DragY, DropX, DropY, gc);
		});

		setContent(canvas);

	}

	public void addLine(double DragX, double DragY, double DropX, double DropY, GraphicsContext gc) {
		gc.strokeLine(DragX, DragY, DropX, DropY);
		gc.setFill(Color.BLACK);
	}

	public void addCircle(double x, double y, GraphicsContext gc) {
		gc.fillOval(x, y, 10, 10);
		gc.setFill(Color.BLACK);
	}

}
