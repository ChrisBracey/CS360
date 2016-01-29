import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;


public class ex14_19 extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Polyline polyline = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) 
		{
			list.add(x + 200.0);
			list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}

		Pane pane = new Pane();
		pane.getChildren().add(polyline);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}