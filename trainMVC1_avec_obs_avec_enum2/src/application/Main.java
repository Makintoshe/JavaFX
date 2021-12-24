package application;


import Controller.PoliceController;
import Model.Police;
import View.PoliceView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main extends Application{

	/**
	 * Start.
	 *
	 * @param stage the stage
	 * @throws Exception the exception
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		stage.setTitle("Training with Examen 2020-2021");
		
		//View
		PoliceView root = new PoliceView();
		
		//Model
		Police model = new Police();
		model.addObserver(root);
		
		//Controller
		PoliceController policeController = new PoliceController();
		policeController.setView(root);
		policeController.setModel(model);
		
		//
		Scene scene = new Scene(root, 600, 250);
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
