package Characters;


import java.util.ArrayList;

public class Halfling extends CharacterType {

    public Halfling(String name){
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
    /*DESCRIPTION: Halflings are small, slightly stocky folk who
    stand around three feet tall and weigh about 60 pounds.
    They have curly brown hair on their heads and feet, but
    rarely have facial hair. They are usually fair skinned, often
    with ruddy cheeks. Halflings are remarkably rugged for
    their small size. They are dexterous and nimble, capable
    of moving quietly and remaining very still. They usually
    go barefoot. Halflings are typically outgoing, unassuming
    and good-natured. They live about a hundred years.

    RESTRICTIONS: Halflings may become Clerics, Fighters or
    Thieves. They are required to have a minimum Dexterity
    of 9. Due to their small stature, they may not have a
    Strength higher than 17. Halflings never roll larger than
    six-sided dice (d6) for hit points regardless of class.
    Halflings may not use Large weapons, and must wield
    Medium weapons with both hands.

    SPECIAL ABILITIES: Halflings are unusually accurate with all
    sorts of ranged weapons, gaining a +1 attack bonus when
    employing them. When attacked in melee by creatures
    larger than man-sized, Halflings gain a +2 bonus to their
    Armor Class. Halflings are quick-witted, thus adding +1 to
    Initiative die rolls. Outdoors in their preferred forest
    terrain, they are able to hide very effectively; so long as
    they remain still there is only a 10% chance they will be
    detected. Even indoors, in dungeons or in non-preferred
    terrain they are able to hide such that there is only a 30%
    chance of detection. Note that a Halfling Thief will roll
    only once, using either the Thief ability or the Halfling
    ability, whichever is better.

    SAVING THROWSs: Halflings save at +4 vs. Death Ray or
    Poison, Magic Wands, Paralysis or Petrify, and Spells, and
    at +3 vs. Dragon Breath.*/

}
