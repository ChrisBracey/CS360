import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;



public class ex14_7 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Pane vbox = new VBox();
		for(int i = 0; i<10; ++i)
		{	
			Pane hbox = new HBox();
			
			for(int j = 0; j<10; ++j)
			{
				int rand = (int)(Math.random() * 2);
				String randString = Integer.toString(rand);
				TextField tf = new TextField();
				tf.setText(randString);
				hbox.getChildren().add(tf);
			}

			vbox.getChildren().add(hbox);
		}

		Scene scene = new Scene(vbox,500,275);
		primaryStage.setScene(scene);
		primaryStage.show();

		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}