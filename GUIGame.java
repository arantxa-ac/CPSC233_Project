import javax.management.ObjectName;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;



public class GUIGame extends Application {
	
	static Scene scene;
	
	@Override
	public void start(Stage primaryStage) {		
		try {
			 Pane root = new Pane();
			 
			 Pane layers = new Pane();
			 
//			 World world = new World();
			 root.getChildren().add(renderGUI(layers));
			 
			scene = new Scene(root,DataProvider.getWINDOW_WIDTH(),DataProvider.getWINDOW_HEIGHT());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
	
	public Pane renderGUI(Pane toAdd)
	{
//		Ground ground = new Ground();
//		toAdd.getChildren().add(ground.getLayer());
		PlayerGUI player = new PlayerGUI();
		toAdd.getChildren().add(player.getLayer());
//		world.getGame().forEach((object)-> toAdd.getChildren().add(object.getLayer()));
		return toAdd;
	}
	
	public static void main(String[] args) {
		launch();		
//		while(!player.checkCollision())
//		{
//			player.processInput(getScene());
//			world.update();
//			renderGUI(world);
//		}
	}

	public static Scene getScene() 
	{
		return scene;
	}
}
