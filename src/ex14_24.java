import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import java.util.Scanner;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;


public class ex14_24 extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Polygon polygon = new Polygon();
		Pane pane = new StackPane();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> points = polygon.getPoints();

		System.out.println("Enter five points: ");
		Scanner console = new Scanner(System.in);

		//Get points for the polygon
		for(int i = 0; i< 8; ++i)
		{
			points.add(console.nextDouble());
		}

		double pointX = 0;
		double pointY = 0;

		//Get the point to be tested
		pointX = console.nextDouble();
		pointY = console.nextDouble();

		//Draw a circle on that point
		Circle circle = new Circle();
		circle.setRadius(5);
		circle.setCenterX(pointX);
		circle.setCenterY(pointY);
		circle.setFill(Color.BLACK);

		Label label;

		//Check if the polygon contains the point
		if(polygon.contains(pointX, pointY))
		{
			label = new Label("The point is contained by the polygon");
		}
		else
		{
			label = new Label("The point is not contained by the polygon");
		}

		//Center label
		StackPane.setAlignment(label, Pos.BOTTOM_CENTER);

		pane.getChildren().add(circle);
		pane.getChildren().add(label);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}