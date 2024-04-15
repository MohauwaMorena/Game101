import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas{
	
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	static final String Title = "Game101";

	
	public static void main(String[]args) {
		
		JFrame frame = new JFrame(Title);

		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
}
