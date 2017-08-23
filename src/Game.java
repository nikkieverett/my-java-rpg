public class Game {
    private Player player1;
    private Player player2;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        System.out.println("Creating a new game between" + player1.getName() + " and " + player2.getName());
    }

    public void play(){

        Dice sixSidedDie = new Dice(6);
        Integer damageDealt;

        //game event loop
        while(player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0){

            //get damage player 1 dealt to player 2
            damageDealt = sixSidedDie.roll();
            //print damage dealt
            System.out.println(player1.getName() + " has caused " + player2.getName() + " " + damageDealt + " points of damage.");
            //remove damage points from player one hp
            player2.hit(damageDealt);


            //get damage player 2 dealt to player 1
            damageDealt = sixSidedDie.roll();
            //print damage dealt
            System.out.println(player2.getName() + " has caused " + player1.getName() + " " + damageDealt + " points of damage.");
            //remove damage points from player one hp
            player1.hit(damageDealt);
        }

        //someone died so print the results
        System.out.println("Game finished:");
        System.out.println(player1.getName() + " has " + player1.getHealthPoints() + " hp");
        System.out.println(player2.getName() + " has " + player2.getHealthPoints() + " hp");

        if(player1.getHealthPoints() > 0){
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

}
