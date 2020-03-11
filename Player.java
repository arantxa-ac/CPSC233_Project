public class Player {
		// Variable declaration 
		private int X;
		private int Y;
		private String Input;
		
		//This method gets the jump input, if the input is euqals to character j then it returns true, else false
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
			// Will need to do duck mechanics -- what does this look like
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
			int originalHeight = 0;
			double maxHeight = 100.0;
			double jumpY = getY();
			
			while (jumpY != maxHeight) {
				jumpY = getY() + 0.01;
			}
	
			while (jumpY != originalHeight) {
				jumpY = getY() - 0.01;
			}
		}

		//Getter function for x coordinate
		public int getX() {
			return X;
		}

		//Setter function for x coordinate
		public void setX(int x) {
			X = x;
		}
		
		//This is the getter function for the Y coordinate
		public int getY() {
			return Y;
		}

		//This is the setter function for the y coordinate 
		public void setY(int y) {
			Y = y;
		}

		//This is the getter function for the input 
		public String getInput() {
			return Input;
		}

		//This is the setter for the input 
		//When implemented with FX this will be a keylistener input
		public void setInput(String input) {
			this.Input = input;
		}

}
