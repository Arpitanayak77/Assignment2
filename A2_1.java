import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class A2_1 extends Application {
	Label response;
   public void start(Stage stage)  {
      //Creating nodes
      TextField textField = new TextField();
      PasswordField pwdField = new PasswordField();
      //Creating labels
      Label label1 = new Label("Name: ");
      Label label2 = new Label("Password: ");
      //Adding labels for nodes
      HBox box = new HBox(5);
      Button b1= new Button("submit");
      response=new Label("enter");
      //box.setPadding(new Insets(25, 5 , 5, 50));
      box.getChildren().addAll(label1, textField, label2, pwdField,b1,response);
      //Setting the stage
      Scene scene = new Scene(box, 595, 150, Color.BEIGE);
      stage.setTitle("Password Field Example");
      stage.setScene(scene);
      stage.show();
      try {
    	  b1.setOnAction((ae)->{
    	  if(textField.getText().equals("abc") && pwdField.getText().equals("def")) 
    		  {
    			  response.setText("Welcome");
    		  }
    		  else {
    			  response.setText("Does not match");
    		  }
    	  
    	  });
      }
    	  
    	  catch(Exception e) {
    		  e.getMessage();
    		  }
   }
   public static void main(String args[]){
      launch(args);
   }
}