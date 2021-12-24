package Model;

import java.util.ArrayList;
import java.util.List;

import application.PoliceObserver;
import javafx.scene.paint.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Police.
 */
public class Police {

	/** The couleur. */
	private String couleur;
	
	/** The texte. */
	private String texte;
	
	/** The fw. */
	private boolean fw;
	
	/** The fp. */
	private boolean fp;
	
	/** The coul. */
	private int coul = 4;

	/** The observers. */
	private List<PoliceObserver> observers = new ArrayList<>();

	/**
	 * Gets the couleur.
	 *
	 * @return the couleur
	 */
	public int getCouleur() {
		return coul;
	}

	/**
	 * Sets the couleur.
	 *
	 * @param couleur the new couleur
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
		if (this.couleur.equals("bleu")){
			coul = Couleur.BLUE.ordinal();
		} else if(this.couleur.equals("jaune")) {
			coul = Couleur.YELLOW.ordinal();
		} else if (this.couleur.equals("rouge")) {
			coul = Couleur.RED.ordinal();			
		} else if (this.couleur.equals("vert")) {
			coul = Couleur.GREEN.ordinal();		
		} else {
			coul = 4;
		}
		notifyObservers();
	}

	/**
	 * Gets the texte.
	 *
	 * @return the texte
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * Sets the texte.
	 *
	 * @param texte the new texte
	 */
	public void setTexte(String texte) {
		if (texte!=null || !texte.isEmpty()) {
			this.texte = texte;	
		}
		notifyObservers();
	}

	/**
	 * Gets the fw.
	 *
	 * @return the fw
	 */
	public Boolean getFw() {
		return fw;
	}

	/**
	 * Sets the fw.
	 *
	 * @param fw the new fw
	 */
	public void setFw(Boolean fw) {
		if(fw) {
			this.fw = true;
		}else {
			this.fw = false;
		}
		notifyObservers();
	}

	/**
	 * Gets the fp.
	 *
	 * @return the fp
	 */
	public Boolean getFp() {
		return fp;
	}

	/**
	 * Sets the fp.
	 *
	 * @param fp the new fp
	 */
	public void setFp(Boolean fp) {
		if(fp) {
			this.fp = true;
		}else {
			this.fp = false;
		}
		notifyObservers();
	}

	/**
	 * Adds the observer.
	 *
	 * @param observer the observer
	 */
	public void addObserver(PoliceObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	/**
	 * Notify observers.
	 */
	private void notifyObservers() {
		for (PoliceObserver observer : observers) {
			observer.update(this);
		}
	}

}
