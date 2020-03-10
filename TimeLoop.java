package finalproject;
import java.util.Timer;
import java.util.TimerTask;

public class TimeLoop {
private static long framerateinmiliseconds;
private static long startdelayinms;

public static long getFramerate() {
	return framerateinmiliseconds;
}
public static void setFramerate(long framerate) {
	framerateinmiliseconds = framerate;
}

public static long getStartdelay() {
	return startdelayinms;
}

public static void setStartdelay(long startdelay) {
	startdelayinms = startdelay;
}

}
