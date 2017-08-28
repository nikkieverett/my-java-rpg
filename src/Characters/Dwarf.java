package Characters;

import java.util.ArrayList;

public class Dwarf extends CharacterType {

    public Dwarf(String name){
        super(name);
        this.type = "Characters.Dwarf";

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

    /*
    DESCRIPTION: Dwarves are a short, stocky race; both male
    and female Dwarves stand around four feet tall and
    typically weigh around 120 pounds. Their long hair and
    thick beards are dark brown, gray or black. They take
    great pride in their beards, sometimes braiding or forking
    them. They have a fair to ruddy complexion. Dwarves
    have stout frames and a strong, muscular build. They are
    rugged and resilient, with the capacity to endure great
    hardships. Dwarves are typically practical, stubborn and
    courageous. They can also be introspective, suspicious
    and possessive. They have a lifespan of three to four
    centuries.

    RESTRICTIONS: Dwarves may become Clerics, Fighters, or
    Thieves. They are required to have a minimum
    Constitution of 9. Due to their generally dour dispositions,
    they may not have a Charisma higher than 17. They may
    not employ Large weapons more than four feet in length
    (specifically, two-handed swords, polearms, and
    longbows).

    SPECIAL ABILITIES: All Dwarves have Darkvision with a 60'
    range, and are able to detect slanting passages, traps,
    shifting walls and new construction on a roll of 1-2 on 1d6;
    a search must be performed before this roll may be made

    SAVING THROWS: Dwarves save at +4 vs. Death Ray or
    Poison, Magic Wands, Paralysis or Petrify, and Spells, and
    at +3 vs. Dragon Breath.
    */

}