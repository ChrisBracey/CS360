import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.scene.shape.Line;



public class ex14_19 extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Polyline polyline = new Polyline();
		Polyline polyline2 = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		ObservableList<Double> list2 = polyline2.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) 
		{
			list.add(x + 200.0);
			list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}

		for (int x = -170; x <= 170; x++) 
		{
			list2.add(x + 200.0);
			list2.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}

		Line line = new Line();
		line.setStartX(200.0f);
		line.setStartY(25.0f);
		line.setEndX(200.0f);
		line.setEndY(170.0f);

		Line line2 = new Line();
		line2.setStartX(0.0f);
		line2.setStartY(100.0f);
		line2.setEndX(400.0f);
		line2.setEndY(100.0f);

		Pane pane = new Pane();
		pane.getChildren().addAll(polyline, polyline2, line, line2);


		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}