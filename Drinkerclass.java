public class Drinkerclass
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 500);
        //arena.setBackgroundImage("/home/martz/h-drive/png-clipart-dota-2-ogre-mage-magi-the-labyrinth-of-magic-hero-hero-fictional-characters-manga-thumbnail.png");
        Player player = new Player(10, 250, 250);
        player.addTo(arena);

        // Main loop
        while(true)
        {
            player.runControls(arena, player, 2);
            arena.pause();
            arena.clearGameArena();
            player.addTo(arena);
        }
    }
}