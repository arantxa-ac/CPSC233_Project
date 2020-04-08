import java.awt.event.KeyListener;
import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;


public class GUIGame extends Application implements KeyListener {
	

	static Scene scene;
	
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
			 		Label scoreLabel = new Label();
					root.getChildren().add(scoreLabel);
					
					ScoreManager game = new ScoreManager();
					game.start();
					Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.0001), ev -> {
					scoreLabel.setText("Score: " + game.gettime());
					
					}));
					timeline.setCycleCount(Animation.INDEFINITE);
				    	timeline.play();
					
					Timeline timeline2 = new Timeline(new KeyFrame(Duration.seconds(0.5), ev -> {
					ObstacleGUI gui = new ObstacleGUI().generate();
					if (gui != null)
					{
					root.getChildren().add(gui.getLayer());
					}
					
					}));
					timeline2.setCycleCount(Animation.INDEFINITE);
				    	timeline2.play();
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
			
			if (player.checkCollision(world))
				System.out.println(player.checkCollision(world));
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

