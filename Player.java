public class Player 
{
    private int hp;
    private int x;
    private int y;
    private int width = 20;
    private int height = 40;
    private String color = "RED";
    private Rectangle body;

    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }
    public void addTo(GameArena arena)
    {
        arena.addRectangle(body);
    }
    public Player(int hp, int x, int y) 
    {
        this.hp = hp;
        this.x = x;
        this.y = y;

        // creat body
        this.body = new Rectangle(x, y, width, height, color);
    }
}
