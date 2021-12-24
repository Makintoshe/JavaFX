package TP3;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//
//public class DrageDropEventManager implements EventHandler<MouseEvent> {
//
//	private GraphicsContext gc;
//
//	double DragX, DragY, DropX, DropY;
//	private Line line;
//
//	public DrageDropEventManager(GraphicsContext gc) {
//		// TODO Auto-generated constructor stub
//		this.gc = gc;
//	}
//
//	@Override
//	public void handle(MouseEvent event) {
//		// TODO Auto-generated method stub
//
//		if (event.getSource() == MouseEvent.MOUSE_PRESSED) {
//			DragX = event.getX();
//			DragY = event.getY();
//			addCircle(DragX, DragY);
//		}
//
//		if (event.getSource() == MouseEvent.MOUSE_RELEASED) {
//			DropX = event.getX();
//			DropY = event.getY();
//			addCircle(DropX, DropY);
//			addLine(DragX,DragY,DropX, DropY);
//		}
//
//	}
//	
//    public void addLine(double DragX, double DragY,double DropX, double DropY) {
//        this.gc.strokeLine(DragX,DragY, DropX, DropY);
//		this.gc.setFill(Color.BLACK);
//    }
//
//    public void addCircle(double x, double y) {
//    	this.gc.fillOval(x, y, 10, 10);
//		this.gc.setFill(Color.BLACK);
//    }
//    
//    //
//    //
//    
//	
//	double DragX, DragY, DropX, DropY;
//    
//	EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
//		
//		@Override
//		public void handle(MouseEvent event) {
//			// TODO Auto-generated method stub
//
//			if (event.getSource() == MouseEvent.MOUSE_PRESSED) {
//				DragX = event.getX();
//				DragY = event.getY();
//				addCircle(DragX, DragY,gc);
//			}
//
//			if (event.getSource() == MouseEvent.MOUSE_RELEASED) {
//				DropX = event.getX();
//				DropY = event.getY();
//				addCircle(DropX, DropY,gc);
//				addLine(DragX,DragY,DropX, DropY,gc);
//			}
//
//		}
//	
//	};
//	
//    public void addLine(double DragX, double DragY,double DropX, double DropY,GraphicsContext gc) {
//        gc.strokeLine(DragX,DragY, DropX, DropY);
//		gc.setFill(Color.BLACK);
//    }
//
//    public void addCircle(double x, double y,GraphicsContext gc) {
//    	gc.fillOval(x, y, 10, 10);
//		gc.setFill(Color.BLACK);
//    }
//
//    
//    // Bon
//    
//	canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {			
//		//dd.handle(event);	
//		DragX = event.getX();
//		DragY = event.getY();
//		addCircle(DragX, DragY,gc);
//	});
//	
//	canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {			
//		//dd.handle(event);	
//		DropX = event.getX();
//		DropY = event.getY();
//		addCircle(DropX, DropY,gc);
//		addLine(DragX,DragY,DropX, DropY,gc);
//	});
//    
//    

///////ce qu'il faut faire

//		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
//			
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//
//				if (event.getSource() == MouseEvent.MOUSE_PRESSED) {
//					//dd.handle(event);	
//					DragX = event.getX();
//					DragY = event.getY();
//					addCircle(DragX, DragY,gc);
//				}
//
//				if (event.getSource() == MouseEvent.MOUSE_RELEASED) {
//					//dd.handle(event);	
//					DropX = event.getX();
//					DropY = event.getY();
//					addCircle(DropX, DropY,gc);
//					addLine(DragX,DragY,DropX, DropY,gc);
//				}
//
//			}
//		
//		};
//		
//		
//		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, eventHandler);
//		canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, eventHandler);		


//}
