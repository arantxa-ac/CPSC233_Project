package application;
	

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.scene.input.KeyCode;


public class GameApp extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			
			//Prints actions, only for practice----------------------------
			BorderPane labelPane = new BorderPane();
			root.getChildren().add(labelPane);
			Label practiceLabel = new Label("start game");
			labelPane.setTop(practiceLabel);
			//-----------------------------------------------
			
			BorderPane playerPane = new BorderPane();
			root.getChildren().add(playerPane);
			playerPane.setTop(createPlayer());
			
			
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());			
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>()
			{
				@Override
				public void handle(KeyEvent event)
				{
					if (event.getCode() == KeyCode.UP)
						//Prints action only for practice ---------------------
						practiceLabel.setText("Jump");
						//---------------------------------------------------------
						//Later this will call player.jump();
				}
			});
					
			primaryStage.setTitle("T-Rex Run");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Group createPlayer()
	{
		Group playerGroup = new Group();
		return playerGroup;
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	public void stop()
	{
		
	}
}
