public class Drinkerclass
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 300);

        Player player = new Player(10, 250, 150);
        player.addTo(arena);

        while(true)
        {
            arena.pause();
        }
    }
}