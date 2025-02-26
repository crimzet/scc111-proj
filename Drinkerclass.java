public class Drinkerclass
{
    public static void runControls(GameArena arena, Player player, int speed)
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
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 300);
        arena.setBackgroundImage("/home/martz/h-drive/png-clipart-dota-2-ogre-mage-magi-the-labyrinth-of-magic-hero-hero-fictional-characters-manga-thumbnail.png");
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