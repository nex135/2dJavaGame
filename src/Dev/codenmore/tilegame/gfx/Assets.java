package Dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

import Dev.codenmore.tilegame.gfx.ImageLoader;
import Dev.codenmore.tilegame.gfx.SpriteSheet;

public class Assets {
	
	public static BufferedImage x, o;
	public static final int width = 40, height = 40;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/xosprite.png"));
		x = sheet.crop(0, 0, width, height);
		o = sheet.crop(width, 0, width, height);
	}

}
