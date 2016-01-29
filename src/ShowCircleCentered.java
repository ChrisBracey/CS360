

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		Rectangle BoundingBox = new Rectangle();
		BoundingBox.widthProperty().bind(circle.radiusProperty().multiply(2));
		BoundingBox.heightProperty().bind(circle.radiusProperty().multiply(2));
		BoundingBox.xProperty().bind(circle.centerXProperty().subtract(circle.getRadius()));
		BoundingBox.yProperty().bind(circle.centerYProperty().subtract(circle.getRadius()));
		BoundingBox.setStroke(Color.BLACK);
		BoundingBox.setFill(Color.BLACK);
		pane.getChildren().add(BoundingBox);

		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("ShowCircleCentered");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
