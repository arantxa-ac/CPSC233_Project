import java.util.Collection;

import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;


public class GameApp extends Application{
	@Override
	//Override the start method.
	public void start(Stage primaryStage) {
		//Try-except block to print to console in case of exception.
		try {
			
			//Create root pane.
			Pane root = new Pane();
			
	//BACKGROUND
			//Create a new background layer and add background image.
//			Group bg = new Group();
//			Image ground = new Image(getClass().getResourceAsStream("background.png"));
//			ImageView bgIV = new ImageView(ground);
//			bg.getChildren().add(bgIV);
//			Bounds bg1Bounds = bgIV.getBoundsInLocal();
			
			//Tracker of background bounds. 
			
			//Move background layer
			
			
			//Add background layer to root.
//			root.getChildren().add(bg);
			
			
			
			//Create new layer and add a player to it
			Pane playerPane = new Pane();
			playerPane.setBackground(null);
			Image image = new Image(getClass().getResourceAsStream("trexPlayer.png"));
			ImageView imageView = new ImageView(image);
			Player player = new Player(playerPane,image,-600,400);
			root.getChildren().add(playerPane);			
			
			//Create a scene.
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());			
			
			//Event handler. If up arrow key is pressed then the player will jump.
			scene.setOnKeyPressed(new EventHandler<KeyEvent>()
			{
				@Override
				public void handle(KeyEvent event)
				{
					if (event.getCode() == KeyCode.UP)
						player.jump();
				}
			});
				
			//Give the stage a title.
			primaryStage.setTitle("T-Rex Run");
			//Set the scene on primary stage and show stage.
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Start application by calling launch.
	public static void main(String[] args) {
		launch(args);
		
	}
	
	public void stop()
	{
		
	}

}
