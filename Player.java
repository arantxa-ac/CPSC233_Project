
public class Player {
	private int X;
	private int Y;
	private String Input;
	
	public boolean getJumpInput()
	{
		if (getInput().equals("j"))
			return true;
		else
			return false;
	}
	
	//duck not needed yet for the first demo
	/*public void duck()
	{
		// Will need to do duck mechanics -- what does this look like for the demo?
	}

	public boolean getDuckInput()
	{
		if (getInput().equals("d"))
			return true;
		else
			return false;
	}*/
	
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

	public String getInput() {
		return Input;
	}

	public void setInput(String input) {
		this.Input = input;
	}

}
