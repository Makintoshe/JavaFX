package model;

import java.util.ArrayList;
import java.util.List;

import application.OperationObserver;


// TODO: Auto-generated Javadoc
/**
 * The Class GlobalOperationModel.
 */
public class GlobalOperationModel {
	

	/** The model U. */
	UnaryOperation modelU;
	
	/** The model B. */
	BinaryOperation modelB;
	
	/**
	 * Instantiates a new global operation model.
	 */
	public GlobalOperationModel() {
		// TODO Auto-generated constructor stub
		modelU = new UnaryOperation();
		modelB = new BinaryOperation();
	}
	
	/**
	 * Adds the observer.
	 *
	 * @param observer the observer
	 */
	public void addObserver(OperationObserver observer) {
		modelU.addObserver(observer);
		modelB.addObserver(observer);
	}	

/**
 * Gets the unary operation model.
 *
 * @return the unary operation model
 */
//
	public UnaryOperation getUnaryOperationModel() {
		return modelU;		
	}
	
	/**
	 * Gets the binary operation model.
	 *
	 * @return the binary operation model
	 */
	public BinaryOperation getBinaryOperationModel() {
		return modelB;
	}
	
}
