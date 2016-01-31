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

		Line topArrowRight = new Line();
		topArrowRight.setStartX(200.0f);
		topArrowRight.setStartY(25.0f);
		topArrowRight.setEndX(205.0f);
		topArrowRight.setEndY(35.0f);

		Line topArrowLeft = new Line();
		topArrowLeft.setStartX(200.0f);
		topArrowLeft.setStartY(25.0f);
		topArrowLeft.setEndX(195.0f);
		topArrowLeft.setEndY(35.0);

		Line bottomArrowLeft = new Line();
		bottomArrowLeft.setStartX(200.0f);
		bottomArrowLeft.setStartY(170.0f);
		bottomArrowLeft.setEndX(205.0f);
		bottomArrowLeft.setEndY(160.0f);

		Line bottomArrowRight = new Line();
		bottomArrowRight.setStartX(200.0f);
		bottomArrowRight.setStartY(170.0f);
		bottomArrowRight.setEndX(195.0f);
		bottomArrowRight.setEndY(160.0f);

		Line line2 = new Line();
		line2.setStartX(0.0f);
		line2.setStartY(100.0f);
		line2.setEndX(400.0f);
		line2.setEndY(100.0f);

		Line leftArrowLeft = new Line();
		leftArrowLeft.setStartX(0.0f);
		leftArrowLeft.setStartY(100.0f);
		leftArrowLeft.setEndX(10.0f);
		leftArrowLeft.setEndY(105.0f);

		Line leftArrowRight = new Line();
		leftArrowRight.setStartX(0.0f);
		leftArrowRight.setStartY(100.0f);
		leftArrowRight.setEndX(10.0f);
		leftArrowRight.setEndY(95.0f);


		Line rightArrowLeft = new Line();
		rightArrowLeft.setStartX(400.0f);
		rightArrowLeft.setStartY(100.0f);
		rightArrowLeft.setEndX(390.0f);
		rightArrowLeft.setEndY(95.0f);

		Line rightArrowRight = new Line();
		rightArrowRight.setStartX(400.0f);
		rightArrowRight.setStartY(100.0f);
		rightArrowRight.setEndX(390.0f);
		rightArrowRight.setEndY(105.0f);

		Pane pane = new Pane();
		pane.getChildren().addAll(polyline, polyline2, line, line2, topArrowLeft, 
								  topArrowRight, bottomArrowLeft, bottomArrowRight, 
								  leftArrowLeft, leftArrowRight, rightArrowLeft, 
								  rightArrowRight);


		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}