package controller;

import java.util.EventObject;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.BinaryOperation;
import model.GlobalOperationModel;
import model.Operator;
import model.UnaryOperation;
import view.Gui;
	
// TODO: Auto-generated Javadoc
/**
 * The Class OperationController.
 */
public class OperationController {

	/** The binary op. */
	private BinaryOperation binaryOp;
	
	/** The unary op. */
	private UnaryOperation unaryOp;
	
	/** The operator. */
	private Operator operator;
	
	/** The model. */
	private GlobalOperationModel model;

	/** The vue. */
	private Gui vue;
	
	/** The button txt. */
	private String button_Txt;
	
	/** The ordre. */
	private int ordre = 0;

	/** The check operande. */
	public static boolean checkOperande = false;

	/**
	 * Instantiates a new operation controller.
	 */
	//
	public OperationController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(GlobalOperationModel model) {
		this.model = model;
		setBinaryOp(model.getBinaryOperationModel());
		setUnaryOp(model.getUnaryOperationModel());
	}
	
	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	public void setView(Gui view) {
		init(view);
	}


	/**
	 * Inits the.
	 *
	 * @param vue the vue
	 */
	// à chaque boutton le bon gestionnaire
	public void init(Gui vue) {	
		this.vue= vue; 
	}

	/**
	 * Sets the binary op.
	 *
	 * @param binaryOp the new binary op
	 */
	public void setBinaryOp(BinaryOperation binaryOp) {
		this.binaryOp = binaryOp;
	}

	/**
	 * Sets the unary op.
	 *
	 * @param unaryOp the new unary op
	 */
	public void setUnaryOp(UnaryOperation unaryOp) {
		this.unaryOp = unaryOp;
	}
	
	/**
	 * Operator manager.
	 *
	 * @param actionEvent the action event
	 */
	public void OperatorManager(ActionEvent actionEvent) {
		Object source_event = actionEvent.getSource();
		button_Txt = vue.getOperator(source_event);
		double digit1=0;
		try {
			if(vue.getText()=="") {
				digit1 = 0;
			}else {
				digit1 = Double.parseDouble(vue.getText());	
			}
			switch (button_Txt) {
			case "/":
				this.operator = Operator.getEnum(button_Txt);
				binaryOp.Bchiffre1(digit1);
				break;
			case "*":
				this.operator = Operator.getEnum(button_Txt);
				binaryOp.Bchiffre1(digit1);
				break;
			case "-":
				this.operator = Operator.getEnum(button_Txt);
				binaryOp.Bchiffre1(digit1);
				break;
			case "+":
				this.operator = Operator.getEnum(button_Txt);
				binaryOp.Bchiffre1(digit1);
				break;
			case "sin":
				checkOperande = true;
				this.operator = Operator.getEnum(button_Txt);
				unaryOp.Uchiffre1(digit1);
				break;
			case "X^2":
				checkOperande = true;
				this.operator = Operator.getEnum(button_Txt);
				unaryOp.Uchiffre1(digit1);
				break;
			case "sqrt":
				checkOperande = true;
				this.operator = Operator.getEnum(button_Txt);
				unaryOp.Uchiffre1(digit1);
				break;

			}
			vue.initTextField();
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ATTENTION!");
			alert.setHeaderText(null);
			alert.setContentText("Pas plus d'une virgule, au moins un Chiffre, pas de (a/0) et, ne pas commencer avec un opérateur.");
			alert.showAndWait().ifPresent(rs -> {
			        System.out.println("Erreur ::: Une règle de calcul n'est pas respectée au niveau de Controller.OperatorManager");
			});
		}

	}
	
	/**
	 * Effacer.
	 *
	 * @param actionEvent the action event
	 */
	//
    public void effacer(ActionEvent actionEvent) {
    	vue.initTextAreaField();
    }
	
	/**
	 * Calculer.
	 *
	 * @param actionEvent the action event
	 */
	public void calculer(ActionEvent actionEvent) {	
		try {
			if(checkOperande==true) {
				String resultat = unaryOp.calculate(this.operator);
				//vue.setTextArea(resultat);
				vue.initTextField();
			}else if(checkOperande==false) {
				binaryOp.Bchiffre2(Double.parseDouble(vue.getText()));
				String resultat = binaryOp.calculate(this.operator);
				//vue.setTextArea(resultat);
				vue.initTextField();
			}
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ATTENTION!");
			alert.setHeaderText(null);
			alert.setContentText("Erreur au niveau de Controller.calculer");
			alert.showAndWait().ifPresent(rs -> {
			        System.out.println("Erreur ::: une opération de Calcul ne s'est pas effectuée au niveau de Controller.Calcul...");
			});
		}

	}

    
	/**
	 * Button manager.
	 *
	 * @param actionEvent the action event
	 */
	//afficher la valeur du bouton actionné dans le textfield
	public void buttonManager(ActionEvent actionEvent) {
		try {
			Object source_event = actionEvent.getSource();
			button_Txt = vue.getDigit(source_event);
			vue.setAppendTextField(button_Txt);			
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ATTENTION!");
			alert.setHeaderText(null);
			alert.setContentText("Erreur au niveau de Controller.buttonManager");
			alert.showAndWait().ifPresent(rs -> {
			        System.out.println("Operande ou Operateur");
			});
			
		}
	}

}
