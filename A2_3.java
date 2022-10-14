package application;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A2_3 extends Application{
	Label response;

	public static void main(String[] args) {
		launch(args);
		
	}
	public void start(Stage myStage) {
		myStage.setTitle("Assignment 2");
		
		BorderPane rootNode = new BorderPane();
		
		Scene myScene = new Scene(rootNode,300,300);
		
		myStage.setScene(myScene);
		response = new Label("Menu Demo");
		
		MenuBar mb = new MenuBar();
		Menu newMenu = new Menu("New");
		MenuItem file = new MenuItem("File");
		MenuItem folder = new MenuItem("Folder");
		MenuItem image = new MenuItem("Image");
		
		newMenu.getItems().addAll(file,folder,image);
		mb.getMenus().add(newMenu);
		
		Menu viewMenu = new Menu("View");
		MenuItem l = new MenuItem("Large");
		MenuItem m = new MenuItem("Medium");
		MenuItem s = new MenuItem("Small");
		
		viewMenu.getItems().addAll(l,m,s);
		mb.getMenus().add(viewMenu);
		
		
		MenuItem f = new MenuItem("File");
		MenuItem fl = new MenuItem("Folder");
		MenuItem im = new MenuItem("Image");
		MenuItem lar = new MenuItem("Large");
		MenuItem med = new MenuItem("Medium");
		MenuItem sm = new MenuItem("Small");
		
		final ContextMenu editMenu = new ContextMenu(f,fl,im,lar,med,sm);
		
		
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem)ae.getTarget()).getText();
				if(name.equals("Exit"))
					Platform.exit();
				response.setText(name + "selected");
			}	
		};
			file.setOnAction(MEHandler);
			folder.setOnAction(MEHandler);
			image.setOnAction(MEHandler);
			l.setOnAction(MEHandler);
			m.setOnAction(MEHandler);
			s.setOnAction(MEHandler);
			
			f.setOnAction(MEHandler);
			fl.setOnAction(MEHandler);
			im.setOnAction(MEHandler);
			lar.setOnAction(MEHandler);
			med.setOnAction(MEHandler);
			sm.setOnAction(MEHandler);
			
			TextField tf = new TextField();
			tf.setPrefColumnCount(20);
			tf.setContextMenu(editMenu);
			
			rootNode.setTop(mb);
			FlowPane fpRoot = new FlowPane(10,10);
			fpRoot.setAlignment(Pos.CENTER);
			fpRoot.getChildren().addAll(response,tf);
			rootNode.setCenter(fpRoot);
			myStage.show();
			
		
		}

}
