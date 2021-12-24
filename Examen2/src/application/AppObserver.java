package application;

import Model.AppModel;

// TODO: Auto-generated Javadoc
/**
 * An asynchronous update interface for receiving notifications
 * about App information as the App is constructed.
 */
public interface AppObserver {
	
	/**
	 * This method is called when information about an App
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param model the model
	 */
	public void update(AppModel model);
}
