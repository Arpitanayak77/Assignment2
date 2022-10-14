package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class A2_2 extends Application {
	Label response;

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage myStage) {
		myStage.setTitle("Assignment 2");
		BorderPane rootNode = new BorderPane();
		
		Scene myScene = new Scene(rootNode,300,300);
		myStage.setScene(myScene);
		
		response = new Label("Menu Bar");
		MenuBar mb = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		MenuItem n = new MenuItem("New");
		MenuItem o = new MenuItem("Open");
		MenuItem s = new MenuItem("Save");
		
		fileMenu.getItems().addAll(n,o,s);
		fileMenu.setMnemonicParsing(true);
		n.setAccelerator(KeyCombination.keyCombination("shortcut + n"));
		o.setAccelerator(KeyCombination.keyCombination("shortcut + o"));
		s.setAccelerator(KeyCombination.keyCombination("shortcut + s"));
		
		mb.getMenus().add(fileMenu);
	
		Menu editMenu = new Menu("Edit");
		MenuItem cu = new MenuItem("Cut");
		MenuItem co = new MenuItem("Copy");
		MenuItem p = new MenuItem("Paste");
		
		editMenu.getItems().addAll(cu,co,p);
		cu.setAccelerator(KeyCombination.keyCombination("shortcut + x"));
		co.setAccelerator(KeyCombination.keyCombination("shortcut + c"));
		p.setAccelerator(KeyCombination.keyCombination("shortcut + v"));
		
		mb.getMenus().add(editMenu);
		
		Menu helpMenu = new Menu("Help");
		MenuItem hc = new MenuItem("Help Center");
		MenuItem au = new MenuItem("About Us");
		helpMenu.getItems().addAll(hc,au);
		hc.setAccelerator(KeyCombination.keyCombination("shortcut + h"));
		au.setAccelerator(KeyCombination.keyCombination("shortcut + a"));
		mb.getMenus().add(helpMenu);
		
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem)ae.getTarget()).getText();
				if(name.equals("Exit"))
					Platform.exit();
					response.setText(name + " selected");
					}
		};
		n.setOnAction(MEHandler);
		o.setOnAction(MEHandler);
		s.setOnAction(MEHandler);
		cu.setOnAction(MEHandler);
		co.setOnAction(MEHandler);
		p.setOnAction(MEHandler);
		hc.setOnAction(MEHandler);
		au.setOnAction(MEHandler);
		
		rootNode.setTop(mb);
		rootNode.setCenter(response);
		myStage.show();
	}
}