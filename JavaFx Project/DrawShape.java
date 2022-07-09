/* Course Code: CSC164-651 Computer Science II
 Submission 16.9 "Geometry: two rectangles intersect?"
 Due Date: 2020/4/30 @23:00
 Author: Bradley S. Ryall and Christopher Yonek
 Description: This program is made so that a user can enter exacting 
                size and locations of two rectangles before the program
                finally displays both rectangles, and shows their intersection.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

    public class DrawShape extends Application{
        
	    protected Rectangle rectangle = getRectangle();
	    
	    protected Pane paneForRectangles = new Pane(rectangle);
	    
	    protected TablePane table = new TablePane();

	@Override
	
	//Start method for application class overridden
	public void start(Stage primaryStage){
	    
		//pane containint table for rectangle display made
		paneForRectangles.getChildren().addAll(
			table.getRectangle1(), table.getRectangle2());

		//Buttons for user adjustments made 
		Button btRedrawCircles = new Button("Redraw Rectangles");

		//VBox made to stack child nodes of rectangles over each other
		VBox pane = new VBox();
		
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(intersect(), paneForRectangles,
			table, btRedrawCircles);

		//Handlers for child nodes created and getters set 
		btRedrawCircles.setOnAction(e ->{
		    
			table.redraw();
			
			pane.getChildren().remove(0);
			pane.getChildren().add(0, intersect());
			
		});
		
        //Table getter with rectangle locations
		table.getRectangle1().setOnMouseDragged(e ->{
		    
			if (table.getRectangle1().contains(e.getX(), e.getY())){
			    
				table.setRectangle1X(e.getX() - (table.getRectangle1Width() / 2));
				
				table.setRectangle1Y(e.getY() - (table.getRectangle1Height() / 2));
				
				table.setTfRectangle1X(String.valueOf(e.getX() 
					- (table.getRectangle1Width() / 2)));
					
				table.setTfRectangle1Y(String.valueOf(e.getY() 
					- (table.getRectangle1Height() / 2)));
			}
			
			pane.getChildren().remove(0);
			
			pane.getChildren().add(0, intersect());
		});
		
        //Table getter with rectangle 2 locations input
		table.getRectangle2().setOnMouseDragged(e ->{
			if (table.getRectangle2().contains(e.getX(), e.getY())){
			    
				table.setRectangle2X(e.getX() - (table.getRectangle2Width() / 2));
				table.setRectangle2Y(e.getY() - (table.getRectangle2Height() / 2));
				
				table.setTfRectangle2X(String.valueOf(e.getX() 
					- (table.getRectangle2Width() / 2)));
					
				table.setTfRectangle2Y(String.valueOf(e.getY() 
					- (table.getRectangle2Height() / 2)));
			}
			
			pane.getChildren().remove(0);
			
			pane.getChildren().add(0, intersect());
		});

		//Scene made in stage to display both rectangle 1 & 2
		Scene scene = new Scene(pane);
		
		    //Stage title/name setter
		    primaryStage.setTitle("Java 16.9");
		
		//Scene placed into stage for final display 
		primaryStage.setScene(scene); 
		//Scene displayed
		primaryStage.show(); 
	}

	//Detection of intersection noted and displayed to user
	private Text intersect(){
	    
		return new Text("Two rectangles intersect? " +
			(isIntersect() ? "yes" : "no"));
	}

	/* Main method describing whether or not there is an intersection
	of rectangles in the scene */
	
	private boolean isIntersect(){
	    
		return 
		
			(getDistance(table.getRectangle2X(), table.getRectangle1X() + 
				table.getRectangle1Width()) < 
				table.getRectangle1Width() + table.getRectangle2Width() &&
				
		  	(getDistance(table.getRectangle2Y(), table.getRectangle1Y() + 
		  		table.getRectangle1Height()) < 
		  		table.getRectangle1Height() + table.getRectangle2Height())) &&
		  		
			(getDistance(table.getRectangle1X(), table.getRectangle2X() + 
				table.getRectangle2Width()) < 
				table.getRectangle1Width() + table.getRectangle2Width() &&
				
		  	(getDistance(table.getRectangle1Y(), table.getRectangle2Y() + 
		  		table.getRectangle2Height()) < 
		  		table.getRectangle1Height() + table.getRectangle2Height())); 
	}

	//Distance then returned to user through p2-p1 function
	private double getDistance(double p1, double p2){
	    
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}

	//Rectangle size and color displayed via JavaFX
	private Rectangle getRectangle(){
	    
		Rectangle r = new Rectangle(0, 0, 280, 110);
		
		r.setStroke(Color.WHITE);
		r.setFill(Color.WHITE);
		
		//Program ended
		return r;
	}
}
