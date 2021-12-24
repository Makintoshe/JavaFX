package Model;

import java.util.ArrayList;
import java.util.List;

import application.AppObserver;

// TODO: Auto-generated Javadoc
/**
 * The Class AppModel.
 */
public class AppModel {
	
	/** The observers. */
	private List<AppObserver> observers = new ArrayList<>();
	
	/** The l. */
	private double l;
	
	/** The h. */
	private double h;
	
	/**
	 * Sets the dimension.
	 *
	 * @param l the l
	 * @param h the h
	 */
	public void setDimension(double l, double h) {
		this.l = l;
		this.h = h;
		notifyObservers();
	}

	/**
	 * Gets the l.
	 *
	 * @return the l
	 */
	public double getL() {
		return l;
	}


	/**
	 * Gets the h.
	 *
	 * @return the h
	 */
	public double getH() {
		return h;
	}


	/**
	 * Adds the observer.
	 *
	 * @param observer the observer
	 */
	public void addObserver(AppObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}


	/**
	 * Notify observers.
	 */
	private void notifyObservers() {
		for (AppObserver observer : observers) {
			observer.update(this);
		}
	}
	
}
