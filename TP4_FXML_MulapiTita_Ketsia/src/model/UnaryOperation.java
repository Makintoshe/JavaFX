package model;

import java.util.ArrayList;
import java.util.List;

import application.OperationObserver;

// TODO: Auto-generated Javadoc
/**
 * The Class UnaryOperation.
 */
public class UnaryOperation extends AbstractOperation {

	/** The u observers. */
	private List<OperationObserver> uObservers = new ArrayList<>();
	
	/** The screen. */
	public String screen;

	/**
	 * Instantiates a new unary operation.
	 */
	public UnaryOperation() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Uchiffre 1.
	 *
	 * @param operande the operande
	 */
	public void Uchiffre1(double operande) {
		setNombre1(operande);
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
			case 4:
				setResultat(Math.sin(getNombre1()));
				return toString(op, getNombre1(), getResultat());
			case 5:
				setResultat(Math.pow(getNombre1(), 2));
				return toString(op, getNombre1(), getResultat());
			case 6:
				setResultat(Math.sqrt(getNombre1()));
				return toString(op, getNombre1(), getResultat());
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
		screen = op.getOperationDescription() + " de " + value[0] + " = " + value[1];
		setStringRes(screen);
		return screen;
	}

	/**
	 * Adds the observer.
	 *
	 * @param observer the observer
	 */
	public void addObserver(OperationObserver observer) {
		if (!uObservers.contains(observer)) {
			uObservers.add(observer);
		}
	}

	/**
	 * Notify observers.
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (OperationObserver observer : uObservers) {
			observer.updateUop(this);
		}
	}

}
