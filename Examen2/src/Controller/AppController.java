package Controller;

import Model.AppModel;
import View.AppView;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class AppController.
 */
public class AppController {
	
	/** The model. */
	private AppModel model;
	
	/** The view. */
	private AppView view;
	
	/** The h. */
	private double l, h;
	
	
	/**
	 * Inits the.
	 *
	 * @param view the view
	 */
	public void init(AppView view) {
		this.view = view;
		this.view.getRectDimensionInCanvas(this::getDimensionInController);
		this.view.ClearBtn(this::ClearCanvas);
	}
	
	/**
	 * Gets the dimension in controller.
	 *
	 * @param event the event
	 * @return the dimension in controller
	 */
	public void getDimensionInController(MouseEvent event) {
		try {
			l = this.view.getLargeurInTextField();
			h = this.view.getHauteurInTextField();
			this.model.setDimension(l, h);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * Clear canvas.
	 *
	 * @param event the event
	 */
	public void ClearCanvas(ActionEvent event) {
		this.view.ClearCanvasView();
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(AppModel model) {
		this.model = model;
	}
	
	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	public void setView(AppView view) {
		init(view);
	}
	

}
