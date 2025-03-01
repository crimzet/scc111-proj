public class Projectile {
    private int width = 20;
    private int height = 40;
    private String color = "RED";
    // The rectangle, used for collision and other physics
    private Rectangle body;
    // This is just a visual representation of an object
    private int layer=0;
    private Rectangle[] texture;
    private boolean hasTexture;
    /**
	 * Obtains the layer of this projectile.
	 * @return the layer of this projectile.
	 */
	public int getLayer()
	{
		return layer;
	}
    public Projectile(int x, int y, int width, int height, boolean hasTexture, int layer)
    {
        this.width = width;
        this.height = height;
        this.hasTexture = hasTexture;
        this.layer=layer;

        // If no texture, just create a rectangle
        if (!this.hasTexture)
        {

        }
    }
}
