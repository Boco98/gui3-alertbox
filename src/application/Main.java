package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window =  primaryStage;
		window.setTitle("thenewboston");
		
		button  = new Button("Click me");
		button.setOnAction(e -> AlertBox.display("fucking alertBox", "this is first alert box"));
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene  = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
		
	}
	
	
}
