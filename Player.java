import java.awt.event.KeyEvent;

public class Player {
	private int X;
	private int Y;
	private KeyEvent Input;
	
	public boolean getJumpInput(KeyEvent e)
	{
		if (e.getKeyCode() == 38 || e.getKeyCode() == 32)
			return true;
		else
			return false;
	}
	
	public String duck()
	{
		return "Duck";
	}

	public boolean getDuckInput(KeyEvent e)
	{
		if (e.getKeyCode() == 38)
			return true;
		else
			return false;
	}
	
	public String jump()
	{
		return "Jump";
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
