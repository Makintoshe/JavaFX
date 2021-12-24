package View;

import Model.AppModel;
import application.AppObserver;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

// TODO: Auto-generated Javadoc
/**
 * The Class AppView.
 */
public class AppView extends BorderPane implements AppObserver {

	/** The hauteur. */
	private TextField largeur, hauteur;
	
	/** The btn clear. */
	private Button btnClear;
	
	/** The hauteur lbl. */
	private Label largeur_lbl, hauteur_lbl;
	
	/** The Tab color. */
	private static Color[] TabColor = new Color[10];
	
	/** The Drop Z. */
	private double DragX, DragY;
	
	/** The canvas. */
	final Canvas canvas;
	
	/** The gc. */
	private GraphicsContext gc;
	
	private boolean changeColor = false;

	/**
	 * Instantiates a new app view.
	 */
	public AppView() {
		// TODO Auto-generated constructor stub

		BorderPane root = new BorderPane();

		canvas = new Canvas(500, 300);
		gc = canvas.getGraphicsContext2D();

		HBox hb_top = new HBox(10);
		HBox hb_foot = new HBox(10);

		VBox vb = new VBox(10);
		
		btnClear = new Button("clear");
		largeur_lbl = new Label("Largeur");
		largeur = new TextField();
		hauteur_lbl = new Label("Hauteur");
		hauteur = new TextField();
	
		hb_foot.getChildren().addAll(btnClear,largeur_lbl,largeur,hauteur_lbl,hauteur);
		hb_foot.setAlignment(Pos.CENTER_LEFT);
		
		vb.getChildren().addAll(canvas, hb_foot);
		
		
		root.setTop(hb_top);
		root.setCenter(vb);
		root.setMargin(vb, new Insets(0, 15, 0, 15));	
		this.setCenter(root);
		
	}
	
	/**
	 * Gets the rect dimension in canvas.
	 *
	 * @param handler the handler
	 * @return the rect dimension in canvas
	 */
	public void getRectDimensionInCanvas(EventHandler<MouseEvent> handler) {
		try {
			canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
				this.DragX = event.getX();
				this.DragY = event.getY();
				canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, handler);
				});			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * Clear btn.
	 *
	 * @param handler the handler
	 */
	public void ClearBtn(EventHandler<ActionEvent> handler) {
		try {
			btnClear.setOnAction(handler);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * Adds the figure.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void addFigure(double x, double y) {
		try {
			if(changeColor==false) {
				gc.fillRect(this.DragX, this.DragY, x, y);
				gc.setFill(Color.BLUE);	
				changeColor=true;
			}else {
				gc.fillRect(this.DragX, this.DragY, x, y);
				gc.setFill(Color.RED);	
				changeColor=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the largeur in text field.
	 *
	 * @return the largeur in text field
	 */
	public double getLargeurInTextField() {
		try {
			if (largeur.getText().toString()!="") {
				return Double.parseDouble((largeur.getText().toString()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0.0;
	}

	/**
	 * Gets the hauteur in text field.
	 *
	 * @return the hauteur in text field
	 */
	public double getHauteurInTextField() {
		try {
			if (hauteur.getText().toString()!="") {
				return Double.parseDouble((hauteur.getText().toString()));
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0.0;
	}
	
	/**
	 * Clear canvas view.
	 */
	public void ClearCanvasView() {
		gc.clearRect(0, 0, 500,300);
	}

	/**
	 * Update.
	 *
	 * @param model the model
	 */
	@Override
	public void update(AppModel model) {
		// TODO Auto-generated method stub
		addFigure(model.getL(), model.getH());
	}

}
