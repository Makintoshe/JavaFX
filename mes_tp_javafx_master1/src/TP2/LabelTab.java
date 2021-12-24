package TP2;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
  
public class LabelTab extends Tab{

		
		public LabelTab() {
			
			super();   				
			setText("Label");
			myLabelTab();
			
		}
		
		public void myLabelTab() {
				
			
	    	VBox vbLbl = new VBox(20);
	    	FlowPane fpLbl = new FlowPane(Orientation.HORIZONTAL);
	    	
	    	Image image = new Image(getClass().getResourceAsStream("maison.png"));
	    	ImageView iv = new ImageView(image);
	    	iv.setFitHeight(50);
	    	iv.setFitWidth(50);
	    	iv.preserveRatioProperty();
	    	Label lblHouse = new Label();
	    	lblHouse.setGraphic(iv);
	    	lblHouse.setText("Home");
	    	
	    	Label lblStyle = new Label("Style Label");
	    	lblStyle.setFont(Font.font("SansSerif", FontWeight.BOLD, 20)); //Serif
	    	lblStyle.setTextFill(Color.rgb(180, 50, 50));
	    	lblStyle.setGraphic(new javafx.scene.shape.Rectangle(80, 2, Color.ORANGE)); //100,2
	    	lblStyle.setContentDisplay(ContentDisplay.BOTTOM);
	    		    	
	    	String txt = "A label that need to be wrapped because it's too long to hold in a single line";
	    	Label lblTxt = new Label(txt);
	    	lblTxt.setWrapText(true);
	    	lblTxt.setTextAlignment(TextAlignment.LEFT);
	    	lblTxt.setMaxWidth(123); //150
	    	
	    	vbLbl.setAlignment(Pos.CENTER);
	    	vbLbl.setPadding(new Insets(40,10,30,10));
	    	vbLbl.getChildren().addAll(lblHouse,lblStyle,lblTxt);
	    	
	    	setContent(vbLbl);
	    	
	    
		}
}
