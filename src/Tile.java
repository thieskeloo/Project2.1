import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {


    //Static Stuff
    //Those are the tiles we have for now and that can be used
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile sandTile = new SandTile(1);
    public static Tile waterTile = new WaterTile(2);


    //CLASS
    public static final int TILE_WIDTH=16,TILE_HEIGHT=16;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {    //the constructor takes an img and int  which are further used to define a tile
        this.texture=texture;
        this.id=id;

        tiles[id]= this;
    }

    public int getId() {
        return id;
    }

    public void tick() {

    }

    public void render(Graphics g,int x , int y) {
        g.drawImage(texture,x,y,TILE_WIDTH,TILE_HEIGHT,null);
    }

    public boolean isSolid() {   //That is a method that will check for the collision afterwards.
        return false;
    }

}
