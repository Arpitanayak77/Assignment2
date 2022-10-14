package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A2_4 extends Application{
	
	public void start(Stage myStage) {
		myStage.setTitle("Assignment 2");
		
		BorderPane rootNode = new BorderPane();
		
		Scene myScene = new Scene(rootNode,300,300);
		
		myStage.setScene(myScene);
		Label l = new Label("Employee Registration Form");
		Label l1 = new Label("Enter your Name: ");
		TextField t1 = new TextField();
		t1.setPrefColumnCount(20);
		Label l2 = new Label("Select Your Gender: ");
		RadioButton m = new RadioButton("Male");
		RadioButton f = new RadioButton("Female");
		ToggleGroup tg = new ToggleGroup();
		
		m.setToggleGroup(tg);
		f.setToggleGroup(tg);
		
		
		
		
		
		
		
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem)ae.getTarget()).getText();
				if(name.equals("Exit"))
					Platform.exit();
				//response.setText(name + "selected");
			}	
		};
	}
		
	public static void main(String[] args) {
		launch(args);

	}

}
