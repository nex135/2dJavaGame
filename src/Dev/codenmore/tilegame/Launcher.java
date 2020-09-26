package Dev.codenmore.tilegame;

import Dev.codenmore.display.Display;

public class Launcher {
	
	public static void main(String[] args) {
		Game game = new Game ("Tile Game", 800, 600);
		game.start();
	}
	
}
