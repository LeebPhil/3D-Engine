import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class Texture {
    int[] pixels;
    private String loc;
    final int SIZE;

    Texture(String location, int size) {
        loc = location;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        load();
    }

    /**
     * Loads 4 different .png
     */
    private void load() {
        try {
            BufferedImage image = ImageIO.read(new File(loc));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //static Texture wood = new Texture("resources/wood.png", 64);
    //static Texture brick = new Texture("resources/redbrick.png", 64);
    //static Texture bluestone = new Texture("resources/bluestone.png", 64);
    //static Texture stone = new Texture("resources/greystone.png", 64);
    static Texture wood = new Texture("resources/steam.png", 64);
    static Texture brick = new Texture("resources/turtok.png", 64);
    static Texture bluestone = new Texture("resources/winnie.png", 64);
    static Texture stone = new Texture("resources/csgo.png", 64);
}

