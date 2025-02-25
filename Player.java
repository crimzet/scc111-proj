public class Player 
{
    private int hp;
    private int width = 20;
    private int height = 40;
    private String color = "RED";
    private Rectangle body;

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
        this.body.setXPosition((double)x + this.body.getXPosition());
        this.body.setYPosition((double)y + this.body.getYPosition());
    }
    public void addTo(GameArena arena)
    {
        arena.addRectangle(body);
    }
    public Player(int hp, int x, int y) 
    {
        this.hp = hp;

        // creat body
        this.body = new Rectangle(x, y, width, height, color);
    }
}
