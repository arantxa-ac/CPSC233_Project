# CPSC233 - T08G04
This is an animation based project in which two users are able to play the T-Rex Run game. This is runner game in which the user is a dinosaur that must avoid obtacles by jumping. If the dinosaur hits an obtacle, the game ends.

The final version of this project can be found in the master branch of this repository.

To run the application you can use Eclipse or the command line.

# Running T-Rex Run on Eclipse
In order to run the program in Eclipse:

1) Download all the classes and the Sprites folder where the images for objects in the game are located from master branch.
2) Import the files into Eclipse.
3) Download and setup javafx in Eclipse for the game to run properly.
4) Make sure that sprite images are inside a folder called **Sprites** located in the same package as all other classes.
5) Run the **GUIGame** class.

In order to play the game use *space bar* or *up arrow key* to jump when an obstacle approaches.
Once the game is over, to play again run **GUIGame** class.
The progress of the game will be printed to the console in Eclipse in a text version.

# Running T-Rex Run on the Command Line
In order to run the program using the command line:

1) Download all the classes and the Sprites folder where the images for objects in the game are located from master branch.
2) Download javafx
3) Make sure that sprite images are inside a folder called **Sprites** located in the same package as all other classes.
4) Compile the **GUIGame** class as follows
```bash
javac -cp "<Path where javafx is installed>" GUIGame.java
```
...Note that the javafx path must lead to the jfxrt.jar file. For example:
```bash
javac -cp "C:\Program Files\Oracle\JavaFX 2.0 SDK\rt\lib\jfxrt.jar" GUIGame.java
```

In order to play the game use *space bar* or *up arrow key* to jump when an obstacle approaches.
Once the game is over, to play again run **GUIGame** class.
The progress of the game will be printed to the console in Eclipse in a text version.
