public class Drinkerclass
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 300);

        Player player = new Player(10, 250, 150);
        player.addTo(arena);

        // Main loop
        while(true)
        {
            if (arena.letterPressed('a'))
            {
                player.move(-1, 0);
                //System.out.println(player.getX());
            }
            arena.pause();
            arena.clearGameArena();
            player.addTo(arena);
        }
    }
}