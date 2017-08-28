import Characters.DarkElf;
import Characters.Dwarf;
import Characters.Halfling;
import Characters.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //how many players?

        chooseCharacter();
        //chooseOpponent
        //create game instance
        //Game game = new Game(nikki, eric);
        //play game
        //game.play();
        //attack roll
        //roll dice

    }

    public static void chooseCharacter(){
        Scanner scanner = new Scanner(System.in);
        String newCharacterType;
        String newCharacterName;

        System.out.println("What type of character would you like to be?");
        System.out.println("Choose one: Dwarf, Dark Elf, Halfling, or Human");
        newCharacterType = scanner.nextLine();

        if (newCharacterType.equals("Dwarf") || newCharacterType.equals("dwarf")) {
            System.out.println("What is your character's name?");
            newCharacterName = scanner.nextLine();
            Dwarf newPlayer = new Dwarf(newCharacterName);
            System.out.println("Welcome " + newCharacterName + " the " + newCharacterType + ", here is your character profile:");
            newPlayer.printCharacterInfo();

        } else if (newCharacterType.equals("Dark Elf") || newCharacterType.equals("dark elf") || newCharacterType.equals("Dark elf")) {
            System.out.println("What is your character's name?");
            newCharacterName = scanner.nextLine();
            DarkElf newPlayer = new DarkElf(newCharacterName);
            System.out.println("Welcome " + newCharacterName + " the " + newCharacterType + ", here is your character profile:");
            newPlayer.printCharacterInfo();


        } else if (newCharacterType.equals("Halfling")  || newCharacterType.equals("halfling") ) {
            System.out.println("What is your character's name?");
            newCharacterName = scanner.nextLine();
            Halfling newPlayer = new Halfling(newCharacterName);
            System.out.println("Welcome " + newCharacterName + " the " + newCharacterType + ", here is your character profile:");
            newPlayer.printCharacterInfo();


        } else if (newCharacterType.equals("Human")  || newCharacterType.equals("human")) {
            System.out.println("What is your character's name?");
            newCharacterName = scanner.nextLine();
            Human newPlayer = new Human(newCharacterName);
            System.out.println("Welcome " + newCharacterName + " the " + newCharacterType + ", here is your character profile:");
            newPlayer.printCharacterInfo();


        } else {
            System.out.println("You must have entered something incorrectly.. Please choose one of the following options..");
            chooseCharacter();
        }

    }
}
