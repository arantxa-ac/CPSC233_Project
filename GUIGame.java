import java.awt.event.KeyListener;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;



public class GUIGame extends Application implements KeyListener {
	

	static Scene scene;
	
	//Override of start method.
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
					World.update();
					root.getChildren().clear();
					layers.getChildren().clear(); 
					root.getChildren().add(renderGUI(world, layers));
			
//				}
			 
					
		//SCENE
			scene = new Scene(root,DataProvider.getWINDOW_WIDTH(),DataProvider.getWINDOW_HEIGHT());
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		//EVENT HANDLER: If up arrow key is pressed then player must jump.
			 scene.setOnKeyPressed(new EventHandler<KeyEvent>()
				{
					@Override
					public void handle(KeyEvent event)
					{
						if (event.getCode() == KeyCode.UP && (player.getY() == 199 || player.getY() == 200))
						{
							
							player.jump();
							player.setY(200);
							player.velocityinital = 125;
						
						}
					}
				});
		//STAGE
			//Give the stage a title.
			primaryStage.setTitle("T-Rex Run");
			//Set the scene on primary stage and show stage.
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//RENDER_GUI METHOD	
	//Parameters:
	//	-World from which to obtain the Game Objects.
	//	-Pane to which the layers that contain each Game Object will be added.
	//	-PlayerGUI that will be added to the Pane.
	//Returns:
	//	-Pane to which each Game Object has been added.
	public Pane renderGUI(World w, Pane toAdd)
	{		
		for(GameObject object : w.getGame()) {
			toAdd.getChildren().add(object.getLayer());
		}
		return toAdd;
	}
	
	
	//MAIN METHOD
	//Launches the GUIGame Application
	public static void main(String[] args) {
		launch();		
	}

	//GETTER FOR SCENE
	//Returns:
	//	-Scene shown on GUIGame stage
	public static Scene getScene() 
	{
		return scene;
	}

	//OVERRIDE FOR KEY LISTENER METHODS
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
