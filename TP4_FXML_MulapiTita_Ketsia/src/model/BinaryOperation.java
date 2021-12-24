package model;

import java.util.ArrayList;
import java.util.List;

import application.OperationObserver;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

// TODO: Auto-generated Javadoc
/**
 * The Class BinaryOperation.
 */
public class BinaryOperation extends AbstractOperation {

	/** The b observers. */
	private List<OperationObserver> bObservers = new ArrayList<>();

	/** The screen. */
	public String screen;

	/**
	 * Instantiates a new binary operation.
	 */
	public BinaryOperation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Bchiffre 1.
	 *
	 * @param operande the operande
	 */
	public void Bchiffre1(double operande) {
		// assert ;
		setNombre1(operande);
	}

	/**
	 * Bchiffre 2.
	 *
	 * @param operande the operande
	 */
	public void Bchiffre2(double operande) {
		setNombre2(operande);
	}

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public double getResult() {
		return getResultat();
	}

	/**
	 * Calculate.
	 *
	 * @param op the op
	 * @return the string
	 */
	@Override
	public String calculate(Operator op) {
		// TODO Auto-generated method stub		
		try {
			switch (op.ordinal()) {
			case 0:
				setResultat(getNombre1() + getNombre2());
				return toString(op, getNombre1(), getNombre2(), getResultat());
			case 1:
				setResultat(getNombre1() - getNombre2());
				return toString(op, getNombre1(), getNombre2(), getResultat());
			case 2:
				setResultat(getNombre1() * getNombre2());
				return toString(op, getNombre1(), getNombre2(), getResultat());
			case 3:
				if (getNombre2() == 0)			
					return "division par 0 impossible!";
				setResultat(getNombre1() / getNombre2());
				return toString(op, getNombre1(), getNombre2(), getResultat());
			default:
				return MSG_ERROR;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return MSG_ERROR;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getStringRes();
	}

	/**
	 * To string.
	 *
	 * @param op the op
	 * @param value the value
	 * @return the string
	 */
	@Override
	public String toString(Operator op, double... value) {
		// TODO Auto-generated method stub
		screen = value[0] + " " + op.getOperationDescription() + " " + value[1] + " = " + value[2];
		setStringRes(screen);
		return screen;
	}

	/**
	 * Adds the observer.
	 *
	 * @param observer the observer
	 */
	public void addObserver(OperationObserver observer) {
		if (!bObservers.contains(observer)) {
			bObservers.add(observer);
		}
	}

	/**
	 * Notify observers.
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (OperationObserver observer : bObservers) {
			observer.updateBop(this);
		}
	}

}
