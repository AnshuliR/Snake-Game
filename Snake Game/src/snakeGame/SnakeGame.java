package snakeGame;

import javax.swing.*;

public class SnakeGame extends JFrame {
	
	SnakeGame(){
		
		//super is used to call the constructor of the parent class. Here, it is also used to give the title.
		super("Snake Game");
		//To provide size
		setSize(400,400);
		
		//setLocation(700,300);
		//To make it center
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		//Object of the class
		new SnakeGame();
		
	}
}
