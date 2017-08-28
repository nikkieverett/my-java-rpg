package Characters;


import java.util.ArrayList;

public class Human extends CharacterType {

    public Human(String name){
        super(name);
        this.type = "Characters.Human";

        this.strength = 10;
        this.intelligence = 22;
        this.wisdom = 15;
        this.dexterity = 23;
        this.constitution = 12;

        this.spells = null;

        this.inventory = new ArrayList<>();
        this.inventory.add("Heavy Extras.Armor");
        this.inventory.add("One-Handed Battle Axe");
    }
    /*DESCRIPTION: Humans come in a broad variety of shapes
    and sizes; the Game Master must decide what sorts of
    Humans live in the game world. An average Human male
    in good health stands around six feet tall and weighs about
    175 pounds. Most Humans live around 75 years.

    RESTRICTIONS: Humans may be any single class. They
    have no minimum or maximum ability score requirements.

    SPECIAL ABILITIES: Humans learn unusually quickly,
    gaining a bonus of 10% to all experience points earned.

    SAVING THROWS: Humans are the “standard,” and thus
    have no saving throw bonuses.*/
}