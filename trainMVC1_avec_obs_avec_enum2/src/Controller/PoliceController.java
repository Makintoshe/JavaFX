package Controller;

import Model.Couleur;
import Model.Fonte;
import Model.Police;
import View.PoliceView;
import javafx.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class PoliceController.
 */
public class PoliceController {

	/** The model. */
	private Police model;
	
	/** The view. */
	private PoliceView view;
	
	/** The font txt. */
	private String font_txt;
	
	/** The Fonte. */
	public Fonte Fonte;// tab = new Fonte[2];
	
	/** The couleur. */
	private String couleur;
	
	/** The check gras. */
	public boolean checkGras = false;
	
	/** The check it. */
	public boolean checkIt = false;

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public Police getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(Police model) {
		this.model = model;
	}

	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	public void setView(PoliceView view) {
		init(view);
	}

	/**
	 * Inits the.
	 *
	 * @param view the view
	 */
	public void init(PoliceView view) {
		this.view = view;
		this.view.getColorEvent(this::getCouleurRB);
		this.view.getFontgrasEvent(this::getGrasCB);
		this.view.getFontitalicEvent(this::getItalicCB);
	}

	/**
	 * Gets the couleur RB.
	 *
	 * @param event the event
	 * @return the couleur RB
	 */
	public void getCouleurRB(ActionEvent event) {
		try {
			couleur = this.view.getTextOfObject(event.getSource());
			if (couleur != null) {
				model.setTexte(this.view.getTextInTextField());
				model.setCouleur(String.valueOf(couleur));
			}else {
				model.setTexte(this.view.getTextInTextField());
				model.setCouleur("black");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the gras CB.
	 *
	 * @param event the event
	 * @return the gras CB
	 */
	public void getGrasCB(ActionEvent event) {
		try {
			font_txt = this.view.getTextOfObject(event.getSource());
			if (font_txt != null) {
				model.setFw(true);
			} else {
				model.setFw(false);
			}
			model.setTexte(this.view.getTextInTextField());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Gets the italic CB.
	 *
	 * @param event the event
	 * @return the italic CB
	 */
	public void getItalicCB(ActionEvent event) {
		try {
			font_txt = this.view.getTextOfObject(event.getSource());
			if (font_txt != null) {
				model.setFp(true);
			} else {
				model.setFp(false);
			}
			model.setTexte(this.view.getTextInTextField());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
