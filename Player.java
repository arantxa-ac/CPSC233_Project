import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Player {
	private int X;
	private int Y;
	private KeyEvent Input;
	
	public boolean getJumpInput()
	{
		if (getInput().getKeyCode() == 38)
			return true;
		else
			return false;
	}
	
	public void duck()
	{
		// Will need to do duck mechanics -- what does this look like for the demo?
	}

	public boolean getDuckInput()
	{
		if (getInput().getKeyCode() == 38)
			return true;
		else
			return false;
	}
	
	public void jump()
	{
		// Will need to do jump mechanics -- what does this look like for the demo?
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public KeyEvent getInput() {
		return Input;
	}

	public void setInput(KeyEvent input) {
		Input = input;
	}

}
