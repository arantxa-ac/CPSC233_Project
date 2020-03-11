import java.util.TimerTask;
import java.util.Scanner;
import java.util.Timer;
public class GameProgress extends TimerTask {
	Scanner userInput = new Scanner(System.in);
	private static World w = new World();
	private Timer inputtimer = new Timer();
	@Override
	public void run() {
		if (w.keepRunning() == true) {
			w.worldPrint();
			w.worldShiftOne();
			inputtimer.scheduleAtFixedRate(new InputClass(), TimeLoop.getStartdelay(),TimeLoop.getFramerate());
		}
		
		else {
			//stop timer here
			System.out.print(w.keepRunning());
		}
		//System.out.println(InputClass.isJumping());
		InputClass.setJumping(false);
		
		/**
		w.worldPrint();
		w.worldShiftOne();
		inputtimer.scheduleAtFixedRate(new InputClass(), TimeLoop.getStartdelay(),TimeLoop.getFramerate());
		*/
	}

}
