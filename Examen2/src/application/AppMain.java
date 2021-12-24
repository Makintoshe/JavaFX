package application;

import Controller.AppController;
import Model.AppModel;
import View.AppView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class AppMain.
 */
public class AppMain extends Application{

	/**
	 * Start.
	 *
	 * @param stage the stage
	 * @throws Exception the exception
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		stage.setTitle("Examen de TP 1");
		
		AppView root = new AppView();
		
		
		AppModel model = new AppModel();
		model.addObserver(root);
		
		AppController controller = new AppController();
		controller.setView(root);
		controller.setModel(model);		
		
		
		Scene scene = new Scene(root, 600, 350);
		stage.setScene(scene);
		stage.show();
		
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
}
