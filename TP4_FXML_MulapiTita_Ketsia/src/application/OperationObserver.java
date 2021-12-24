package application;

import model.BinaryOperation;
import model.UnaryOperation;

// TODO: Auto-generated Javadoc
/**
 * An asynchronous update interface for receiving notifications
 * about Operation information as the Operation is constructed.
 */
public interface OperationObserver {
	
	/**
	 * This method is called when information about an Operation
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param Uop the uop
	 */
	public void updateUop(UnaryOperation Uop);

	/**
	 * This method is called when information about an Operation
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param Bop the bop
	 */
	public void updateBop(BinaryOperation Bop);
}
