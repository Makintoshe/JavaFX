package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.BinaryOperation;
import model.UnaryOperation;

import application.OperationObserver;
import controller.OperationController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class Gui.
 */
public class Gui implements OperationObserver {

	/** The controller. */
	private OperationController controller;

	/** The txtf. */
	@FXML
	private TextField txtf;

	/** The txta. */
	@FXML
	private TextArea txta;

	/** The del ete. */
	@FXML
	private Button del_ete;
	
	/** The eg ale. */
	@FXML
	private Button eg_ale;
	
	/** The any btn. */
	private Button anyBtn;

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(OperationController controller) {
		this.controller = controller;
	}

	/**
	 * Inits the text area field.
	 */
	public void initTextAreaField() {
		txta.setText("");
		txtf.setText("");
	}

	/**
	 * Inits the text field.
	 */
	public void initTextField() {
		txtf.setText("");
	}

	/**
	 * Sets the text area.
	 *
	 * @param value the new text area
	 */
	@SuppressWarnings("deprecation")
	public void setTextArea(String value) {

		txta.appendText("\n" + value);

	}

	/**
	 * Sets the append text field.
	 *
	 * @param value the new append text field
	 */
	public void setAppendTextField(String value) {

		txtf.appendText("\n" + value);

	}

	/**
	 * Sets the text field.
	 *
	 * @param value the new text field
	 */
	public void setTextField(String value) {

		txtf.setText(value);

	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return txtf.getText();
	}

	/**
	 * Gets the operator.
	 *
	 * @param btn the btn
	 * @return the operator
	 */
	public String getOperator(Object btn) {
		anyBtn = (Button) btn;
		return anyBtn.getText();
	}

	/**
	 * Gets the digit.
	 *
	 * @param btn the btn
	 * @return the digit
	 */
	public String getDigit(Object btn) {
		anyBtn = (Button) btn;
		return anyBtn.getText();
	}

	/**
	 * Sets the digit.
	 *
	 * @param actionEvent the new digit
	 */
	public void setDigit(ActionEvent actionEvent) {
		try {
			controller.buttonManager(actionEvent);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Sets the operateur.
	 *
	 * @param actionEvent the new operateur
	 */
	public void setOperateur(ActionEvent actionEvent) {
		try {
			controller.OperatorManager(actionEvent);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Clear.
	 *
	 * @param actionEvent the action event
	 */
	public void clear(ActionEvent actionEvent) {
		try {
			controller.effacer(actionEvent);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the resultat.
	 *
	 * @param actionEvent the action event
	 * @return the resultat
	 */
	public void getResultat(ActionEvent actionEvent) {
		try {
			controller.calculer(actionEvent);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Update uop.
	 *
	 * @param uOp the u op
	 */
	@Override
	public void updateUop(UnaryOperation uOp) {
		// TODO Auto-generated method stub
		// System.out.println("Thread Unary : "+uOp.toString());//uOp.getResult());
		if (uOp.toString() != null) {
			setTextArea(uOp.toString());
		}

	}

	/**
	 * Update bop.
	 *
	 * @param bOp the b op
	 */
	@Override
	public void updateBop(BinaryOperation bOp) {
		// TODO Auto-generated method stub
		// System.out.println("Thread Binary : "+bOp.toString());//bOp.getResultat());
		if (bOp.toString() != null) {
			setTextArea(bOp.toString());
		}
	}

}
