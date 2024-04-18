import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas{
	
	static int WIDTH = 800;
	static int HEIGHT = 600;
	final static String title = "More Fire ver 1.1";

	public static void main(String[]args){
		Display game = new Display();
		JFrame frame = new JFrame();

		frame.add(game);
		frame.setSize(WIDTH,HEIGHT);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);


	}
	
}
