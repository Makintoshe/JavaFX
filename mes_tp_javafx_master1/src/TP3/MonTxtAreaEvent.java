package TP3;
import javafx.scene.input.KeyEvent;

public class MonTxtAreaEvent{

	public static void cliquer(KeyEvent evt) {
		System.out.println("Code event : " + evt.getCode());
	}
	
	public static void lacher(KeyEvent evt) {
		System.out.println("Key << " + evt.getText() + " >> pressed");
	}
	
}
