public class Projectile {
    private int width = 20;
    private int height = 40;
    private String color = "BLACK";
    // The rectangle, used for collision and other physics
    private Rectangle body;
    // This is just a visual representation of an object
    private Rectangle[] texture;
    private boolean hasTexture;
    public Projectile(int x, int y, int width, int height, boolean hasTexture)
    {
        this.width = width;
        this.height = height;
        this.hasTexture = hasTexture;

        // If no texture, just create a rectangle
        if (!this.hasTexture)
        {

        }
    }
}
