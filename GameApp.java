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
	
	Pane root;
	Pane playerPane;
	Pane obstaclePane;
	Pane groundPane;
	
	@Override
	//Override the start method.
	public void start(Stage primaryStage) {
		//Try-except block to print to console in case of exception.
		try {
			
			//Create root pane.
			root = new Pane();
				
	//PLAYER
			//Create new layer and add a player to it
			playerPane = new Pane();
			Image imagePlayer = new Image(getClass().getResourceAsStream("trexPlayer.png"));
			Player player = new Player(playerPane,imagePlayer,0,200);
			root.getChildren().add(playerPane);		
			
	//OBTACLES
			//Create new layer
			obstaclePane = new Pane();
			Image imageObstacle = new Image(getClass().getResourceAsStream("single_big_cactus.png"));
			Obstacle obstacle = new Obstacle(obstaclePane,imageObstacle,300,200);
			root.getChildren().add(obstaclePane);
			
	//GROUND
			groundPane = new Pane();
			Image imageGround = new Image(getClass().getResourceAsStream("ground.png"));
			Ground ground = new Ground (groundPane,imageGround,0,280);
			root.getChildren().add(groundPane);
			
	//SCENE
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
			
	//STAGE
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
