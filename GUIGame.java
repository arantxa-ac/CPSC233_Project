import java.awt.event.KeyListener;
import java.util.ArrayList;



import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;


public class GUIGame extends Application implements KeyListener {
	

	static Scene scene;
	Timeline obstacleGeneration = new Timeline();
	/**
	 * Override of the start method
	 */
	@Override
	public void start(Stage primaryStage) {		
		try {
			//Create root Pane, layers to insert every Game Object, and world to store each Game Object.
			 Pane root = new Pane();
			 Pane layers = new Pane();
			 PlayerGUI player = new PlayerGUI();
			 World world = new World();
			 ArrayList<GameObject> obj = world.getGame();
			 obj.set(0, player);
		 
			 
			 //Loop to update the world while there hasn't been a collision.
//				while(!player.checkCollision(world))
//				{

//					root.getChildren().clear();
//					layers.getChildren().clear(); 
					root.getChildren().add(renderGUI(world, layers));
			
//				}
			//		ArrayList<ObstacleGUI> guilist = new ArrayList<ObstacleGUI>();
					
			 		Label scoreLabel = new Label();
					root.getChildren().add(scoreLabel);
	
					ScoreManager game = new ScoreManager();
					game.start();
					
					Timeline score = new Timeline(new KeyFrame(Duration.seconds(0.0001), ev -> {
					scoreLabel.setText("Score: " + game.gettime()/10);
					
					//update player positions with hitbox positions
					
				/*	for (ObstacleGUI x : guilist)
					{
						//update hitbox
					}
				
					
					for (ObstacleGUI x : guilist)
					{
						Bounds obstacleBounds = x.getImageView().localToScene(x.getImageView().getBoundsInLocal());
						Bounds playerBounds = player.getImageView().getBoundsInLocal();
						if(obstacleBounds.intersects(playerBounds))
						System.out.println("Game over"); */
			//		}
					}));
					score.setCycleCount(Animation.INDEFINITE);
				    score.play();
					

				    /**
				     * Timeline used to manage the constant generation of obstacles
				     */
					obstacleGeneration = new Timeline(new KeyFrame(Duration.seconds(0.5), ev -> {
						
					ObstacleGUI newObstacle = new ObstacleGUI().generate();
					/**
					 * If there's a collision, the game should stop running
					 */
					if (player.checkCollision(world)) {
						obstacleGeneration.stop();
						score.stop();
						if(newObstacle != null)
							newObstacle.stop(true);
						root.getChildren().add(gameOver(world));				
					}
					
					// guilist.add(gui);
					
					if (newObstacle != null)	
					{
						root.getChildren().add(newObstacle.getLayer());
						world.add(newObstacle);
					}
				
					}));
					
					obstacleGeneration.setCycleCount(Animation.INDEFINITE);
				    	obstacleGeneration.play();
		/**
		 * SCENE
		 */
			scene = new Scene(root,DataProvider.getWINDOW_WIDTH(),DataProvider.getWINDOW_HEIGHT());
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		/**
		 * EVENT HANDLER:
		 * If either the up-arrow key or space bar is clicked, then the player jumps
		 */
			 scene.setOnKeyPressed(new EventHandler<KeyEvent>()
				{
					@Override
					public void handle(KeyEvent event)
					{
						if ((event.getCode() == KeyCode.SPACE || event.getCode() == KeyCode.UP) && (player.getY() > 195))
						{
							
							player.jump();
							player.setY(200);
							player.velocityFinal = DataProvider.getFINAL_VELOCITY();
						}
					}
				});
		/**
		 * STAGE
		 */
			/**
			 * Give the stage a title
			 */
			primaryStage.setTitle("T-Rex Run");
			/**
			 * Set the scene on the primary stage and show the stage
			 */
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			

		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * RENDER_GUI METHOD
	 * @param World from which to obtain the Game Objects.
	 * @param Pane to which the layers that contain each Game Object will be added.
	 * @return -Pane to which each Game Object has been added.
	 */
	public Pane renderGUI(World w, Pane toAdd)
	{		
		for(GameObject object : w.getGame()) {
			toAdd.getChildren().add(object.getLayer());
		}
		return toAdd;
	}
	
	
	/**
	 * 
	 * @param World w to access the world's ArrayList
	 * @return Pane endScreen that replaces the running game Pane
	 */
	public Pane gameOver(World w) {
		Pane endScreen = new Pane();
		((PlayerGUI) w.getGame().get(0)).end();
		((GroundGUI) w.getGame().get(1)).gameOver();
		Image endImage = new Image(getClass().getResourceAsStream(DataProvider.getGAME_OVER()));
		ImageView end = new ImageView(endImage);
		//Want the 'GAME OVER' to be perfectly centered
		end.setX(DataProvider.getWINDOW_WIDTH()/2 - endImage.getWidth()/2);
		end.setY(DataProvider.getWINDOW_HEIGHT()/2 - endImage.getHeight()/2);
		endScreen.getChildren().add(end);
		return endScreen;
	}
	

	/**
	 * MAIN METHOD
	 * Launches the GUIGame Application
	 */
	public static void main(String[] args) {
		launch();		
	}

	/**
	 * GETTER FOR SCENE
	 * @return scene shown on GUIGame stage
	 */
	public static Scene getScene() 
	{
		return scene;
	}

	/**
	 * OVERRIDE FOR KEY LISTENER METHODS
	 */
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
	}
}



