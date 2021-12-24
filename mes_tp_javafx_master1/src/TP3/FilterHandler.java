package TP3;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class FilterHandler{
	
	public static EventHandler<MouseEvent> actionInsert_filter() {
		EventHandler<MouseEvent> evtHandlerBtnAdd = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Insertion Handler");
				System.out.println(arg0.getSource());
				System.out.println(arg0.getTarget());
			}		
		
		};
		return evtHandlerBtnAdd;
	}

	public static EventHandler<MouseEvent> actionInsert_handler() {
		EventHandler<MouseEvent> evtFilterBtnTxTArea = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Insertion Filter");
				System.out.println(arg0.getSource());
				System.out.println(arg0.getTarget());
			}		
		
		};
		return evtFilterBtnTxTArea;
	}
	
	public static EventHandler<MouseEvent> actionDelete_filter() {
		EventHandler<MouseEvent> evtFilterBtnDel = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Delete Filter");
			}		
		
		};
		return evtFilterBtnDel;
	}
	
	public static EventHandler<MouseEvent> actionDelete_handler() {
		EventHandler<MouseEvent> evtHandlerBtnDel = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Delete Handler");
			}		
		
		};	
		return evtHandlerBtnDel;		
	}
	
	public static EventHandler<MouseEvent> actionQuit_filter() {
		EventHandler<MouseEvent> evtFilterBtnQuit = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Quit Filter");
			}		
		
		};
		return evtFilterBtnQuit;
	}	
	
	public static EventHandler<MouseEvent> actionQuit_handler() {
		EventHandler<MouseEvent> evtHandlerBtnQuit = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Quit Handler");
			}		
		
		};
		return evtHandlerBtnQuit;
	}	
	
	public static EventHandler<MouseEvent> actionTxtArea_filter() {
		EventHandler<MouseEvent> evtHandlerTxTArea = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Txt Area Handler");
			}		
		
		};
		return evtHandlerTxTArea;
	}		
	
	public static EventHandler<MouseEvent> actionTxtArea_handler() {
		EventHandler<MouseEvent> evtFilterBtnTxTArea = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Txt Area Filter");
			}		
		
		};
		return evtFilterBtnTxTArea;
	}


	
//	TextArea txtare;
//	public FilterHandler(TextArea txtare) {
//		// TODO Auto-generated constructor stub
//		this.txtare = txtare;
//	}
//	
//	public void actionInsert(ActionEvent evt) {
//		System.out.println("Code event : " + evt.toString());
//		this.txtare.appendText("Insertion");
//	}
//	
//	public void actionDelete(ActionEvent evt) {
//		this.txtare.appendText("Suppression");
//		System.out.println("Code event : " + evt.toString());
//	}
//	
//	public void actionQuit(ActionEvent evt) {
//		this.txtare.appendText("Quitter");
//		System.out.println("Code event : " + evt.toString());
//	}	
//	
//	public static void actionTxtArea(ActionEvent evt) {
//		System.out.println("Code event : " + evt.toString());
//	}	
	
	
	
}
