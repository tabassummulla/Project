package customer;

import javafx.*;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import customer.Customer;

public class Main extends Application {

	TextField emailField;
	TextField passField;
	Label emailAdd;
	Label pass;
	Button login;
	
	public static void main(String []args) {
		Application.launch(args);
		
		
	
		
		
	}

	public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Login");	
	

	
	VBox panel = new VBox(30);
	panel.setPadding(new Insets(20, 20, 20, 20));
	panel.getChildren().addAll(
			row(emailAdd , emailField = new TextField() ),
			row2(pass , passField = new TextField() ));
	
	
	
	HBox hb = new HBox(10);
	hb.getChildren().addAll(panel);
	HBox.setMargin(panel,new Insets(30));
	StackPane root = new StackPane();
	Scene scene = new Scene(root,400,300);

    root.getChildren().addAll(hb);
	
	
	primaryStage.setScene(scene);
	primaryStage.show();
	primaryStage.centerOnScreen();

    }
	

	private Node row(Label labeltext, TextField textField) {
	HBox row = new HBox(10);
	Label emailAdd = new Label("Email Address");
	emailAdd.setMinWidth(100);
		row.getChildren().addAll(emailAdd, textField);
		return row;
	}		
		
	
	private Node row2(Label labeltext, TextField textField) {
	HBox row = new HBox(10);
	Label pass = new Label("Password");
	pass.setMinWidth(100);	
		row.getChildren().addAll(pass, textField);
		return row;
	}		
	

	}

