public class Player 
{
    private int hp;
    private int width = 20;
    private int height = 40;
    private String color = "BLACK";
    // The rectangle, used for collision and other physics
    private Rectangle body;
    // This is just a visual representation of a bottle
    private Rectangle[] texture;

    public int getX()
    {
        return (int)this.body.getXPosition();
    }
    public int getY()
    {
        return (int)this.body.getYPosition();
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void move(int x, int y)
    {
        // Normalize the movement in 2D
        // If the player moves diagonally, they move faster, as both x and y are changed
        if (x != 0 && y != 0)
        {
            double factor = Math.sqrt(0.5);
            x *= factor;
            y *= factor;
        }
        // Change the main body position
        this.body.setXPosition((double)x + this.body.getXPosition());
        this.body.setYPosition((double)y + this.body.getYPosition());
        // Change position of every square in the bottle
        for (Rectangle a : this.texture)
        {
            a.setXPosition((double)x + a.getXPosition());
            a.setYPosition((double)y + a.getYPosition());
        }
    }
    public void addTo(GameArena arena)
    {
        // Add the main body to the arena
        arena.addRectangle(body);
        // Add every square that makes up the bottle to the arena
        for (Rectangle a : this.texture)
        {
            arena.addRectangle(a);
        }
    }
    public void runControls(GameArena arena, Player player, int speed)
    {
        if (arena.letterPressed('w'))
        {
            if (player.getY()!=0){
                player.move(0, -speed);
            }
        }
        if (arena.letterPressed('a'))
        {
            if (player.getX()!=0){
                player.move(-speed, 0);
            }
        }
        if (arena.letterPressed('s'))
        {
            if (player.getY()!=arena.getArenaHeight()-player.getHeight()){
                player.move(0, speed);
            }
            
        }
        if (arena.letterPressed('d'))
        {
            if (player.getX()!=arena.getArenaWidth()-player.getWidth()){
                player.move(speed, 0);
            }
            
        }
    }
    public Player(int hp, int x, int y) 
    {
        this.hp = hp;

        // create body
        this.body = new Rectangle(x, y, width, height, color);
        // create an array of rectangles that makes it look like a bottle
        this.texture = new Rectangle[] { new Rectangle(x, y+17, width, 23, "RED"), new Rectangle(x+6, y+5, 8, 12, "YELLOW"), new Rectangle(x+3, y, 14, 5, "PINK") };
    }
}
