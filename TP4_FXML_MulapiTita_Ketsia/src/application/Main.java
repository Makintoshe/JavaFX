package application;

import controller.OperationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.GlobalOperationModel;
import view.Gui;
import javafx.scene.Parent;
import javafx.scene.Scene;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main extends Application {

	
	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("MVC-FXML Calculator");
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/View.fxml"));
	        Parent root = loader.load();
			Gui view = loader.getController();
	        GlobalOperationModel model = new GlobalOperationModel();
	        model.addObserver(view);
	        OperationController controller = new OperationController();
	        controller.setView(view);
	        controller.setModel(model);
	        view.setController(controller);
	        Scene scene = new Scene(root,700, 450);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
	        primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
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
