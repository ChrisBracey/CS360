import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.layout.Pane;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Cylinder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ex14_10 extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Pane pane = new Pane();
		Arc arc = new Arc();
		arc.setRadiusX(100.0f);
		arc.setRadiusY(50.0f);
		arc.setStartAngle(0.0f);
		arc.setLength(180.0f);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);
		arc.setCenterY(50.0f);
		arc.centerXProperty().bind(pane.widthProperty().divide(2));

		Arc arc2 = new Arc();
		arc2.setRadiusX(100.0f);
		arc2.setRadiusY(50.0f);
		arc2.setStartAngle(180.0f);
		arc2.setLength(180.0f);
		arc2.setFill(Color.WHITE);
		arc2.setStroke(Color.BLACK);
		arc2.setCenterY(50.0f);
		arc2.centerXProperty().bind(pane.widthProperty().divide(2));

		Line line = new Line();
		line.setStartX(150.0f);
		line.setStartY(50.0f);
		line.setEndX(150.0f);
		line.setEndY(200.0f);


		line.startXProperty().bind(pane.widthProperty().divide(2).subtract(100));
		line.endXProperty().bind(pane.widthProperty().divide(2).subtract(100));

		Line line2 = new Line();
		line2.setStartX(350.0f);
		line2.setStartY(50.0f);
		line2.setEndX(350.0f);
		line2.setEndY(200.0f);


		line2.startXProperty().bind(pane.widthProperty().divide(2).add(100));
		line2.endXProperty().bind(pane.widthProperty().divide(2).add(100));

		Arc arc3 = new Arc();
		arc3.setRadiusX(100.0f);
		arc3.setRadiusY(50.0f);
		arc3.setStartAngle(0.0f);
		arc3.setLength(180.0f);
		arc3.setFill(Color.WHITE);
		arc3.setStroke(Color.BLACK);
		arc3.setCenterY(200.0f);
		arc3.centerXProperty().bind(pane.widthProperty().divide(2));
		arc3.getStrokeDashArray().addAll(6.0, 21.0);

		Arc arc4 = new Arc();
		arc4.setRadiusX(100.0f);
		arc4.setRadiusY(50.0f);
		arc4.setStartAngle(180.0f);
		arc4.setLength(180.0f);
		arc4.setFill(Color.WHITE);
		arc4.setStroke(Color.BLACK);
		arc4.setCenterY(200.0f);
		arc4.centerXProperty().bind(pane.widthProperty().divide(2));

		pane.getChildren().addAll(arc, arc2, line, line2, arc3, arc4);

		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
}