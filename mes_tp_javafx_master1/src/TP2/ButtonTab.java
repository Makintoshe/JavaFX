package TP2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class ButtonTab extends Tab{

	public ButtonTab() {
		// TODO Auto-generated constructor stub
		
		super();
		setText("Button");
		myButtonTab();
		
	}
	
	public void myButtonTab() {
		
		HBox hb = new HBox(5);
		VBox vb = new VBox(10);
		
		//		
		Button btnV = new Button("Valider");
		btnV.setTextFill(Color.GREEN);
		btnV.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		
		Button btnA = new Button("Annuler");
		btnA.setTextFill(Color.RED);
		btnA.setFont(Font.font("Arial", FontWeight.BOLD, 11));
		

		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(btnV,btnA);
		
		//				
    	Image image = new Image(getClass().getResourceAsStream("maison.png"));
    	ImageView iv = new ImageView(image);
    	iv.setFitHeight(50);
    	iv.setFitWidth(50);
    	iv.preserveRatioProperty();
    	Button btnImg = new Button();
    	btnImg.setGraphic(iv);
		
		//		
		Button btnTxt = new Button("A button label that is too long");
		btnTxt.setWrapText(true);
		btnTxt.setTextAlignment(TextAlignment.CENTER);
		btnTxt.setMaxWidth(80);
		
		//
		vb.setAlignment(Pos.CENTER);
		vb.setPadding(new Insets(10));
		vb.getChildren().addAll(hb,btnImg,btnTxt);
		
		//
		setContent(vb);	
		
		
	}
	
	
}
