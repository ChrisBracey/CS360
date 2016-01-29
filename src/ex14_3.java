import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import java.util.Collections;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import javafx.scene.layout.HBox;


public class ex14_3 extends Application
{
    ArrayList<Integer> arr = new ArrayList<>();

    
    	@Override
    	public void start(Stage primaryStage) throws Exception 
    	{

    		for(int i = 1; i<=52; ++i)
	    		arr.add(i);


	    	Collections.shuffle(arr);

	    	System.out.println(arr.get(0));
	    	System.out.println(arr.get(1));
	    	System.out.println(arr.get(2));

	    	Image card1 = new Image("images/card/" + arr.get(0) +".png");
	    	Image card2 = new Image("images/card/" + arr.get(1) +".png");
	    	Image card3 = new Image("images/card/" + arr.get(2) +".png");

	    	ImageView card1View = new ImageView(card1);
	    	ImageView card2View = new ImageView(card2);
	    	ImageView card3View = new ImageView(card3);

	    	Pane pane = new HBox();
	    	pane.getChildren().add(card1View);
	    	pane.getChildren().add(card2View);
	    	pane.getChildren().add(card3View);

	    	Scene scene = new Scene(pane);
	    	primaryStage.setTitle("Ex4_3");
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
    	}
    	
    	public static void main(String[] args)
    	{
    		launch(args);
    	}

}

