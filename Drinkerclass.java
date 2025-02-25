public class Drinkerclass
{
    public static void runControls(GameArena arena, Player player, int speed)
    {
        if (arena.letterPressed('w'))
        {
            player.move(0, -speed);
        }
        if (arena.letterPressed('a'))
        {
            player.move(-speed, 0);
        }
        if (arena.letterPressed('s'))
        {
            player.move(0, speed);
        }
        if (arena.letterPressed('d'))
        {
            player.move(speed, 0);
        }
    }
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 300);

        Player player = new Player(10, 250, 150);
        player.addTo(arena);

        // Main loop
        while(true)
        {
            runControls(arena, player, 2);
            arena.pause();
            arena.clearGameArena();
            player.addTo(arena);
        }
    }
}