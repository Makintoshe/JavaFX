package View;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import Model.Police;
import application.PoliceObserver;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

// TODO: Auto-generated Javadoc
/**
 * The Class PoliceView.
 */
public class PoliceView extends BorderPane implements PoliceObserver {

	/** The couleur buttons. */
	private Map<RadioButton, CouleurRadio> couleurButtons = new HashMap<RadioButton, CouleurRadio>();

	/** The buttons couleur. */
	private Map<CouleurRadio, RadioButton> buttonsCouleur = new EnumMap<CouleurRadio, RadioButton>(CouleurRadio.class);

	/** The italique check box. */
	//
	private CheckBox grasCheckBox, italiqueCheckBox;

	/** The text field. */
	//
	private TextField textField = new TextField();

	/** The label. */
	//
	private Label label = new Label();
	//

	/**
	 * Instantiates a new police view.
	 */
	public PoliceView() {

		// TODO Auto-generated constructor stub

		/********************* Conteneur section *********************/

		VBox vbox = new VBox(5);
		VBox vboxTXT = new VBox(5);
		VBox vboxtRB = new VBox(5);
		VBox vboxCB = new VBox(5);
		HBox hbox = new HBox();

		/***************** Couleur section *******************/

		for (CouleurRadio c : CouleurRadio.values()) {
			RadioButton btn = new RadioButton(c.toString().toLowerCase());
			couleurButtons.put(btn, c);
			buttonsCouleur.put(c, btn);
		}

		/***************** Font section *******************/

		grasCheckBox = new CheckBox(FontBox.GRAS.toString().toLowerCase());
		italiqueCheckBox = new CheckBox(FontBox.ITALIQUE.toString().toLowerCase());

		vboxCB.getChildren().addAll(grasCheckBox, italiqueCheckBox);

		/***************** TextField section *******************/

		// on ajoute le textfield
		vboxTXT.getChildren().add(textField);

		// on ajoute les radiobuttons
		ToggleGroup rg = new ToggleGroup();

		for (CouleurRadio c : CouleurRadio.values()) {
//        	if(c==CouleurRadio.rouge)        		
//        		buttonsCouleur.get(c).setSelected(true);
			buttonsCouleur.get(c).setToggleGroup(rg);
			vboxtRB.getChildren().add(buttonsCouleur.get(c));
		}

		/***************** Label section *******************/

		// on ajoute le label : Bonjour Master SID
		// label.setText("");
		label.setFont(Font.font("SansSerif", 25));
		label.setTextFill(Color.rgb(0, 0, 0));
		hbox.getChildren().add(label);
		hbox.setAlignment(Pos.CENTER);
		hbox.setMargin(label, new Insets(5, 0, 0, 0));

		/***************** Root section *******************/

		vbox.getChildren().addAll(vboxTXT, vboxCB, vboxtRB);
		vbox.setAlignment(Pos.CENTER);
		vbox.setMargin(textField, new Insets(0, 0, 5, 0));

		// on ajoute les composants dans le BorderPane : conteneur principal
		this.setLeft(vbox);
		this.setCenter(hbox);
		this.setAlignment(vbox, Pos.CENTER_LEFT);
		this.setAlignment(hbox, Pos.CENTER);
		this.setMargin(vbox, new Insets(0, 0, 0, 20));

	}

	/**
	 * The Enum FontBox.
	 */
	enum FontBox {

		/** The gras. */
		GRAS,
		/** The italique. */
		ITALIQUE;
	}

	/**
	 * The Enum CouleurRadio.
	 */
	enum CouleurRadio {

		/** The bleu. */
		BLEU,
		/** The vert. */
		VERT,
		/** The rouge. */
		ROUGE,
		/** The jaune. */
		JAUNE;
	}

	/**
	 * Gets the text in text field.
	 *
	 * @return the text in text field
	 */
	public String getTextInTextField() {
		return textField.getText();
	}

	/**
	 * Sets the label text.
	 *
	 * @param texte the new label text
	 */
	public void setLabelText(String texte) {
		label.setText(texte);
	}

	/**
	 * Sets the label color.
	 *
	 * @param c the new label color
	 */
	public void setLabelColor(int c) {
		switch (c) {
		case 0: // BLUE
			label.setTextFill(Color.rgb(30, 114, 255));
			break;
		case 1: // YELLOW
			label.setTextFill(Color.rgb(34, 139, 34));
			break;
		case 2: // RED
			label.setTextFill(Color.rgb(255, 69, 0));
			break;
		case 3: // GREEN
			label.setTextFill(Color.rgb(255, 255, 0));
			break;
		default: // BLACK
			label.setTextFill(Color.rgb(0, 0, 0));
			break;
		}
	}

	/**
	 * Sets the label style.
	 *
	 * @param checkBold the check bold
	 * @param checkIt   the check it
	 */
	public void setLabelStyle(boolean checkBold, boolean checkIt) {
		if (checkBold == true && checkIt == true) {
			label.setFont(Font.font("SansSerif", FontWeight.BOLD, FontPosture.ITALIC, 25));
		} else if (checkBold == true && checkIt == false) {
			label.setFont(Font.font("SansSerif", FontWeight.BOLD, FontPosture.REGULAR, 25));
		} else if (checkBold == false && checkIt == true) {
			label.setFont(Font.font("SansSerif", FontWeight.NORMAL, FontPosture.ITALIC, 25));
		} else if (checkBold == false && checkIt == false) {
			label.setFont(Font.font("SansSerif", FontWeight.NORMAL, FontPosture.REGULAR, 25));
		}
	}

	/**
	 * Gets the fontgras event.
	 *
	 * @param handler the handler
	 * @return the fontgras event
	 */
	public void getFontgrasEvent(EventHandler<ActionEvent> handler) {
		grasCheckBox.setOnAction(handler);
	}

	/**
	 * Gets the fontitalic event.
	 *
	 * @param handler the handler
	 * @return the fontitalic event
	 */
	public void getFontitalicEvent(EventHandler<ActionEvent> handler) {
		italiqueCheckBox.setOnAction(handler);
	}

	/**
	 * Gets the text of object.
	 *
	 * @param obj the obj
	 * @return the text of object
	 */
	public String getTextOfObject(Object obj) {
		if (obj instanceof RadioButton) {
			return ((RadioButton) obj).getText();
		} else if (obj instanceof CheckBox) {
			if (((CheckBox) obj).isSelected()) {
				return ((CheckBox) obj).getText();
			} else if (!((CheckBox) obj).isSelected()) {
				return null;
			}
		}
		return null;
	}

	/**
	 * Gets the color event.
	 *
	 * @param handler the handler
	 * @return the color event
	 */
	public void getColorEvent(EventHandler<ActionEvent> handler) {
		try {
			for (RadioButton rb : couleurButtons.keySet()) {
				rb.setOnAction(handler);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Update.
	 *
	 * @param policeModel the police model
	 */
	@Override
	public void update(Police policeModel) {
		// TODO Auto-generated method stub
		try {
			setLabelColor(policeModel.getCouleur());
			setLabelStyle(policeModel.getFw(), policeModel.getFp());
			setLabelText(policeModel.getTexte());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
