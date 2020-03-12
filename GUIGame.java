import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class GUIGame extends Application {
	
	static Scene scene;
	Stage primaryStage;
	Pane root;
	World world = new World();
	PlayerGUI player = new PlayerGUI();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new Pane();
			
			//Add player, ground and obstacle layers.
			root.getChildren().add(player.getLayer(player));
			root.getChildren().add(world.obstacle.getLayer());
			root.getChildren().add(world.ground.getLayer());
			
			scene = new Scene(root,DataProvider.getWINDOW_WIDTH(),DataProvider.getWINDOW_HEIGHT());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static void renderGUI()
//	{
//		
//	}
	
	public static void main(String[] args) {
		launch();
		while(!player.checkCollision())
		{
			player.processInput(getScene());
			world.update();
			renderGUI();
		}
	}

	public static Scene getScene() 
	{
		return scene;
	}

}
