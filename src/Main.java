public class Main {

    public static void main(String[] args) {
        //create player instances
        Player nikki = new Player("Nikki", 100);
        Player eric = new Player("Eric", 100);

        //create game instance
        Game game = new Game (nikki, eric);

        //play game
        game.play();
    }
}

//choose character
//attack roll
//roll dice

//  dwarf - 22, 16, 25, 12, 25
//  high elf - 10, 22, 15, 23, 30
//  ogre - 30, 15, 25, 15, 15
//  barbarian - 25, 20, 25, 12, 18
//  human - 20, 20, 20, 20, 20