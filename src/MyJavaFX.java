import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btnOk = new Button("OK");
		Scene scene = new Scene(btnOk);
		
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(scene);
		
		Button btnNotOk = new Button("Not OK");
		Scene scene2 = new Scene(btnNotOk);
		Stage secondaryStage = new Stage();
		secondaryStage.setScene(scene2);
		

		primaryStage.show();
		secondaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);

	}


}
