package Characters;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class CharacterType {

    //---------------------------------GERNERAL CHARCTER TRAITS
    protected String name;
    protected Integer experiencePoints;
    protected Integer xpNeeded;
    protected Integer hitPoints;
    protected Integer wounds;
    protected Integer level;
    protected String type;

    //---------------------------------CHARACTER SKILL POINTS
    //attack, damage, open doors
    protected Integer strength;
    //strength + class bonus
    protected Integer attackBonus;
    //languages
    protected Integer intelligence;
    //saving throws and spells
    protected Integer wisdom;
    //missile attack roll and ac adjustment
    protected Integer dexterity;
    //hit points per level
    protected Integer constitution;
    //reaction adjustment
    protected Integer charisma;

    //--------------------------------ARMOR CLASS
    protected ArrayList<String> inventory;

    //--------------------------------SPELLS
    protected ArrayList<String> spells;

    public CharacterType(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.level = 1;
    }

    public void printCharacterInfo(){
        System.out.println("--------------------BEGIN STATS-------------------");
        System.out.println(this.name + " the " + this.type);
        System.out.println("");
        System.out.println("XP: " + this.experiencePoints);
        System.out.println("XP points needed for level up: " + this.xpNeeded);
        System.out.println("Level: " + this.level);
        System.out.println("");
        System.out.println("HP: " + this.hitPoints);
        System.out.println("Number of wounds: " + this.wounds);
        System.out.println("");
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Wisdom: " + this.wisdom);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Constitution: " + this.constitution);
        System.out.println("Charisma: " + this.charisma);
        System.out.println("");
        System.out.println("Inventory List: " + this.inventory);
        System.out.println("Spells List: " + this.spells);
        System.out.println("---------------------END STATS--------------------");
    }
}





    //character race:
    //  dwarf - 22, 16, 25, 12, 25
    //  ogre - 30, 15, 25, 15, 15
    //  barbarian - 25, 20, 25, 12, 18
    //  human - 20, 20, 20, 20, 20

    //character class:
    // cleric -
//      level // exp points // hit dice //
//        1 0 1d6 - - - - - -
//        2 1,500 2d6 1 - - - - -
//        3 3,000 3d6 2 - - - - -
//        4 6,000 4d6 2 1 - - - -
//        5 12,000 5d6 2 2 - - - -
//        6 24,000 6d6 2 2 1 - - -
//        7 48,000 7d6 3 2 2 - - -
//        8 90,000 8d6 3 2 2 1 - -
//        9 180,000 9d6 3 3 2 2 - -
//        10 270,000 9d6+1 3 3 2 2 1 -
//        11 360,000 9d6+2 4 3 3 2 2 -
//        12 450,000 9d6+3 4 4 3 2 2 1
//        13 540,000 9d6+4 4 4 3 3 2 2
//        14 630,000 9d6+5 4 4 4 3 2 2
//        15 720,000 9d6+6 4 4 4 3 3 2
//        16 810,000 9d6+7 5 4 4 3 3 2
//        17 900,000 9d6+8 5 5 4 3 3 2
//        18 990,000 9d6+9 5 5 4 4 3 3
//        19 1,080,000 9d6+10 6 5 4 4 3 3
//        20 1,170,000 9d6+11 6 5 5 4 3 3

    // fighter -
//        1 0 1d8
//        2 2,000 2d8
//        3 4,000 3d8
//        4 8,000 4d8
//        5 16,000 5d8
//        6 32,000 6d8
//        7 64,000 7d8
//        8 120,000 8d8
//        9 240,000 9d8
//        10 360,000 9d8+2
//        11 480,000 9d8+4
//        12 600,000 9d8+6
//        13 720,000 9d8+8
//        14 840,000 9d8+10
//        15 960,000 9d8+12
//        16 1,080,000 9d8+14
//        17 1,200,000 9d8+16
//        18 1,320,000 9d8+18
//        19 1,440,000 9d8+20
//        20 1,560,000 9d8+22

    // magic-user -
//            1 0 1d4 1 - - - - -
//            2 2,500 2d4 2 - - - - -
//            3 5,000 3d4 2 1 - - - -
//            4 10,000 4d4 2 2 - - - -
//            5 20,000 5d4 2 2 1 - - -
//            6 40,000 6d4 3 2 2 - - -
//            7 80,000 7d4 3 2 2 1 - -
//            8 150,000 8d4 3 3 2 2 - -
//            9 300,000 9d4 3 3 2 2 1 -
//            10 450,000 9d4+1 4 3 3 2 2 -
//            11 600,000 9d4+2 4 4 3 2 2 1
//            12 750,000 9d4+3 4 4 3 3 2 2
//            13 900,000 9d4+4 4 4 4 3 2 2
//            14 1,050,000 9d4+5 4 4 4 3 3 2
//            15 1,200,000 9d4+6 5 4 4 3 3 2
//            16 1,350,000 9d4+7 5 5 4 3 3 2
//            17 1,500,000 9d4+8 5 5 4 4 3 3
//            18 1,650,000 9d4+9 6 5 4 4 3 3
//            19 1,800,000 9d4+10 6 5 5 4 3 3
//            20 1,950,000 9d4+11 6 5 5 4 4 3

    // thief -
//            1 0 1d4
//            2 1,250 2d4
//            3 2,500 3d4
//            4 5,000 4d4
//            5 10,000 5d4
//            6 20,000 6d4
//            7 40,000 7d4
//            8 75,000 8d4
//            9 150,000 9d4
//            10 225,000 9d4+2
//            11 300,000 9d4+4
//            12 375,000 9d4+6
//            13 450,000 9d4+8
//            14 525,000 9d4+10
//            15 600,000 9d4+12
//            16 675,000 9d4+14
//            17 750,000 9d4+16
//            18 825,000 9d4+18
//            19 900,000 9d4+20
//            20 975,000 9d4+22

//}