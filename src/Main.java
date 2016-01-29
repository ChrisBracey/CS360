import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Scene scene = new Scene(new ChessBoard());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}