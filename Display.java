import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
	
	static int WIDTH = 800;
	static int HEIGHT = 600;
	final static String title = "More Fire ver 1.1";

	Thread thread;
	static boolean running = false;


	public void run(){

	}

	public void start(){
		if(running == true){
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
		System.out.println("Game is running");

	}

	public void stop(){
		if(running == false){
			return;
		}

		running = false;
		try{
			thread.join();
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Game has ended");

	}



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

		game.start();


	}
	
}
