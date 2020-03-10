package finalproject;
import java.util.Timer;
import java.util.TimerTask;
public class gameloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		TimeLoop.setFramerate(2000);
		TimeLoop.setStartdelay(0);
		timer.scheduleAtFixedRate(new GameProgress(),TimeLoop.getStartdelay(),TimeLoop.getFramerate());
	}

}
