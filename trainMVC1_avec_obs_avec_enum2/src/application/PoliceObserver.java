package application;

import Model.Police;

// TODO: Auto-generated Javadoc
/**
 * An asynchronous update interface for receiving notifications
 * about Police information as the Police is constructed.
 */
public interface PoliceObserver {
	
	/**
	 * This method is called when information about an Police
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param police the police
	 */
	public void update(Police police);
}
