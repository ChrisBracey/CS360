
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.paint.Color;


public class ChessBoard extends FlowPane {
		Rectangle[] tiles;

	public ChessBoard() 
	{
		tiles = new Rectangle[64];
		this.drawTiles(this.widthProperty(), this.heightProperty());
	}

	protected void drawTiles(ReadOnlyDoubleProperty widthProperty, ReadOnlyDoubleProperty heightProperty)
	{
		boolean alt = true;
		for(int i = 0, j = 1; i<64; ++i, ++j)
		{
			Rectangle tile = new Rectangle();
			tile.widthProperty().bind(widthProperty.divide(8).subtract(1));
			tile.heightProperty().bind(heightProperty.divide(8).subtract(1));
			tile.setFill(alt ? i%2 == 0 ? Color.WHITE : Color.BLACK: i%2 == 1 ? Color.WHITE : Color.BLACK);
			if(j%8 == 0)
			{
				alt = !alt;
			}
			this.getChildren().add(tile);
		}
	}
	
	
}
